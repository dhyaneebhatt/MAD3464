/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author macstudent
 */
public class ArithmeticTest 
{
    public static void main(String args[])
    {
        Arithmetic operation1 = new Arithmetic();
        
        System.out.println("number:" + operation1.number1);
        operation1.addition();
        operation1.addition(20,30);
        float result = operation1.addition(12.34f,34.26f);
        System.out.println("Result"+result);
        operation1.addition(10,20,30,40);
    }
}
