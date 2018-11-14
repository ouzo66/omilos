package net.venos.omilos.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.naturalprogrammer.np01.lib001.scan.Lib001Configuration;

@SpringBootApplication(scanBasePackageClasses= {
		AuthServiceApplication.class,
		Lib001Configuration.class
})
@EnableFeignClients
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}
}
