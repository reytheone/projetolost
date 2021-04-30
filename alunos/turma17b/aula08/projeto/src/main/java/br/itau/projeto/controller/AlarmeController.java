package br.itau.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.model.Alarme;
import br.itau.projeto.repository.AlarmeRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/alarme")
public class AlarmeController {

    @Autowired
    public AlarmeRepo repo;

    @GetMapping("/id/{id}")
    public ResponseEntity<Alarme> getAlarme(@PathVariable int id) {
        Alarme alarmeEncontrado = repo.findById(id).orElse(null);
        if (alarmeEncontrado != null) {
            return ResponseEntity.ok(alarmeEncontrado);
        } 
        return ResponseEntity.notFound().build(); 
    }

    @GetMapping("/all")
    public ResponseEntity<List<Alarme>> getAllAlarme() {
        List<Alarme> lista = (List<Alarme>) repo.findAll();

        if (lista != null) {
            return ResponseEntity.ok(lista);            
        }
        return ResponseEntity.status(404).build();
    }
}
