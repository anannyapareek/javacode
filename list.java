//Anannya Pareek O-713
import java.util.*;
class list
{
    node ptr,start,prev_node;
    void create()
    {
        ptr=new node();
        ptr.generate();
        while(true)
        {
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

    void delete()
    {
        prev_node=new node();
        ptr=start;
        prev_node=ptr;
        while(ptr!=null)
        {
            if(ptr.data<5)
                prev_node.next=ptr.next;
            prev_node=ptr;
            ptr=ptr.next;
        }
    }

    void display()
    {
        ptr=start;
        while(ptr!=null)
        {
            System.out.println(+ptr.data+",");
            ptr=ptr.next;
        }
    }

    public static void main(String args[])
    {
        list obj=new list();
        obj.create();
        obj.delete();
        obj.display();
    }
}
 