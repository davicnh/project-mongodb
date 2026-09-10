package org.example.projectmongodb.services;

import org.example.projectmongodb.domain.Post;
import org.example.projectmongodb.domain.User;
import org.example.projectmongodb.repository.PostRepository;
import org.example.projectmongodb.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository repository;

    public Post findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
