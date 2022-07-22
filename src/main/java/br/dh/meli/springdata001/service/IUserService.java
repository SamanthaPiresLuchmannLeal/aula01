package br.dh.meli.springdata001.service;

import br.dh.meli.springdata001.model.UserBD;
import org.apache.catalina.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<UserBD> getUserById(long id);

    UserBD insertUser(UserBD newUser);

    void deleteUser(long id);

    List<UserBD> listAll();

}
