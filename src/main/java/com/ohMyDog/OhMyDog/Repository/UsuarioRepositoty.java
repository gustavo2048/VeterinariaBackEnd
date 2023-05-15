package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Usuario;

public interface UsuarioRepositoty extends CrudRepository<Usuario, Integer>{


}
