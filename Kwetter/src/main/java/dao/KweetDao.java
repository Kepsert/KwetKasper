/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Kweet;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kasper
 */
@Stateless
public class KweetDao {
    
    @PersistenceContext
    EntityManager em;

    public KweetDao() {
    }
    
    public void saveKweet(Kweet kweet) {
        em.persist(kweet);
        em.flush();
    }
    
    public List<Kweet> allKweets() {
        return em.createNamedQuery("kweet.all").getResultList();
    }
    
    public Kweet kweetByUserID(Long userid) {
        return (Kweet) em.createNamedQuery("kweet.ByUserID").setParameter("UserID", userid).getSingleResult();
    }
}
