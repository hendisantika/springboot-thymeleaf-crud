package com.hendisantika.springbootthymeleafcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootThymeleafCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootThymeleafCrudApplication.class, args);
    }

}
