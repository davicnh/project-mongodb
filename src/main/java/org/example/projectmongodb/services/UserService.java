package org.example.projectmongodb.services;

import org.example.projectmongodb.domain.User;
import org.example.projectmongodb.dto.UserDTO;
import org.example.projectmongodb.repository.UserRepository;
import org.example.projectmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(String id) {
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void delete (String id) {
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO (UserDTO objDTO) {
        return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());
    }

}
