/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.KweetDao;
import domain.Kweet;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Kasper
 */
public class KweetService {
    @Inject
    KweetDao kd;
    
    public List<Kweet> allKweets() {
        List<Kweet> kweetList = kd.allKweets();
        return kweetList;
    }
    
    public Kweet getKweetByUserID(Long l) {
        Kweet kweet = kd.kweetByUserID(l);
        return kweet;
    }
}
