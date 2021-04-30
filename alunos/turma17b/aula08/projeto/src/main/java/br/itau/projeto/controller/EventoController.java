package br.itau.projeto.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.itau.projeto.model.Evento;
import br.itau.projeto.repository.EventoRepo;

@RestController
@CrossOrigin("*")
@RequestMapping("/evento")
public class EventoController {

    @Autowired
    public EventoRepo repo;

    @GetMapping("/id/{idEvt}")
    public ResponseEntity<Evento> getEvento(@PathVariable int idEvt){
        Evento eventoEncontrado = repo.findById(idEvt).orElse(null);
        if (eventoEncontrado != null) {
            return ResponseEntity.ok(eventoEncontrado);
        } 
        return ResponseEntity.notFound().build(); 
    }

    @GetMapping("/all")
    public ResponseEntity<List<Evento>> getAllEvento() {
        List<Evento> lista = (List<Evento>) repo.findAll();

        if (lista != null) {
            return ResponseEntity.ok(lista);            
        }
        return ResponseEntity.status(404).build();
    }

    @PostMapping("/data")
    public ResponseEntity<List<Evento>> buscarPorData(@RequestBody ObjectNode objJson) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate ini = LocalDate.parse(objJson.get("dtIni").asText(), fmt);
        LocalDate fim = LocalDate.parse(objJson.get("dtFim").asText(), fmt);

        List<Evento> eventos = repo.findByDataEvtBetweenOrderByDataEvt(ini, fim);

        return ResponseEntity.ok(eventos);
    }

    
}
