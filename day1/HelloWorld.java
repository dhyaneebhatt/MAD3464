/*
 * Author: Jigisha Patel
 * Purpose: Academic
 * 
 */

/**
 *
 * @author jkp
 */
public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World");
        //System.in
        //System.err
        
        int number = 10;
        float fnumber = 10.2f;
        double dnumber = 10.23455;
        short n1;
        long n2;
        
        number *= 10;
        System.out.println("number :" + number);
        
        number = 20;
        System.out.println("number : " + (number + 10));
        System.out.println(10 + number + "number : ");
        
        /*
        //number = number / 0;
        */
        
        char ch = 'a'; //97
        System.out.println(" ch : " + ch);
        System.out.println(" ch : " + (char)(ch + 1)); //98 - b
        
        ch++; // ch = ch + 1
        System.out.println("ch : " + ch);  // ch = b
        
        ch++; // ch = ch + 1
        System.out.println("ch : " + ch); // ch = c
        
        ++ch; // ch = ch + 1
        System.out.println("ch : " + ch); 
        
        ch = 'c';
        
        char anotherCh = --ch;
        System.out.println("ch : " + ch);
        System.out.println("anotherch : " + anotherCh);
        
        String name = "JK";
        System.out.println("Name : " + name);
        
        boolean flag = false;
        System.out.println("flag : " + flag);
        
        if (!flag){
            System.out.println("Name : " + name);
        }else{
            System.out.println("Name is missing");
        }
        
        char vowel = 'e';
        
        switch(vowel){
            case 'a':                
            case 'e':               
            case 'i':                
            case 'o':               
            case 'u':
                System.out.println("given character is vowel");
                break;
            default:
                System.out.println("given character is NOT vowel");
                break;
        }
        
        switch(10+20){
            case 10:
                System.out.println("not match");
                break;
            case 30:
                System.out.println("matched");
                break;
            default:
                System.out.println("can't determine");
                break;
        }
        
        String province = "ON";
        switch(province){
            case "ON":
                System.out.println("Ontario");
                break;
            case "AB":
                System.out.println("Alberta");
                break;
            case "NV":
                System.out.println("Nova Scotia");
                break;
            default:
                System.out.println("Don't know.");
                break;
        }
    }
}
