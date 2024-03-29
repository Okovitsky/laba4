package javacources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("javacources")
public class Runner extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Runner.class, args);
    }
}

