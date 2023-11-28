package com.app.marjane_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MarjaneBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarjaneBackendApplication.class, args);


    }
     /*   @Bean
        CommandLineRunner commandLineRunner (ProductRepository productRepository){
            return args -> {
                productRepository.save(new Product(null, "pc3", "dell", 200));
                productRepository.save(new Product(null, "pc4", "dell", 200));


                productRepository.findAll().forEach(p -> {
                    System.out.println(p.getName());
                });
            };
        }*/
    }

