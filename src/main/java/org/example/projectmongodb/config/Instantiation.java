package org.example.projectmongodb.config;

import org.example.projectmongodb.domain.User;
import org.example.projectmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User davi = new User(null, "Davi Miguel", "davi@gmail.com");
        User ianes = new User(null, "Ianes Carla", "ianes@gmail.com");
        User joao = new User(null, "Joao Pedro", "joao@gmail.com");

        userRepository.saveAll(Arrays.asList(davi, ianes, joao));
    }

}
