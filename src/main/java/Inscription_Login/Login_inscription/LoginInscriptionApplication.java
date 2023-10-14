package Inscription_Login.Login_inscription;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@EnableWebMvc
public class LoginInscriptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginInscriptionApplication.class, args);
	}

}
