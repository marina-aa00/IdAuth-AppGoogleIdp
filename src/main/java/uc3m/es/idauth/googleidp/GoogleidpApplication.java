package uc3m.es.idauth.googleidp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GoogleidpApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleidpApplication.class, args);
	}

}
