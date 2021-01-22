package br.paduan.projFinal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.paduan.projFinal.model.Comunidade;
import br.paduan.projFinal.model.Usuario;

public interface ComunidadeRepo extends CrudRepository<Comunidade, Integer> {
    public List<Comunidade> findByUsuario(Usuario usuario);
}
