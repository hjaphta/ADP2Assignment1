/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adp2assignment1;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 * 1 April 2021
 * 217059376
 * Shasta Abrahams 
 */
public class ProductTest {
    
    public Product product1, product2;
    
    @BeforeEach
    public void setUp(){
        product1 = new Product();
        product2 = new Product();
    }
    
    //Object Equality Test
    @Test
    public void equalityTest(){
        assertEquals(product1, product2);
    }
    
    //Object Identity Test
    @Test
    public void identityTest(){
        assertSame(product1, product2);
    }
    
    //Failing Test
    @Test
    public void failingTest(){
        fail("TEST FAILED");
    }
    
    //Timeouts
    @Test
    @Timeout(3)
    public void timeoutTest(){
        
    }
    
    //Disabling Test
    @Test
    @Disabled
    public void disablingTest() {
        fail("WON'T FAIL");
    }
    
    
    
    
}
