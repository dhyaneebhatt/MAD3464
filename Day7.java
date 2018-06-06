/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author macstudent
 */
public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1="Test String";
        String str2=new String("Java");
        
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = str1 + str2;
        System.out.println(str3);
        
        str3 = str2.concat(str1);
        System.out.println(str3);
        
        //copystring
        str3=str2;
        System.out.println(str3);
        
        if(str2.equals(str3))
        {
            System.out.println("Equals");
        }
        else
        {
              System.out.println("Not Equals");
        }
        
        str3="java";
        
         if(str2.equalsIgnoreCase(str3))
        {
            System.out.println("Equals");
        }
        else
        {
              System.out.println("Not Equals");
        }
         
        str2 = "test";
        str3 = "Tast";
        System.out.println("String2:"+  str2);
        System.out.println("String3:"+ str3);
        
        int cmp = str2.compareTo(str3);
        System.out.println("cmp:"+cmp);
        
        System.out.println("String 2:"+str2.toUpperCase());
        
        System.out.println("String 3:"+str3.toLowerCase());
        
        //to get the length of the string
        //lenght of aray=
        
        //length of string=
        
        System.out.println("length:"+str2.length());
        
        int a1[] = new int[3];
        
        int len = a1.length;
        
        //MIMP!!!!!!
        /*str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<str2.length(); i+=2)
        {
            System.out.println(str2.charAt(i) + "");
        }*/
        
        str2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<str2.length(); i+=2)
        {
            System.out.println((char)(str2.charAt(i) +1)+ "");
        }
        
        //apply replace func
        str2 ="Hello there!";
        System.out.println(str2.replace('l','m'));
        
        //endswith func
        str2 ="Hello Java!";
        System.out.println(str2.endsWith("java!"));        
        
        str2 ="Hello Java!";
        System.out.println(str2.endsWith("str3"));    
        
        str3 = str2.substring(4);
        System.out.println("str3:" + str3 );
        
        str3 = str2.substring(4);
        System.out.println("str3:" + str3 );
        System.out.println("str2:" + str2 );
        
        str3 = str2.substring(0,5);
        System.out.println("str3:" + str3 );
        
        //finding chr in the string 
        int p = str2.indexOf('b');
        System.out.println("p :" + p);
        
        str2 = "Hallo Java";
        p = str2.indexOf('a',4);
        
        p = str2.indexOf("Java");
        
        //last occurance of the char 
        p = str2.lastIndexOf('a');
        System.out.println("p:" + p);
        
        //reverse string
        str2 = "This is a test string";
        for(int i = str2.length()-1; i >=0; i--)
        {
            System.out.println(str2.charAt(i));
        }
        System.out.println("");
        
        //count the words
        str2 = "This is a test string";
        int wordcount = 1;
        for(int i = str2.length()-1; i >=0; i--)
        {
            System.out.println(str2.charAt(i));
            
            if(Character.isWhitespace(str2.charAt(i)))
            {
                wordcount++;
            }
        }
        System.out.println("\n Word count:" +wordcount);
    
    //we can do owrdcount++ or wordcount=1 to count the exact word not the whitespaces
    
    //what if we want to update the string
    //string class do not allow this so we have string buffer class
    
    StringBuffer str4 = new StringBuffer
        ("It feels like winter in summer!");
    
    System.out.println("str4" + str4 );
    
    str4.append("TEST");
    System.out.println("str4:" + str4 );
    //replace the char
    str4.setCharAt(3,'@');
    System.out.println("str4:" + str4 );
    //add the char
    str4.insert(10,"@#$");
    System.out.println("str4:" + str4 );
    
    str4.reverse();
    System.out.println("str4:" + str4 );
    }
}
