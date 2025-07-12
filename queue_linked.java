import java.util.*;
class queue_linked
{
    node ptr,front,rear;
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
            if(front==null)
            {
                front=ptr;
                rear=ptr;
            }
            else
            {
                rear.next=ptr;
                rear=ptr;
            }
        }
    }
    void display()
    {
        ptr=front;
        while(ptr!=null)
        {
            System.out.println("Name: "+ptr.name+"Marks: "+ptr.marks);
            ptr=ptr.next;
        }
    }
    public static void main(String args[])
    {
        queue_linked obj1=new queue_linked();
        obj1.create();
        obj1.display();
    }
}
    
        
    
    