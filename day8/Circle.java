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
public class Circle extends Shape
{   
    Circle(int x, int y)
    {
        super(x,y);
    }
    
    @Override
    void draw()
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        // in abstract class we can change the value of var whoch we can not do with the interface!
       // super.x = 10;
        //super.y=20;
        
        //System.out.println("x:"+super.x);
        
       // System.out.println("y:"+super.y);
        
        System.out.println("Drawing Circle at" + super.x +"and"+ super.y+"!");
    
    }
    
    
}
