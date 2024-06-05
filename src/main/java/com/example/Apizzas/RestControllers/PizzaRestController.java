package com.example.Apizzas.RestControllers;

import com.example.Apizzas.Model.Entities.Pizza;
import com.example.Apizzas.Repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pizzas")
@CrossOrigin(origins = "*")
public class PizzaRestController {
    @Autowired
    PizzaRepository pizzaRepository;

    @GetMapping
    public List<Pizza> obtenerPizzas(){
        return (List<Pizza>) pizzaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pizza> obtenerPizzaPorId(@PathVariable(value = "id") Integer id){
        Optional<Pizza> pizza = pizzaRepository.findById(id);

        if(pizza.isPresent()){
            return ResponseEntity.ok().body(pizza.get());
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

}
