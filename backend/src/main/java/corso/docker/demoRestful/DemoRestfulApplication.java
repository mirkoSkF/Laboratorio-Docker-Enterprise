package corso.docker.demoRestful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestfulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestfulApplication.class, args);
		System.out.println("App in ascolto sulla porta 8095: ");
	}

}
