/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

/**
 *
 * @author macstudent
 * @version 1.0
 * @since 13 June 2018
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    //public transient int SSN;
    public int SSN;
    public int number;
    
    /**
     * @param Dosen't accept any parameter
     * @retuen
     */
    public void mailCheque()
    {
        System.out.println("Mailing a cheque to"+name+""+address);
    }
    //seralization - to store obj data 
}
