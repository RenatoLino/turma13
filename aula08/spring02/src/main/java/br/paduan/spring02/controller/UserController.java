package br.paduan.spring02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.model.User;
import br.paduan.spring02.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired // injeção de dependência
    private UserRepo repo;

    @GetMapping("/id/{id}")
    public User buscaPorId(@PathVariable int id) { // @PathVariable - vaiável vem na URI
        User user = repo.findById(id).orElse(null);

        return user;
    }
}
