package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*SpringApplication app = new SpringApplication(CustomApplication.class);app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));app.run(args);*/