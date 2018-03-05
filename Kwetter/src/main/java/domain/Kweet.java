/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Kasper
 */
@Entity
public class Kweet {
    
    @Id
    private long id;
    
    public Kweet () {
        
    }
    
}
