package main.services;

import main.dao.IntDao;
import main.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ProduitServiceImpl implements IProduitService {

    @Autowired
    private IntDao<Produit> productDao;

    @Transactional
    public void addProduct(Produit product) {
        if (product.getPrice() < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif");
        }
        productDao.save(product);
    }

    @Transactional(readOnly = true)
    public List<Produit> getAllProducts() {
        return productDao.findAll();
    }
}
