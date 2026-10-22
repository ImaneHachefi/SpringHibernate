package main;

import main.config.AppConfiguration;
import main.entities.Produit;
import main.services.IProduitService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        IProduitService productService = context.getBean(IProduitService.class);

        Produit p = new Produit("Microservice Gateway", 149.99);
        productService.addProduct(p);

        System.out.println("Produit ajouté avec succès ! Total en base : "
                + productService.getAllProducts().size());

        context.close();
    }
}
