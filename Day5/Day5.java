
package day5;

/**
 *
 * @author macstudent
 */
public class Day5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee emp2 = new Employee("Shivam","Gujarat","988755",
            23,'M',"P123",30,"13 May 2017");
        System.out.println(emp2.toString());
        
        TemporaryEmployee tEmployee = new TemporaryEmployee(
                "Abhishek", "Brampton", "1234", 24, 'M', "T101", 20, 
                "01 Jan 2016", "iOS developer", 110);
        
      
        System.out.println(tEmployee.toString());
        

    }
    
}
