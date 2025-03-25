package br.com.fiap.checkpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.checkpoint1.model.Produto;
import br.com.fiap.checkpoint1.service.ProdutoServices;

@RestController
@RequestMapping("produtos")
public class ControllerProduto {

    @Autowired
    private ProdutoServices produtoServices;

    @PostMapping
    public ResponseEntity<Produto> create(@RequestBody Produto request) {
        Produto produto = produtoServices.save(request);
        return ResponseEntity.status(201).body(produto);
    }

    @PutMapping
    public ResponseEntity<Produto> update() {
        Produto produto = new Produto();
        return ResponseEntity.status(200).body(produto);
    }

    @GetMapping
    public ResponseEntity<Produto> find() {
        Produto produto = new Produto();
        return ResponseEntity.status(200).body(produto);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        return ResponseEntity.status(204).build();
    }

}
