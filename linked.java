//Anannya PareekO_713
//Insertion,Deletion and Creation of Linkied List
import java.util.*;
class linked
{
    String info, info1;
    node start,ptr,start2,ptr2;
    void create()
    {
        while(true)
        {
            ptr=new node();
            ptr.input();
            if(ptr.marks==0)
            {
                break;
            }
            if(start==null)
            {
                start=ptr;
            }
            else
            {
                ptr.next=start;
                start=ptr;
            }
        }
    }

    void display()
    {   
        ptr=start;
        while(ptr!=null)
        {
            System.out.println(" Name of students "+ptr.name+"\t Marks of students "+ptr.marks );
            ptr=ptr.next;
        }
    }

    void delete()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the info of the previous node from that which is to be deleted");
        info=sc.next();
        ptr=start;
        while(ptr!=null)
        {
            if(ptr.name.equalsIgnoreCase(info))
            {
                ptr.next=ptr.next.next; 
                break;
            }
            ptr=ptr.next;
        }
    }

    void insert()
    {
        Scanner sc=new Scanner(System.in);
        node newnd=new node();
        System.out.println("Enter the info of the node after which we are going to insert");
        info1=sc.next();
        ptr=start;
        while(ptr!=null)
        {
            if(ptr.name.equalsIgnoreCase(info1))
            {
                System.out.println("Enter the information to be added in the new node");
                newnd.input();
                newnd.next=ptr.next;
                ptr.next=newnd;
            }
            ptr=ptr.next;
        }
    }

    void marks()
    {
        ptr=start;
        while(ptr!=null)
        {
            ptr2=new node();
            if(ptr.marks>90)
            {
                ptr2.marks=ptr.marks;  
                ptr2.name=ptr.name;

                if(start2==null)
                {
                    start2=ptr2;
                }
                else
                {
                    ptr2.next=ptr2;
                    start2=ptr2;
                }
            }       
            ptr=ptr.next;
        }
    }

    void display2()
    {   
        ptr2=start2;
        while(ptr2!=null)
        {
            System.out.println(" Name of students "+ptr2.name+"\t Marks of students "+ptr2.marks);
            ptr2=ptr2.next;
        }
    }

    public static void main(String args[])
    {
        linked obj=new linked();
        obj.create();
        obj.display();
        obj.delete();
        obj.display();
        obj.insert();
        obj.display();
        obj.marks();
        obj.display2();
    }
}

        