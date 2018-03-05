/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.GroupDao;
import dao.UserDao;
import domain.Group;
import domain.User;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Kasper
 */
public class UserService {
    @Inject
    UserDao ud;
    
    @Inject
    GroupDao gd;
    
    public List<User> allUsers() {
        List<User> userList = ud.allUsers();
        return userList;
    }
    
    public void setUserDao(UserDao userDao) {
        ud = userDao;
    }
    
    public void setGroupDao (GroupDao groupDao) {
        gd = groupDao;
    }
}
