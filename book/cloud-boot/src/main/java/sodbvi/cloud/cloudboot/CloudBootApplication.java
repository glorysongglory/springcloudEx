package sodbvi.cloud.cloudboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("sodbvi.cloud.**")
public class CloudBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBootApplication.class, args);
    }

}
