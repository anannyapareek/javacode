//Anannya Pareek O-713
import java.util.*;
class LiterIt
{
    Participant start, current,prev_node;
    int count=0;
    String info;
    void push(Participant ad)
    {
        if(start==null)
        {
            start=ad;
        }
        else
        {
            ad.next=start;
            start=ad;
        }
    }

    Participant pop()
    {
        Participant temp=start;
        start=start.next;
        return temp;
    }

    void addDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of participants: ");
        int n=sc.nextInt();
        String name_add=sc.next();
        Participant new_node=new Participant();
        current=start;
        while(true)
        {
            current=new Participant();
            current.addParticipantDetails();
            if(start==null)
            {
                start=current;
            }
            else
            {
                current.next=start;
                start=current;
            }
            count++;
            if(count==3)
            {
                break;
            }
        }
    }

    void add()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student after which you wish to add");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            Participant current=new Participant();
            current.addParticipantDetails();
            current=current.next;
            push(current);
        }
    }

    void remove()
    {
        System.out.println("Event is over for the following Kids:");
        current=start;
        while(true)
        {
            current=pop();
            if(current==null)
            {
                break; 
            }
            current.displayParticipantDetails();
        } 
    }

    void removeDetails()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the participant which is to be removed");
        String name_rem=sc.next();
        current=start;
        prev_node=start;
        while(current!=null)
        {
            if(current.stud_name.equalsIgnoreCase(name_rem))
            {
                prev_node.next=current.next;
            }
            prev_node=current;
            current=current.next;
        }
    }

    void display_all()
    {
        current=start;
        while(current!=null)
        {
            current.displayParticipantDetails();
            current=current.next;
        }
    }

    void view()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the event name whose participants name is to be displayed");
        String checkevents=sc.nextLine();
        current=start;
        while(current!=null)
        {
            if(current.event.equalsIgnoreCase(checkevents))
            {
                System.out.println( "Student name: "+current.stud_name);
            }
            current=current.next;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LiterIt obj=new LiterIt();
        //obj.addDetails();
        //obj.display_all();
        obj.add();
        obj.display_all();
        obj.remove();
        //obj.removeDetails();
        //obj.display_all();
        //obj.view();
    }
}
/**Enter school_id of student 
713
Enter Student name 
Anannya
Enter event of student 
Scratch
Enter grade of student 
8
Enter school_id of student 
456
Enter Student name 
Charu
Enter event of student 
Software Creation
Enter grade of student 
9
Enter school_id of student 
003
Enter Student name 
Kriti
Enter event of student 
Scratch
Enter grade of student 
9
School id: 003	 Student name: Kriti	Event: Scratch	 Class: 9
School id: 456	 Student name: Charu	Event: Software Creation	 Class: 9
School id: 713	 Student name: Anannya	Event: Scratch	 Class: 8
Enter the name of the student after which you wish to add
Kriti
Enter the information to be added in the new node
Enter school_id of student 
90
Enter Student name 
Sammy
Enter event of student 
Software Creation
Enter grade of student 
10
School id: 003	 Student name: Kriti	Event: Scratch	 Class: 9
School id: 90	 Student name: Sammy	Event: Software Creation	 Class: 10
School id: 456	 Student name: Charu	Event: Software Creation	 Class: 9
School id: 713	 Student name: Anannya	Event: Scratch	 Class: 8
Enter the name of the participant which is to be removed
Sammy
School id: 003	 Student name: Kriti	Event: Scratch	 Class: 9
School id: 456	 Student name: Charu	Event: Software Creation	 Class: 9
School id: 713	 Student name: Anannya	Event: Scratch	 Class: 8
Enter the event name whose participants name is to be displayed
Scratch
Student name: Kriti
Student name: Anannya*/


