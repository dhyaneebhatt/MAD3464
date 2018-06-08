/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

//import day9.Books.bookTitleComparator;
import java.util.ArrayList;
import java.util.Collections;

//collection class we use when we havw liist of class
/**
 *
 * @author macstudent
 */
public class Library 
{
    public static void main(String args[])
    {
        //all primitive class are not useable with arraylist like int
        ArrayList<String> bookId = new ArrayList<String>();
        
        bookId.add("B001");
        bookId.add("B002");
        //giving position where to add the value
        // here we have given index 1
       
        
        for(String str1 : bookId)
        {
            System.out.println(str1);
        }
         bookId.add(1,"B005");
       
          for(String str1 : bookId)
        {
            System.out.println(str1);
        }
                

         //contains
        if(bookId.contains("B005"))
        {
            System.out.println("We have a book!");
            //remove
           // bookId.remove("B005");
        }
        else
        {
            System.out.println("Book unavailable!");
        }
        
        //toremove
        
         for(String str1 : bookId)
        {
            System.out.println(str1);
        }
         //now arraylist contain the whole obj
         ArrayList<Books> library = new ArrayList<Books> ();
         Books book1 = new Books(1,"Java",2);
         Books book2 = new Books(2,"Android",5);
         Books book3 = new Books(3,"Swift",7);
         Books book4 = new Books(4,"ios",4);
         
         library.add(book1);
         library.add(book2);
         library.add(book3);
         library.add(book4);
         
         library.add(2, new Books(10,"Database",9));
         
         for(Books book : library)
         {
             book.displayInfo();
         }
         
         System.out.println("Number of books in the library:-->"+library.size());
         
         if(library.contains(book4))
         {
             library.remove(book4);
         }
         
         System.out.println("Number of books in the library:-->"+library.size());
         
          for(Books book : library)
         {
             book.displayInfo();
         } 
          
          Collections.sort(library, new bookTitleComparator());
          for(Books bk: library)
          {
              bk.displayInfo();
          }
    }
    
}
