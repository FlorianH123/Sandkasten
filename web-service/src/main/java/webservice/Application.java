package webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import webservice.component.PlaygroundService;

@SpringBootApplication
public class Application implements CommandLineRunner {
	private final PlaygroundService playgroundService;

	@Autowired
	public Application(PlaygroundService playgroundService) {
		this.playgroundService = playgroundService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) {
		playgroundService.test();
	}
}
