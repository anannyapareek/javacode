//Anannya Pareek O-713
import java.util.*;
class Participant
{
    String school_id;
    String stud_name;
    String event;
    int class_in;
    Participant next;
    void addParticipantDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter school_id of student ");
        school_id=sc.nextLine();
        System.out.println("Enter Student name ");
        stud_name=sc.nextLine();
        System.out.println("Enter event of student ");
        event=sc.nextLine();
        System.out.println("Enter grade of student ");
        class_in=sc.nextInt();
    }

    void displayParticipantDetails()
    {
        System.out.println("School id: "+school_id+"\t Student name: "+stud_name+"\tEvent: "+event+"\t Class: "+class_in);
    }
}

