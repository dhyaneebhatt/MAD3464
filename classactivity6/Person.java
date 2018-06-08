/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivity6;

import java.util.Scanner;
/**
 *
 * @author macstudent
 */
public class Person
{
    String name;
    int age;
    Scanner in = new Scanner(System.in);
    
    void setName()
    {
        
        System.out.println("Enter Person name :");
        name = in.nextLine();
    }
    
    String getName()
    {
        return name;
    }
    
    void setAge()
    {
        System.out.println("Enter Person age : ");    
        age = in.nextInt();
       
    }
    
    int getAge()
    {
        return age;
    }
    
    public String toString(){
        String data = "Name : " + name + "\n" +"Age : " + age + "\n";
        return data;
    }
    
    void setData()
    {
        setName();
        setAge();
    }
}
