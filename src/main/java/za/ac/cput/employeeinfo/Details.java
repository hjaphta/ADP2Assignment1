/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.employeeinfo;

/**
 *
 * @author tiffa
 */
public class Details 
{
    private String emplName, emplSurname, emplNumber; 

    public String getEmplName() {
        return emplName;
    }

    public void setEmplName(String emplName) {
        this.emplName = emplName;
    }

    public String getEmplSurname() {
        return emplSurname;
    }

    public void setEmplSurname(String emplSurname) {
        this.emplSurname = emplSurname;
    }

    public String getEmplNumber() {
        return emplNumber;
    }

    public void setEmplNumber(String emplNumber) {
        this.emplNumber = emplNumber;
    }

    @Override
    public String toString() {
        return "Details{" + "emplName=" + emplName + ", emplSurname=" + emplSurname + ", emplNumber=" + emplNumber + '}';
    }
    

}
