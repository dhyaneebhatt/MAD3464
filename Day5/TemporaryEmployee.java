
package day5;

/**
 *
 * @author macstudent
 */
public class TemporaryEmployee extends Employee{
    String designation;
    float hourlyRate;

    TemporaryEmployee() {
        super();
        this.designation = "Unassigned";
        this.hourlyRate = 0.0f;
    }

    TemporaryEmployee(String name, String address, String phoneNo,
            int age, char gender, String empId, int dept, 
            String joiningDate,String designation, float hourlyRate) {
        super(name, address,phoneNo,age,gender,empId,dept,joiningDate);
        this.designation = designation;
        this.hourlyRate = hourlyRate;
    }
    
    //method overriding
    public String toString(){
       // ;
        return ( super.toString() +
                "\nDesignation : " + this.designation +
                "\nHourly Rate : " + this.hourlyRate);
    }
    
    
    
}
