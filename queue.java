//Anannya Pareek o-713
import java.util.*;
class queue
{
    Node ptr,front,rear,ptr3,front3,rear3,prev_node;
    int count,count1;
    String info1,info;
    void create()
    {
        while(true)
        {
            ptr=new Node();
            count1++;
            ptr.input();
            if(front==null & front==null)
            {
                front=ptr;
                rear=ptr;
            }
            else
            {
                rear.next=ptr;
                rear=ptr;
            }

            if(count1==3)
            {
                break;
            }
        }
    }

    void displayprint()
    {
        ptr=front;
        while(ptr!=null)
        {
            System.out.println("Name: "+ptr.name+"\t"+"size: "+ptr.size+"\t"+"Printer Brand"+ptr.brand+"\t"+"Software used"+ptr.software+"\t"+"Time of Command"+ptr.time);
            ptr=ptr.next;
        }
    }

    void count_KonicaMinolta()
    {
        ptr=front;
        while(ptr!=null)
        {
            if(ptr.brand.equalsIgnoreCase("Konica Minolta"))
            {
                count=count+1;
            }
            ptr=ptr.next;
        }
        System.out.println("The number of documents sent to Konica Minolta is "+count);
    }

    void append_doc()
    {
        System.out.println("Enter the information of the document that we will add to the end");
        Node NewNode=new Node();
        NewNode.input();
        rear.next=NewNode;
        rear=NewNode;
    }

    void insert_doc()
    {
        Scanner sc=new Scanner(System.in);
        Node newnd=new Node();
        System.out.println("Enter the name of the person after which we are going to insert the function: ");
        info1=sc.next();
        ptr=front;
        while(ptr!=null)
        {
            if((ptr.name).equalsIgnoreCase(info1))
            {
                System.out.println("Enter the name of the person who is to be inserted");
                newnd.input();
                newnd.next=ptr.next;
                ptr.next=newnd;
            }
            ptr=ptr.next;
        }
    }

    void delete_doc()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the info of the previous node from that which is to be deleted");
        info=sc.next();
        ptr=front;
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

    void A4_doc()
    {
        ptr=front;
        while(ptr!=null)
        {
            if(ptr.size.equalsIgnoreCase("A4"))
            {
                ptr3=new Node();
                if(front3==null)
                {
                    front3=ptr;
                    rear3=ptr;
                }
                else
                {
                    rear3.next=ptr;
                    rear3=ptr;
                }
            }
            ptr=ptr.next;
        }
    }

    void remove_excel()
    {
        ptr=front;
        prev_node=front;
        while(ptr!=null)
        {
            if(ptr.software.equalsIgnoreCase("Excel"))
            {
                if(prev_node==front)
                {
                    front=ptr.next;
                }
                else
                {
                    prev_node.next=ptr.next;
                }
            }
            prev_node=ptr;
            ptr=ptr.next;
        }
    }
}

    