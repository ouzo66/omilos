package net.venos.omilos.profile.services;

import javax.validation.Valid;

import net.venos.omilos.profile.repositories.ProfileRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import net.venos.omilos.profile.domain.Profile;
import net.venos.omilos.profile.feign.AuthClient;
import net.venos.omilos.profile.forms.ProfileForm;
import com.naturalprogrammer.spring.lemon.commons.security.UserDto;
import com.naturalprogrammer.spring.lemon.commons.util.LecUtils;
import com.naturalprogrammer.spring.lemon.commonsweb.util.LecwUtils;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Validated
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class ProfileService {
	
	private static final Log log = LogFactory.getLog(ProfileService.class);
	private ProfileRepository profileRepository;
	private AuthClient authClient;
	
	@PreAuthorize("isAuthenticated()")
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public Profile upsertProfile(@Valid ProfileForm form) {
		
		UserDto user = LecwUtils.currentUser();
		LecUtils.ensureAuthority(user.isGoodAdmin() || user.getId().equals(
				form.getUserId().toString()),
				"com.naturalprogrammer.spring.notGoodAdminOrSameUser");
		
		validateUserExists(form.getUserId());
		
		return profileRepository.findByUserId(form.getUserId())
				.map(profile -> updateProfile(profile, form))
				.orElse(createProfile(form));
	}

	
	private void validateUserExists(Long userId) {
		authClient.fetchUserById(userId); // Will relay the 404 exception if user is not found in Auth service
	}

	private Profile updateProfile(Profile profile, ProfileForm form) {

		profile.setWebsite(form.getWebsite());
		profile.setAbout(form.getAbout());
		
		return profileRepository.save(profile);
	}

	private Profile createProfile(ProfileForm form) {

		Profile profile = new Profile();
		profile.setUserId(form.getUserId());
		profile.setWebsite(form.getWebsite());
		profile.setAbout(form.getAbout());
		
		return profileRepository.save(profile);
	}	
}
