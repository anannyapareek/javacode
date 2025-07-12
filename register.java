import java.util.*;
class register
{
    String stud[];
    int cap,top;
    register(int max)
    {
        cap=max;
        top=(cap-1);
        stud=new String[cap];
    }

    void create()
    {
        Scanner sc=new Scanner(System.in);
        for(;top>=0;top--)
        {
            System.out.println("Enter the name of the student to be added");
            String name=sc.nextLine();
            push(name);
        }
        if(top==-1)
        {
            System.out.println("OverFlow");
        }
    }

    void push(String n)
    {
        Scanner sc=new Scanner(System.in);
        stud[top]=n;       
    }

    String pop()
    {
        String name=stud[0];
        int c=cap,top=0;
       if(top==-1)
        {
            return "$$";
        }
       else
        {

             for( int k=0;k<top;k++)
             {
               stud[k]=stud[k+1];   
             }
           return name;
        }
    }

    void display()
    {
        for(int i=0;i<stud.length;i++)
        {
            System.out.println(stud[i]);  
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the number of kids who have submitted the register ");
        int no=sc.nextInt();
        register obj=new register(no);
        obj.create();
        obj.display();
        System.out.println("Enter 1 to display the names of the students who have submitted the register");
        System.out.println("Enter 2 to pop the value");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:
        {
            obj.display();
            break;
        }
        case 2:
        {
            String name_rem=obj.pop();
            System.out.println("The name popped from here:"+name_rem);
            break;
        }     
        default:
        {
           System.out.println("System failure"); 
        }
       }
    }
}
 