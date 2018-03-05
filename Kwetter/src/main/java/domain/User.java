/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author Kasper
 */
//@Entity
public class User {
    
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="UserID")
    private long id;
    
    private String name;
    private String username;
    private String password;
    //@ManyToMany(mappedBy = "users")
    private List<Group> groups;
    
    //@OneToMany(mappedBy="user", fetch = FetchType.EAGER)
    private List<Kweet> kweets;
    
    //@ManyToMany
    private List<User> followersList;
    
    //Constructor
    public User() {
        
    }
    
    public User(String Name, String Username) {
        this.name = Name;
        this.username = Username;
        followersList = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public List<Kweet> getKweets() {
        return kweets;
    }
    
    public void AddKweet(Kweet k) {
        if(kweets == null) {
            kweets = new ArrayList<>();
        }
        kweets.add(k);
        if (k.getUser() != this) {
            k.setUser(this);
        }
    }
    
    public void RemoveKweet(Kweet k) {
        if (kweets == null) {
            kweets = new ArrayList<>();
        }
        else {
            kweets.remove(k);
        }
    }
    
    public void FollowUser(User user) {
        followersList.add(user);
    }
    
    public void UnfollowUser(User user) {
        followersList.remove(user);
    }
    
    public List<User> getFollowersList() {
        return followersList;
    }
    
    public void setFollowersList(List<User> followersList) {
        this.followersList = followersList;
    }
}
