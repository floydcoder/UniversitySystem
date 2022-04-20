
package universitysystem_asgmt1;

/**
 *
 * @author Stevanella Marco
 * id: 101307949
 * ASGMT 1 - COMP 2130
 * Professor Hesam Akbari
 * Notes: I have decided to use an array of 10 as I would like to first deepen my knowledge on ArrayList before using them. Thank you for spending time on this and marking it.
 */

public class UndergraduateStudent extends Student {
    
    private String subject;
    private int yearOfEntry;

    // CONSTRUCTORS

    public UndergraduateStudent(int id, String firstName, String lastName, double[] marks, Address address, String subject, int yearOfEntry) {
        super(id, firstName, lastName, marks, address);
        this.subject = subject;
        this.yearOfEntry = yearOfEntry;
    }
    
    // ACCESSOR & MUTATORS

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearOfEntry() {
        return yearOfEntry;
    }

    public void setYearOfEntry(int yearOfEntry) {
        this.yearOfEntry = yearOfEntry;
    }
    
    // INSTANCE METHODS
    
    public boolean Graduate(){
        
        return Average() >= 50.0;
    
    }

    @Override
    public String toString() {
        return ("\r\nUndergrad Student: " + super.toString() + "\r\nSubject: " + this.getSubject() + "\r\nEntered in: " + String.valueOf(this.getYearOfEntry()) + "\r\nThe student " + (Graduate()? " will be able to " : " won't be able to ") + " graduate" );
    }
    
    
}
