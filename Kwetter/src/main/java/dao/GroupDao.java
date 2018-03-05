/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Group;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kasper
 */
//@Stateless
public class GroupDao {
    
    @PersistenceContext
    EntityManager em;

    public GroupDao() {
    }

    public void saveGroup(Group grp) {
        em.persist(grp);
    }
    
}
