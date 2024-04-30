package br.com.nicolas.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nicolas.crud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
