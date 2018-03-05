/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Kasper
 */
@Entity
public class Kweet {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private User user;
    
    public User getUser() {
        return user;
    }
    
    public void setUser() {
        this.user = user;
    }
    
    private String message;
    
    //Constructor
    public Kweet () {
        
    }
    
    public Kweet(User user) {
        this.user = user;
    }
    
    public String getMessage() {
        return message;
    }
    
    public  void setMessage(String message) {
        this.message = message;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
