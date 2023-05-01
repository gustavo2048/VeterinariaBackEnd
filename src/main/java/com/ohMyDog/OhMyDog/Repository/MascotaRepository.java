package com.ohMyDog.OhMyDog.Repository;

import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Mascota;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {

}
