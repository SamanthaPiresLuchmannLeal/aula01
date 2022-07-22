package br.dh.meli.springdata001.service;

import br.dh.meli.springdata001.model.UserBD;
import br.dh.meli.springdata001.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserDbRepo repo;

    public Optional<UserBD> getUserById(long id) {
        return repo.findById(id);
    }

    @Override
    public UserBD insertUser(UserBD newUser) {
        if(newUser.getId() > 0) return  null;
        return repo.save(newUser);
    }

    @Override
    public void deleteUser (long id){
        if(repo.findById(id).isPresent()) {
            repo.deleteById(id);

        }
        //TODO: lançar expeption UserNotFound


    }

    @Override
    public List<UserBD> listAll() {
        return (List<UserBD>) repo.findAll();
    }
}
