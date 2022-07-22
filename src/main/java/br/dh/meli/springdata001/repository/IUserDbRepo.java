package br.dh.meli.springdata001.repository;

import br.dh.meli.springdata001.model.UserBD;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDbRepo extends CrudRepository<UserBD, Long> {
    UserBD findByEmail(String email);
    UserBD findByName(String name);
    UserBD findBy(String email);

}
