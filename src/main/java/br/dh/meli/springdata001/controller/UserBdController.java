package br.dh.meli.springdata001.controller;

import br.dh.meli.springdata001.model.UserBD;
import br.dh.meli.springdata001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserBdController {

    @Autowired
    private UserService service;

    @GetMapping("/{id}")
    public ResponseEntity<UserBD> buscaPorId(@PathVariable long id) {
         return ResponseEntity.ok(service.getUserById(id));
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<UserBD> buscaPorEmail(@PathVariable String email) {
        return ResponseEntity.ok(service.findByEmail(email));
    }

    @PostMapping
    public ResponseEntity<UserBD> insertNewUser(@RequestBody UserBD user) {
        //TODO: validar se o user tem ID: disparar exception

        return ResponseEntity.status(HttpStatus.CREATED).body(service.insertUser(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable long id){
            service.deleteUser(id);
            return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<UserBD>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }


    @PutMapping
    public ResponseEntity<UserBD> updateuser(@RequestBody UserBD user) {
        return ResponseEntity.ok(service.update(user));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserBD> updateUser(@PathVariable long id, @RequestBody Map<String, String> changes) {
        return ResponseEntity.ok(service.updatePartial(id, changes));
    }
}
