/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day8;

/**
 *
 * @author macstudent
 */
public class Day8 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        // abtract classes
        // we can use abstract class but can not cerate any object
        
        //obj of shape class- it can not runn it will show error
        //Shape s1 = new Shape();
        
        //creating obj of circle class- it will run
        //Circle c1 = new Circle();
        //c1.display();
        //c1.draw();
        
        Circle c1 = new Circle(30,40);
        c1.display();
        c1.draw();
        
    }
    
}
