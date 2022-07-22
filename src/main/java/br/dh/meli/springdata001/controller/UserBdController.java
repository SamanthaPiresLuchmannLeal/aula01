package br.dh.meli.springdata001.controller;

import br.dh.meli.springdata001.model.UserBD;
import br.dh.meli.springdata001.service.UserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserBdController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscaPorId(@PathVariable long id) {
        Optional<UserBD> userFound = service.getUserById(id);

        if(userFound.isPresent()) {
            return ResponseEntity.ok(userFound.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<UserBD> insertNewUser(@RequestBody UserBD user) {
        //TODO: validar se o user tem ID: disparar exception

        return ResponseEntity.status(HttpStatus.CREATED).body(service.insertUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id){
        Optional<UserBD> userFound = service.getUserById(id);

        if(userFound.isPresent()) {
            service.deleteUser(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<UserBD>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    // TODO: verificar como fazer os IDs serem autocompletaveis, criamos e excluimos e os id sequenciais estao com furo

}
