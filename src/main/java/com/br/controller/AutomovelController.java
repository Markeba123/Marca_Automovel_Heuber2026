package com.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.exception.ResourceNotFoundException;
import com.br.Automovel;
import com.br.repository.AutomovelRepository;

@RequestMapping("/cautomovel/")
@RestController
@CrossOrigin(origins="*")
public class AutomovelController {

    // Cria o repositorio jpa de forma automatica e autogerenciado
    @Autowired
    private AutomovelRepository arep;
    
    // Metodo listar - trazer todos os automoveis do banco
    @GetMapping ("/automovel")
    public List<Automovel> listar(){
        return this.arep.findAll(Sort.by(Sort.Direction.DESC, "codigo"));
    }
    
    // Metodo consultar - trazer um automovel caso exista pelo codigo
    @GetMapping("/automovel/{id}")
    public ResponseEntity<Automovel> consultar(@PathVariable Long id){
        
        Automovel automovel = this.arep.findById(id).orElseThrow(()->
        new ResourceNotFoundException("Automóvel não encontrado: " + id));
        
        return ResponseEntity.ok(automovel);
    }
    
    // Metodo inserir - insere um automovel
    @PostMapping("/automovel")
    public Automovel inserir(@RequestBody Automovel automovel) {
        
        return this.arep.save(automovel);
    }
}
