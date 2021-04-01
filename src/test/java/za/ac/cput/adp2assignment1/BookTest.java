/*
  *Maven Project
  *BookTest.java
  *Working class
  *Author Zintle Magwaxaza-218109911
  *Date: Wednesday, 31 March 2021
 */
package za.ac.cput.adp2assignment1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Disabled;

import static org.junit.jupiter.api.Assertions.*;



public class BookTest {
    private Book book0;
     private Book book1;
      private Book book2;
       private Book book3;
       
    
    @BeforeEach
    public void setUp() {
        book0 = new Book ("Star Wars", "NO678", "Action","June 2020");
        book1 = new Book("After We Collided", "NO214", "Romance","March 2020");
        book2 = new Book("World History", "NO258", "Action","Jan 2021");
        book0=book3;
        
    }
    
    //Equality
    @Test
    public void testEquality(){
        assertEquals(book0,book3);
    }

    //Identity
    @Test
    public void testIdentity(){
        assertSame(book0,book3);
    }
    
   //fail
    @Test
    public void testFail() {
        assertEquals(book0,book3);
        fail("This test will fail");
    }
    
     //Disable test
      @Disabled("i dont want to test this")
      @Test
      public void testWillBeIgnored(){
          assertEquals(book0,book3);
       }
          
    // fails if execution exceeds 20 seconds
    @Test
    @Timeout(20)
    public void timeOutTest(){
     book3=book1;
     assertSame(book3,book1);
  }
   
      }

    
    

