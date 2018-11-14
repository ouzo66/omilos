package net.venos.omilos.profile.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.venos.omilos.profile.domain.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {

	Optional<Profile> findByUserId(Long userId);
}
