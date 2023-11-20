package spring.azure.demo.maven.springazuredemomaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoMavenApplication {

	@GetMapping("/greetings")
	public String greetings(){
		return "Contratulation!! Your Service is up now!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoMavenApplication.class, args);
	}

}
