package main.dao;

import main.entities.Produit;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProduitDaoImpl implements IntDao<Produit> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Produit product) {
        sessionFactory.getCurrentSession().save(product);
    }

    @Override
    public void update(Produit product) {
        sessionFactory.getCurrentSession().update(product);
    }

    @Override
    public void delete(Produit product) {
        sessionFactory.getCurrentSession().delete(product);
    }

    @Override
    public Produit findById(Long id) {
        return sessionFactory.getCurrentSession().get(Produit.class, id);
    }

    @Override
    public List<Produit> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Produit", Produit.class).list();
    }
}