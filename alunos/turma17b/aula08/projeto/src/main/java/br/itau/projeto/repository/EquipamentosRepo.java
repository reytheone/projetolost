package br.itau.projeto.repository;

import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.model.Equipamentos;

public interface EquipamentosRepo extends CrudRepository<Equipamentos,Integer> {
    public Equipamentos findByHostname(String hostname);
    public Equipamentos findByIpaddr(String ipaddr);

}