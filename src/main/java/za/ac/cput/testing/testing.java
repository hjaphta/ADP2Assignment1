/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.testing;

/**
 *
 * @author Herschelle Japhta
 */
public class testing 
{
    public static void main(String[] args) 
    {
        //Object equality
        System.out.println("Types of greetings");
        System.out.println("Greet1 = Hello");
        System.out.println("Greet2 = Hi");
        System.out.println("Greet3 = Awe");
        
        String greet1= new String("Hello");
	String greet2= new String("Hi");
	String greet3= new String("awe");
	System.out.println("greet1 equals to greet2:"+greet1.equals(greet2));
	System.out.println("greet1 equals to greet3:"+greet1.equals(greet3));
	System.out.println("greet1 equals to Welcome:"+greet1.equals("Welcome"));
	System.out.println("greet1 equals to Hello:"+greet1.equals("Hello"));
	System.out.println("greet1 equals to hello:"+greet1.equals("hello"));
        
        
        
    }
    
}
