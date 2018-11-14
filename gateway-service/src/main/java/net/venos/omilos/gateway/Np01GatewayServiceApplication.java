package net.venos.omilos.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import net.venos.omilos.lib.scan.Lib001Configuration;

@SpringBootApplication(scanBasePackageClasses= {
		Np01GatewayServiceApplication.class,
		Lib001Configuration.class
})
@EnableFeignClients
public class Np01GatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Np01GatewayServiceApplication.class, args);
	}
}
