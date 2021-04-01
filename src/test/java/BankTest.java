/**
 *
 * Tasneem Jacobs  215030389
 * ADP2
 * Assignment 1 - Software development Infrastructor
 */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Ignore;


public class BankTest {
    private BankTest BankTest1;
    private BankTest BankTest2;
    private BankTest BankTest4;
    
   
    @BeforeAll
    public static void setUpClass() {
        BankTest1 = new BankTest;
        BankTest2 == new BankTest;
        BankTest4 = BankTest1;
    }
     @Test
     void testIdentity (){
         assertSame(BankTest1,BankTest4);
     }
     @Test
     void testEquality (){
         assertSame(BankTest1,BankTest4);
     }
     
     @Test
     public void testgetName(){
         System.out.println("getName");
         BankTest instance = new BankTest();
         String expResult="";
         String result = instance.getName();
         assertEquals(expResult,result);
         
     }
     
     @Test
     @Ignore
     public void testsetAccountType(){
         System.out.println("setAccountType");
         BankTest instance = new BankTest();
         String AccountType="";
          instance.setAccountType(accountType);
         fail("The test case is a prototype.");
     }
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

   
}
