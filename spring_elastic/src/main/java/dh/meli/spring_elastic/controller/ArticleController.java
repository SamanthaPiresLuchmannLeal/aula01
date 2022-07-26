package dh.meli.spring_elastic.controller;

import dh.meli.spring_elastic.model.Article;
import dh.meli.spring_elastic.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    public ArticleService service;

    @PostMapping
    public ResponseEntity<Article> save (@RequestBody Article article) {
        return ResponseEntity.ok(service.save(article));
    }

    @PutMapping
    public ResponseEntity<Article> update (@RequestBody Article article) {
        return ResponseEntity.ok(service.update(article));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> findById(@PathVariable int id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Article>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(service.deleteById(id));
    }

    @DeleteMapping("/v/{id}")
    public ResponseEntity<String> deleteVoidById(@PathVariable int id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/title/{title}")
    public Page<Article> getPageByTitle(@PathVariable String title, Pageable pg){
        return service.getPageByTitle(title, pg);
    }


}
