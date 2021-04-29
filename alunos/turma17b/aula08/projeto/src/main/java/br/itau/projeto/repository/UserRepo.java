package br.itau.projeto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.itau.projeto.model.User;

// CRUD - Creat, Read, Update, Delete
public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmail(String email);
    public User findByEmailAndSenha(String email, String senha);
    public User findByEmailOrRacf(String email, String racf);

    @Query(value = "Select * from itmn_usuario where id = ?1", nativeQuery = true)
    public User procurarUsuario(int id);
}
