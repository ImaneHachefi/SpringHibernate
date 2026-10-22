package main.services;

import main.entities.Produit;
import java.util.List;

public interface IProduitService {

    void addProduct(Produit product);

    List<Produit> getAllProducts();
}