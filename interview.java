/*Anannya Pareek
SC-A O-713
Program- Queues implemented as arrays*/
import java.util.*;
class interview
{
    String candidate[];
    int total;
    int front,rear;
    interview(int limit)
    {
        total=limit;
        front=0;
        rear=0;
        candidate=new String[25];
    }
    void InterviewCall(String name)
    {

        if(rear==total)
        {
            System.out.println("no more Interviews today!!");
        }
        else
        {
            candidate[rear]=name;
            rear=rear+1;
        }
    }
    String exit()
    {
        int i=0;
        String exitname=candidate[0];
        if(rear==0)
        {
            System.out.println("Interview's Over!!");
            return null;
        }
        else
        {
            while(rear!=i)
            {
                candidate[i]=candidate[i+1];
                i=i+1;
            }
            candidate[rear]=null;
            rear=rear-1;
            return exitname;
        }
    }
    void display()
    {
        for(int i=0;i<rear;i++)
        {
            System.out.println("Name of candidate waiting for the interview \t"+candidate[i]); 
        }
    }
    void menu()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 for entering names");
            System.out.println("Enter 2 for displaying names");
            System.out.println("Enter 3 for popping names");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter name of person coming for interview");
                String name=sc.next();
                InterviewCall(name);
                break;
                case 2:
                display();
                break;
                case 3:
                String temp_name=exit();
                if(temp_name==null)
                {
                    break;
                }
                else
                {
                    System.out.println("interview over for "+temp_name);
                    break;
                }
            }
            System.out.println("Do you wish to continue: yes/no");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("No"))
            {
                break;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of candidates coming for the interview today");
        int limit=sc.nextInt();
        interview obj=new interview(limit);
        obj.menu();
    }
}
/**
 * Enter the total number of candidates coming for the interview today
3
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
1
Enter name of person coming for interview
anannya
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
1
Enter name of person coming for interview
nandika
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
1
Enter name of person coming for interview
charu
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
1
Enter name of person coming for interview
sammy
no more Interviews today!!
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
2
Name of candidate waiting for the interview 	anannya
Name of candidate waiting for the interview 	nandika
Name of candidate waiting for the interview 	charu
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
3
interview over for anannya
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
3
interview over for nandika
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
3
interview over for charu
Do you wish to continue: yes/no
yes
Enter 1 for entering names
Enter 2 for displaying names
Enter 3 for popping names
3
Interview's Over!!
Do you wish to continue: yes/no
no

 */
 