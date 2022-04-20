
package universitysystem_asgmt1;
import java.util.Scanner;

/**
 *
 * @author Stevanella Marco
 * id: 101307949
 * ASGMT 1 - COMP 2130
 * Professor Hesam Akbari
 * Notes: I have decided to use an array of 10 as I would like to first deepen my knowledge on ArrayList before using them. Thank you for spending time on this and marking it.
 */
public class UniversitySystem_asgmt1 {
    
    static Student [] students = new Student [10];
    static Scanner input = new Scanner (System.in);
    static int indexStudentsCounter = 0;

    public static void main(String[] args) {
        WelcomeMessage();        
        boolean isUserActive = true;
        while(isUserActive){
            Menu();
            int selection = input.nextInt();        
                switch (selection){
                    case 1:
                        AddUndergradStudent();                        
                        break;
                    case 2:
                        AddGraduateStudent();                                              
                        break;
                    case 3:
                        ViewStudents();                       
                        break;
                    case 4:
                        ViewEligibleStudents();
                        break;
                    case 5:
                        System.out.println("Exit");
                        isUserActive = false;
                        break;
                    default:
                        System.out.println("We think you entered a wrong number, digit a valid number.");
                }
        }

    }
    
    // Control Flow Methods
    
public static void WelcomeMessage(){
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n"
                        + "Hi, Welcome to the University Control System for STAFF.\r\n"                
                        + "This System will allow you to create new students, view them and see who is elegible for graduation.\r\n"
                        +"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n");
}
    
public static void Menu (){
    System.out.println("Select one of the following options:\n\r"
            + "1) Add Undergraduate Student\n\r"
            + "2) Add Graduate Student\n\r"
            + "3) View all the Students\n\r"
            + "4) View only elegible Student\n\r"
            + "5) exit\n\r");
}

public static void AddGraduateStudent(){

    char selection;
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n"
                     + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- ADD GRADUATE STUDENT -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n"
                     + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n");
    boolean userWantsToCreate = true;
    while(userWantsToCreate){
        System.out.println("\r\nWould you like to create a new graduate student? Yes (Y) No (N)");        
        selection = input.next().charAt(0);        
        if(selection == 'Y' || selection == 'y'){
               System.out.print("ID: ");
               int studentID = input.nextInt();
               System.out.print("First Name: ");
               String studentFirstName = input.next();
               System.out.print("Last Name: ");
               String studentLastName = input.next();
               System.out.print("Num of Marks to record: ");               
               int numMarksToRecord = input.nextInt();                   
               double [] marks = new double [numMarksToRecord];
                for ( int j = 0 ; j < marks.length ; j++){                        
                    System.out.print("Mark " + (j+1) + ": "); // we should display to the user the right number
                     marks[j] = input.nextDouble();
                }
                System.out.print("Street: ");
                String streetInfo = input.next();
                System.out.print("City: ");
                String cityInfo = input.next();
                System.out.print("Postal Code: ");
                String postalCode = input.next();
                System.out.print("Province: ");
                String province = input.next();
                System.out.print("Country: ");                    
                String country = input.next();
                System.out.print("Subject: ");
                String subject = input.next();
                System.out.print("Entry year: ");
                int entry = input.nextInt();
                System.out.print("Thesis: ");
                String thesis = input.next();
                GraduateStudent graduateStud = new GraduateStudent(studentID,studentFirstName,studentLastName,marks,new Address (streetInfo,cityInfo,postalCode,province,country),subject,entry,thesis);
                students [indexStudentsCounter] = graduateStud;
                indexStudentsCounter++;
                System.out.print(graduateStud);
        }
        else if (selection == 'N' || selection == 'n'){
            userWantsToCreate = false;
            System.out.print("\r\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\nYou are being redirected to the main menu...\r\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n");                
        }
        else{
            System.out.print("You must have entered another key, ");
            userWantsToCreate = true;
        }                        
    }

    
}

public static void ViewStudents(){

    for (int i = 0 ; i < students.length ; i++){
        
        if(students[i] == null){            
            System.out.print("\r\nEmpty Slot at " + i + " for eventual student\r\n");        
        }
        else{
            System.out.print("\r\n=-=-=-=-=- STUDENT -=-=-=-=-=\r\n" );
            System.out.print(students[i].toString() + "\r\n");        
            System.out.print("\r\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n" );
        }
            }
    
}

public static void ViewEligibleStudents(){
    
    for (int i = 0 ; i < students.length ; i++){
        
        if(students[i] instanceof UndergraduateStudent && students[i].Average() >= 50){
            
            System.out.print(students[i].toString() + "\r\n");
        }
        else if (students[i] instanceof GraduateStudent && students[i].Average() >= 70)
            
            System.out.print(students[i].toString() + "\r\n");
    
    }

}

public static void AddUndergradStudent (){

        char selection;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=- ADD UNDERGRAD STUDENT -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n");
        boolean userWantsToCreate = true;
        while(userWantsToCreate){
            System.out.println("\r\nWould you like to create a new undergrad student? Yes (Y) No (N)");
            selection = input.next().charAt(0);
            if(selection == 'Y' || selection == 'y'){
                System.out.print("ID: ");
                int studentID = input.nextInt();
                System.out.print("First Name: ");
                String studentFirstName = input.next();
                System.out.print("Last Name: ");
                String studentLastName = input.next();
                System.out.print("Num of marks to record: ");
                int numMarksToRecord = input.nextInt();
                double [] marks = new double [numMarksToRecord];
                for ( int j = 0 ; j < marks.length ; j++){
                    System.out.print("Mark " + (j+1) + ": ");
                    marks[j] = input.nextDouble();
                }
                System.out.print("Street: ");
                String streetInfo = input.next();
                System.out.print("City: ");
                String cityInfo = input.next();
                System.out.print("Postal Code: ");
                String postalCode = input.next();
                System.out.print("Province: ");
                String province = input.next();
                System.out.print("Country: ");
                String country = input.next();
                System.out.print("Subject: ");
                String subject = input.next();
                System.out.print("Entry Year: ");
                int entry = input.nextInt();
                UndergraduateStudent undergradStud = new UndergraduateStudent(studentID,studentFirstName,studentLastName,marks, new Address(streetInfo,cityInfo,postalCode,province,country),subject,entry);
                students[indexStudentsCounter] = undergradStud;
                indexStudentsCounter++;
                System.out.print(undergradStud);
            }
            else if (selection == 'N' || selection == 'n'){
                userWantsToCreate = false;
                System.out.print("\r\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\nYou are being redirected to the main menu...\r\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\r\n");
            }
            else{
                System.out.print("You must have entered another key, ");
                userWantsToCreate = true;
            }
        }

    }

}
