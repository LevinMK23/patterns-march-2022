package com.geekbrains.domainlogic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class DomainLogicApplication {

    public static void main(String[] args) {
        SpringApplication.run(DomainLogicApplication.class, args);

    }

}
