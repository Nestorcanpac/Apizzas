package com.example.Apizzas.Repositories;

import com.example.Apizzas.Model.Entities.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Integer> {

}
