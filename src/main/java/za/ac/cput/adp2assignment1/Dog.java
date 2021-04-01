
package za.ac.cput.adp2assignment1;

/**
 * Dog.java
 * This class i'm going to use to implement TDD features
 * @author Anele Aneal Tose - 216079292
 * Date: 01 April 2021
 */
public class Dog {
    private String dogName, dogType, dogColor;
    
    @Override
    public String toString() {
        return "Dog{" + "dogName=" + dogName + ", dogType=" + dogType + ", dogColor=" + dogColor + '}';
    }
    
    
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogType() {
        return dogType;
    }

    public String getDogColor() {
        return dogColor;
    }
}
