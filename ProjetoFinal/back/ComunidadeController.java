package br.paduan.projFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.projFinal.model.Comunidade;
import br.paduan.projFinal.model.Usuario;
import br.paduan.projFinal.repository.ComunidadeRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/comunidade")
public class ComunidadeController {
    
    @Autowired
    private ComunidadeRepo repo;

    @PostMapping("/user")
    public List<Comunidade> listarComunidadesPorUsuario(@RequestBody Usuario user){
        List<Comunidade> lista = repo.findByUsuario(user);

/*         for (Comunidade comunidade : lista) {
            comunidade.setModernizacoes(null);
        } */

        return lista;
    }
}
