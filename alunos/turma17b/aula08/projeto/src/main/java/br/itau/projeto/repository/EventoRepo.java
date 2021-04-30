package br.itau.projeto.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.model.Evento;

public interface EventoRepo extends CrudRepository<Evento,Integer>{
    public List<Evento> findByDataEvtBetweenOrderByDataEvt(LocalDate dataInicio, LocalDate dataFim );
    
    public Optional<Evento> findByDataEvt(Object data);

}
