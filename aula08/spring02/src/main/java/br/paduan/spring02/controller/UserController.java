package br.paduan.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.dto.UserDTO;
import br.paduan.spring02.model.User;
import br.paduan.spring02.repository.UserRepo;

@RestController
@RequestMapping("/user")
public class UserController {
    
    @Autowired // injeção de dependência
    private UserRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<User> buscaPorId(@PathVariable int id) { // @PathVariable - vaiável vem na URI
        User user = repo.findById(id).orElse(null);

        if(user != null){
            user.setPassword("*******");
            return ResponseEntity.ok(user); // 200
        }
        return ResponseEntity.notFound().build(); // 404
    }

    @GetMapping("/id2/{id}")
    public ResponseEntity<UserDTO> buscaPorId2(@PathVariable int id) { 
        User user = repo.findById(id).orElse(null);

        if(user != null){
            UserDTO userDto = new UserDTO(user);
            return ResponseEntity.ok(userDto); 
        }
        return ResponseEntity.notFound().build(); 
    }

    @GetMapping("/all")
    public List<User> listarTodos(){
       List<User> lista = (List<User>) repo.findAll();

       return lista;
    }

    @PostMapping("/new")
    public ResponseEntity<User> novoUsuario(@RequestBody User user){
        User newUser = repo.save(user);

        return ResponseEntity.ok(newUser);
    }

    @PostMapping("/update")
    public ResponseEntity<User> atualizaUsuario(@RequestBody User user){
        if(user.getId() > 0) {
            User newUser = repo.save(user);
            return ResponseEntity.ok(newUser);
        }
        return ResponseEntity.status(400).build(); // Bad Request
    }
}
