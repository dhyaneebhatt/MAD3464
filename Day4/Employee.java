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

//inheritance
public class Employee extends Person{
    String empId;
    int dept;
    String joiningDate;
    
    Employee(){
        super();
        this.empId = "temp";
        this.dept = 0;
        this.joiningDate = "not started yet";
    }
    
    Employee(String name, String address, String phoneNo,
            int age, char gender, String empId, int dept, 
            String joiningDate){
        
        super(name, address, phoneNo, gender, age);
        this.empId = empId;
        this.dept = dept;
        this.joiningDate = joiningDate;
    }
    
    public String toString(){
        String personalDetails = super.toString();
        String data = "Employee ID : " + this.empId + "\n" +
                "Department : " + this.dept + "\n" +
                "Joining Date : " + this.joiningDate;
        
        data = personalDetails + data;
        return data;
    }
}
