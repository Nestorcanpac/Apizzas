package com.example.Apizzas.RestControllers;

import com.example.Apizzas.Model.Entities.Cliente;
import com.example.Apizzas.Model.Entities.Direccion;
import com.example.Apizzas.Model.Entities.Pizza;
import com.example.Apizzas.Repositories.DireccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("direcciones")
@CrossOrigin(origins = "*")
public class DireccionRestController {
    @Autowired
    DireccionRepository direccionRepository;

    @GetMapping("/aux")
    public List<Direccion> obtenerDireccion(){
        return (List<Direccion>) direccionRepository.findAll();
    }


    @PostMapping("/create")
    public ResponseEntity<?> crearDireccion(@RequestBody Direccion direccion) {
        try {
            Direccion nuevaDireccion = direccionRepository.save(direccion);
            return ResponseEntity.ok(nuevaDireccion);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear la dirección: " + e.getMessage());
        }
    }


//    @GetMapping("/{id}")
//    public ResponseEntity<Direccion> obtenerDireccionPorId(@RequestParam("id") int id){
//        Optional<Direccion> direccion = direccionRepository.findById(id);
//
//        if(direccion.isPresent()){
//            return ResponseEntity.ok().body(direccion.get());
//        }
//        else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
