package br.paduan.spring02.repository;

import org.springframework.data.repository.CrudRepository;

import br.paduan.spring02.model.User;

// CRUD - Create, Read, Update, Delete
public interface UserRepo extends CrudRepository<User, Integer> {

}
