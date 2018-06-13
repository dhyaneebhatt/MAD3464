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
public class Generics 
{
    //generic method printArray
    /*
    *
    *@param <E> GenericType
    *@
    *
    */
    public static<E> void printArray( E[] inputArray)
    {
        //display array elements
        for(E element : inputArray)
        {
            System.out.printf("%s", element);
        }
        System.out.println();
    }
    
    //determines the largest of 3 comparable objects
    
    public static <T extends Comparable<T>> T maximum(T x,T y, T z)
    {
         T max = x;//asume x is initially the largest
         
         if(y.compareTo(max)>0)
         {
             max=y;//y is the largest now
         }
         if(z.compareTo(max)>0)
         {
             max=z;//z is the largest now
         }
        return max;//returns the largest obj
    }
    public static void main(String args[])
    {
        //test generic class
        Box<Integer> integerBox = new Box<Integer> ();
        integerBox.set(new Integer(10));
        System.out.printf("Integer Value : %d \n",integerBox.get());
        
        Box<String> stringBox = new Box<String> ();
        stringBox.set(new String("Hello World!"));
        System.out.printf("String Value : %s \n\n",stringBox.get());
        
        //test Generic method printArray
        //Create arrays of Integer, Double and Character
        Integer[] intArray = {1,2,3,4,5};
        System.out.println("Array integerArray contains:");
        printArray(intArray); //pass as Integer array
        
        Double[] doubleArray ={1.1, 2.2 , 3.3,4.4};
        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);//pass as Double array
        
        Character[] charArray={'H','E','L','L','O'};
        System.out.println("\nArray CharacterArray contains:");
        printArray(charArray);//pass as Character array
        
        //generic types are performable with collections.
        //collections and generics works with class not premitive datatypes
        
        //test Genric method max
        System.out.printf("Max of %d, %d, %d is %d \n\n",3,6,8,maximum(3,6,8));
        
        System.out.printf("Max of %.1f, %.1f, %.1f is %.1f \n\n",5.6,4.8,7.9,maximum(5.6,4.8,7.9));
        
        System.out.printf("Max of %s, %s, %s is %s \n\n","apple","applet","application",maximum("apple","applet","application"));
    }
}
//Generic class
class Box<T>
{
    private T t;
    public void set(T t)
    {
        this.t = t;
    }
    public T get()
    {
        return t;
    }
}