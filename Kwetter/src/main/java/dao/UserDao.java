/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kasper
 */
//@Stateless
public class UserDao {
    @PersistenceContext
    EntityManager em;

    public UserDao() {
    }
    
    public UserDao(EntityManager emr) {
        em = emr;
    }
    
    public void save(User user) {
        em.persist(user);
    }
    
    public void saveKweet(Kweet k) {
        em.persist(k);
    }
    
    public List<User> allUsers() {
        return em.createNamedQuery("user.all").getResultList();
    }
}
