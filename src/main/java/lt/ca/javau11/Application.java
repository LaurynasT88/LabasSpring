package lt.ca.javau11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ca.javau11")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}