package universitysystem_asgmt1;
import java.util.Arrays;
/**
 *
 * @author Stevanella Marco
 * id: 101307949
 * ASGMT 1 - COMP 2130
 * Professor Hesam Akbari
 * Notes: I have decided to use an array of 10 as I would like to first deepen my knowledge on ArrayList before using them. Thank you for spending time on this and marking it.
 */

public class Student {
    
    private int StudentID;
    private String stdFirstName;
    private String stdLastName;
    private double [] stdMarks;
    private Address stdAddress;
    
    // CONSTRUCTORS

    public Student (int id, String firstName, String lastName, double [] marks, Address address){
        this.StudentID = id;
        this.stdFirstName = firstName;
        this.stdLastName = lastName;
        this.stdMarks = marks;
        this.stdAddress =  address;
    }
    
    // ACCSESSOR 
    
    public int getStudentID(){
        return StudentID;
    }
    
    public String getStdFirstName(){
        return stdFirstName;
    }
    
    public String getStdLastName(){
        return stdLastName;
    }
    
    public double [] getMarks (){
        return stdMarks;
    }
    
    public Address getStdAddress (){
        return stdAddress;
    }
    
    // MUTATORS
    
    public void setStudentID(int id){
        this.StudentID = id;
    }
    
    public void setStdFirstName(String firstName){
        this.stdFirstName = firstName;
    }
    
    public void setStdLastName (String lastName){
        this.stdLastName = lastName;
    }
    
    public void setMarks ( double [] marks){
        this.stdMarks = marks;
    }
    
    public void setAddress (Address address){
        this.stdAddress = address;
    }
    
    
    //  INSTANCE METHODS
    
    public double Average(){

        double tot = 0;
        for(int i = 0 ; i < getMarks().length ; i++){
            tot += getMarks()[i];
        }
        return tot/getMarks().length;
        
    }

    @Override
    public String toString() {
        return ( this.getStdFirstName() + " " + this.getStdLastName() + "\r\nID:  " + this.getStudentID() + "\r\nMarks: " + Arrays.toString(this.getMarks()) + "\r\nAverage: " + String.format("%.2f",Average()) + "\r\nAddress Info: " + this.getStdAddress() );
    }
}
