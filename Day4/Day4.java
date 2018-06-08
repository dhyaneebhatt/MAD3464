/*
 * Author: macstudent
 * Purpose: Academic
 * 
 */
package day4;

/**
 *
 * @author macstudent
 */
public class Day4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person ishav = new Person();
        //System.out.println(ishav.toString());
        
        Person alay = new Person("Alay","USA","123456",'M',23);
        //System.out.println(alay.toString());
        
        Person alay2 = new Person(alay);
        //System.out.println(alay2.toString());
        
        Employee emp1 = new Employee();
        emp1.name = "Mandeep";
        emp1.address = "IND";
        emp1.phoneNo = "222222";
        emp1.age = 25;
        emp1.gender = 'F';
        emp1.empId = "F101";
        emp1.dept = 20;
        emp1.joiningDate = "01 June 2018";
        
        System.out.println(emp1.toString());
        
        Employee emp2 = new Employee("Shivam","Gujarat","988755",
            23,'M',"P123",30,"13 May 2017");
        System.out.println(emp2.toString());
    }
}
