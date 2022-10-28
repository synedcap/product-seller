package com.company.prod;

import com.company.prod.Model.Role;
import com.company.prod.Model.User;
import com.company.prod.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class ProdApplication {


    public static void main(String[] args) {
        SpringApplication.run(ProdApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService){

        return args -> {
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_USER"));

            userService.saveUser(new User(null,"Admin", "admin","123456",new ArrayList<User>()));
            userService.saveUser(new User(null,"JonTravolta", "jon","123456",new ArrayList<User>()));

            userService.addRoleToUser("admin","ROLE_ADMIN");
        };
    }




}
