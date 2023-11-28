package ru.education.myproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientApplication {


    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(ClientApplication.class);
        application.setWebApplicationType(WebApplicationType.REACTIVE);
        application.run(args);

    }

}