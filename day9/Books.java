/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books 
{
    int bookId;
    String bookTitle;
    int bookRating;
    
    Books()
    {
        this.bookId = 0;
        this.bookTitle = "Unknown";
        this.bookRating = 0;
    }
    
    Books(int bookId, String bookTitle, int bookRating)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
    
    void setbookId(int Id)
    {
        this.bookId = Id;
    }
    
    int getbookId()
    {
        return this.bookId;
    }
    
    void setbookTitle(String Title)
    {
        this.bookTitle = Title;
    }
    
    String getTitle()
    {
        return this.bookTitle;
    }
    
    void setRating(int Rate)
    {
        this.bookRating = Rate;
    }  
    
    int getRating()
    {
        return this.bookRating;
    }
          
    void displayInfo()
    {
        System.out.println("Book ID:-->"+this.bookId+"\n Book Title:-->"+this.bookTitle+"\n Book Rating:-->"+this.bookRating);
    }
    
    //to sort the obj comparator
    //comparator is an interface thet can compare the obj of a class
    //they will compare as ascii value and arrage it accordingly
    
    class bookTitleComparator implements Comparator<books>
    {
        public int compare(Books o1, Books o2)
        {
            return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
        }
    }
    
}
