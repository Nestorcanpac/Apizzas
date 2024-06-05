package com.example.Apizzas.RestControllers;


import com.example.Apizzas.Model.Entities.Empleado;
import com.example.Apizzas.Model.Entities.Pizza;
import com.example.Apizzas.Repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/empleados")
@CrossOrigin(origins = "*")
public class EmpleadoRestController {
    @Autowired
    EmpleadoRepository empleadoRepository;

    @GetMapping
    public List<Empleado> obtenerEmpleado(){
        return (List<Empleado>) empleadoRepository.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable(value = "id_empleado") Integer id){
        Optional<Empleado> empleado = empleadoRepository.findById(id);

        if(empleado.isPresent()){
            return ResponseEntity.ok().body(empleado.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }


}
