package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//my API REST personalis√© sans spring data REST.
@RestController //on l'ajoute si on veut creer des service sans passer par spring data rest
public class ProduitRestServices {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value = "/listProduits")
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }

    @GetMapping(value="/listProduits/{id}")
    public Produit listProduits(@PathVariable(name="id") Long id){
        return produitRepository.getById(id);
    }

    @PutMapping(value="/listProduits/{id}")
    public Produit update(@PathVariable(name="id") Long id, @RequestBody Produit p){
        p.setId(id);
        return produitRepository.save(p);
    }

    @PostMapping(value = "/listProduits")
    public Produit save(@RequestBody Produit p){
        return produitRepository.save(p);
    }

    @DeleteMapping(value = "/listProduits/{id}")
    public void delete(@PathVariable(name="id") Long id){
        produitRepository.deleteById(id);
    }
}
