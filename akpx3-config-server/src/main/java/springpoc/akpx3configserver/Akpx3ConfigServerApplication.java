package springpoc.akpx3configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Akpx3ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Akpx3ConfigServerApplication.class, args);
	}

}
