package br.com.fiap.checkpoint1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.fiap.checkpoint1.model.Produto;

@Service
public class ProdutoServices {
    private List<Produto> produtos = new ArrayList();
    private Long id = 1L;

    public Produto save(Produto produto) {
        produto.setId(id);
        return produto;
    }
}
