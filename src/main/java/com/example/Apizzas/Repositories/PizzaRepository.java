package com.example.Apizzas.Repositories;


import com.example.Apizzas.Model.Entities.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza,Integer> {

    Optional<Pizza> findByNombre (String nombre);


}
