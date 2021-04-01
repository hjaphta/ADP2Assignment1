package za.ac.cput.employeeinfo;

import static java.time.Duration.ofMinutes;
import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * APD2 Assignment 1
 * @author Tiffany Kiwiets - 219322732
 */

public class DetailsTest {
    private Details emplName1;
    private Details emplName2;
    private Details emplName3;
    
    
         
    @BeforeEach
    public void setUp() {
        emplName1 = new Details();
        emplName2 = new Details();
        emplName3 = emplName1;
    }
    
    //Testing Object Equality
    @Test
    public void testEquality() {
        assertEquals(emplName1, emplName3);
        System.out.println("Employee names are equal");
    }
    
    //Testing Object Identity
    @Test
    public void testIdentity() {
        assertSame(emplName1, emplName3);
    }
    

    /**
     * Test of getEmplName method, of class Details.
     * Failing Test
     */
    @Test
    public void testGetEmplName() {
        assertEquals(emplName1, emplName3);
        fail("The test case is a prototype.");
    }
    
    // Testing Timeout
    @Test
    public void timeoutNotExceeded() 
    {
        //The following assertion succeeds.
        assertTimeout(ofMinutes(1), () -> {
            // Perform task that takes less than 1 minutes.
        });
    }

    /**
     * Test of setEmplName method, of class Details.
     * Disabling Test
     */
    @Ignore
    @Test
    public void testSetEmplName() {
        System.out.println("setEmplName");
        String emplName = "";
        Details instance = new Details();
        instance.setEmplName(emplName);
    }

    
    
}
