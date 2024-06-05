package com.example.Apizzas.Repositories;

import com.example.Apizzas.Model.Entities.Empleado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado,Integer> {

    Optional<Empleado> findById(Integer integer);
}
