package org.example.projectmongodb.resources;

import org.example.projectmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User ianes = new User("1", "Ianes Carla", "ianes@gmail.com");
        User davi = new User("2","Davi Miguel", "davicunha910@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(ianes, davi));
        return ResponseEntity.ok().body(list);
    }
}
