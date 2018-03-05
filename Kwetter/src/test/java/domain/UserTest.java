/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import dao.UserDao;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kasper
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetTweets() {
        System.out.println("Get Tweets Test");
        User instance = new User("Kasper", "Kasper");
        
        Kweet k = new Kweet();
        k.setMessage("Dit is een test");
        instance.AddKweet(k);
        
        List<Kweet> expResult  = new ArrayList();
        expResult.add(k);
        
        List<Kweet> result = instance.getKweets();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveTweets() {
        System.out.println("Remove Tweets Test");
        User instance = new User("Kasper", "Kasper");
        
        Kweet k = new Kweet();
        k.setMessage("Dit is een test");
        instance.AddKweet(k);
        
        List<Kweet> testIfNull = instance.getKweets(); //new ArrayList();
        //testIfNull.add(k);
        System.out.println("Testing if Kweet list is empty: ");
        assertEquals(testIfNull.size(), 1);
        
        instance.RemoveKweet(k);
        testIfNull = instance.getKweets();
        int amountOfTweets = testIfNull.size();
        System.out.println("Testing if Kweet has successfully been removed");
        assertEquals(amountOfTweets, 0);
    }
    
    @Test
    public void testFollowUser() {
        System.out.println("Follow User Test");
        User instance = new User("Kasper", "Kasper");
        User instance2 = new User("Test", "Test");

        instance.FollowUser(instance2);
        List<User> expResult = new ArrayList<>();
        expResult.add(instance2);
        
        List<User> result = instance.getFollowersList();
        assertEquals(expResult, result);
    }
    
    @Test
    public void unFollowUser() {
        System.out.println("Unfollow User Test");
        User instance = new User("Kasper", "Kasper");
        User instance2 = new User("Test", "Test");
        
        instance.FollowUser(instance2);
        List<User> testIfNull = instance.getFollowersList();
        System.out.println("Testing if followers list is empty");
        assertEquals(testIfNull.size(), 1);
        
        instance.UnfollowUser(instance2);
        testIfNull = instance.getFollowersList();
        System.out.println("Testing if successfully unfollowed");
        assertEquals(testIfNull.size(), 0);
    }
    
    @Test
    public void getName() {
        System.out.println("GetName Test");
        User instance = new User("Kasper", "Kasper");
        String expResult = "Kasper";
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void setName() {
        System.out.println("SetName Test");
        User instance = new User("Kasper", "Kasper");
        String newName = "repsaK";
        instance.setName(newName);
        String expResult = newName;
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void getId() {
        System.out.println("GetId Test");
        User instance = new User("Kasper", "Kasper");
        int i = 0;
        Long expResult = new Long(i);
        
        Long result = instance.getId();
        assertEquals(expResult, result);
        
        System.out.println("Testing second user");
        User instance2 = new User("Test", "Test");
        
        result = instance2.getId();
        assertEquals(expResult, result);
    }
}
