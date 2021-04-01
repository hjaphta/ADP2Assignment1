
package za.ac.cput.adp2assignment1;

import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 * DogTest.java
 * This class test the Dog class
 * @author Anele Aneal Tose - 216079292
 * Date: 01 April 2021
 */
public class DogTest {
    
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;
    
    public DogTest() {
    }
    @BeforeEach
    public void setUp() {
        this.dog1 = new Dog();
        this.dog2 = new Dog();
        dog3 = dog1;
    }
    void testEquality(){
        assertEquals(dog1, dog2);
        assertNotEquals(dog1, dog3);
    }
    @Test
    void testIdentity(){
        assertSame(dog1, dog2);
        assertNotSame(dog1, dog3);
    }
    @Test
    void testTimeoutDog(){
    assertTimeout(Duration.ofSeconds(3),()->{
        this.dog1= new Dog();
        this.dog2= new Dog();
        this.dog3= new Dog();
        assertEquals(dog1,dog2);
        assertEquals(dog1,dog3);
        assertEquals(dog2,dog3);
        
        assertSame(dog1,dog2);
        assertSame(dog1,dog3);
        assertSame(dog2,dog3);
        
        assertNotSame(dog1,dog2);
        assertNotSame(dog1,dog3);
        assertNotSame(dog2,dog3);
        });
    }
    @Disabled("disbaled Dog test")
    @Test
    void testDisabledDog(){
        this.dog1= new Dog();
        this.dog2= new Dog();
        assertEquals(dog1,dog2);
        assertEquals(dog1,dog3);
        assertEquals(dog2,dog3);
        
        assertSame(dog1,dog2);
        assertSame(dog1,dog3);
        assertSame(dog2,dog3);
        
        assertNotSame(dog1,dog2);
        assertNotSame(dog1,dog3);
        assertNotSame(dog2,dog3);
        
        
    }
        
    
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Dog.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dog instance = new Dog();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDogName method, of class Dog.
     */
    @Test
    public void testSetDogName() {
        System.out.println("setDogName");
        String dogName = "";
        Dog instance = new Dog();
        instance.setDogName(dogName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDogType method, of class Dog.
     */
    @Test
    public void testSetDogType() {
        System.out.println("setDogType");
        String dogType = "";
        Dog instance = new Dog();
        instance.setDogType(dogType);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDogColor method, of class Dog.
     */
    @Test
    public void testSetDogColor() {
        System.out.println("setDogColor");
        String dogColor = "";
        Dog instance = new Dog();
        instance.setDogColor(dogColor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDogName method, of class Dog.
     */
    @Test
    public void testGetDogName() {
        System.out.println("getDogName");
        Dog instance = new Dog();
        String expResult = "";
        String result = instance.getDogName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDogType method, of class Dog.
     */
    @Test
    public void testGetDogType() {
        System.out.println("getDogType");
        Dog instance = new Dog();
        String expResult = "";
        String result = instance.getDogType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDogColor method, of class Dog.
     */
    @Test
    public void testGetDogColor() {
        System.out.println("getDogColor");
        Dog instance = new Dog();
        String expResult = "";
        String result = instance.getDogColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
    
