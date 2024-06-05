package com.example.Apizzas.Repositories;

import com.example.Apizzas.Model.Entities.Direccion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DireccionRepository extends CrudRepository<Direccion,Integer> {


}
