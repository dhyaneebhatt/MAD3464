/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 * @version 1.0
 * @since 13 June 2018
 */
public class Serialization 
{
    /*
    * @param args th ecommand line arguments
    *@return No return value
    @exception IOexception while confirming Input Output from
    @exception ClassnOTfOUNDeXCEPTION WHILE REAING OBJ
    @
    */
    public static void main(String args[])
    {
        Employee emp = new Employee();
        emp.name = "Ashley";
        emp.address = "Vancouver";
        emp.SSN = 444444;
        emp.number = 101;
        //only  premitive types can be used in seriliation
        //serialization
        try 
        {
            FileOutputStream fileOut = new FileOutputStream("employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(emp);
            
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved as employee.txt");
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        
        //deserialization
        Employee e = null;
        
        try
        {
            FileInputStream fileIn = new FileInputStream("employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            e = (Employee) in.readObject();
            
            in.close();
            fileIn.close();
        }
        catch(IOException i)
        {
            i.printStackTrace();
            return;
        }
        
        catch(ClassNotFoundException c)        
        {
            System.out.println("\nEmployee class not found!");
            c.printStackTrace();
            return;
        }
    }
}
