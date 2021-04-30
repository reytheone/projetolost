package br.itau.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.model.Alarme;

public interface AlarmeRepo extends CrudRepository<Alarme, Integer> {
    public Alarme findByNome(String nome);
    public Alarme findByDescricao(String descricao);

}