package net.venos.omilos.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import net.venos.omilos.lib.scan.Lib001Configuration;

@SpringBootApplication(scanBasePackageClasses= {
		ProfileServiceApplication.class,
		Lib001Configuration.class
})
@EnableFeignClients
public class ProfileServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}
}
