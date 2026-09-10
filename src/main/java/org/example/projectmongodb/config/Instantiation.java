package org.example.projectmongodb.config;

import org.example.projectmongodb.domain.Post;
import org.example.projectmongodb.domain.User;
import org.example.projectmongodb.dto.AuthorDTO;
import org.example.projectmongodb.repository.PostRepository;
import org.example.projectmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User davi = new User(null, "Davi Miguel", "davi@gmail.com");
        User ianes = new User(null, "Ianes Carla", "ianes@gmail.com");
        User joao = new User(null, "Joao Pedro", "joao@gmail.com");

        userRepository.saveAll(Arrays.asList(davi, ianes, joao));

        Post post1 = new Post(null, simpleDateFormat.parse("21/03/2018"), "Partiu viagem!", "Vou viajar para Ouro Preto, abraços!", new AuthorDTO(davi));
        Post post2 = new Post(null, simpleDateFormat.parse("02/06/2022"), "Hoje é meu aniversário", "Faço 17 anos!", new AuthorDTO(davi));

        postRepository.saveAll(Arrays.asList(post1, post2));
    }

}
