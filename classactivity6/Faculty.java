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
public class Faculty extends Person implements Employee 
{
    String course;
     Scanner in = new Scanner(System.in);

    @Override
    public void displayE()
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        System.out.println("Employee Type:-->"+Emp_type);
        System.out.println("Salary:-->"+salary);
    }

   
    
}
