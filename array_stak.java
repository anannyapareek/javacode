//anannya pareek O-713
import java.util.*;
class array_stak
{
    int arr[];
    int cap,n,top,mkr;
    array_stak(int m)
    {
        cap=m;
        arr=new int[cap];
    }

    void push(int n)
    {
        if(mkr>cap)
        {
            System.out.println("Overflow");
        }
        for(int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=n;
        mkr++;  
    }

    int pop()
    {
        int i=0;
        if(mkr==0)
        {
            return 00;
        }
        int pop=arr[0];
        while(true)
        {
            arr[i]=arr[i+1];
            i=i+1;
            if(i>arr.length-2)
                break;
        }   
        mkr--;
        return pop;
    }

    void display()
    {
        for(int i=0;i<mkr;i++)
        {
            System.out.println(arr[i]);
        }
    }

    void menu()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 if you wish to push values");
            System.out.println("Enter 2 if you wish to display vlues");
            System.out.println("Enter 3 if you wish to pop values");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the number you wish to enter");
                int no1=sc.nextInt();
                push(no1);
                break;
                case 2:
                display();
                break;
                case 3:
                int pophold=pop();
                if(pophold==0)
                {
                    System.out.println("UNDEFLOW!");
                }
                else
                {
                    System.out.println("The value returned is "+pophold); 
                }
                break;
                default:
                System.out.println("Wrong Input");
                break;
            }
            System.out.println("do you wish to perform any other opertaion Yes NO");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("No"))
            {
                break;
            }
        }    
    }

    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the total number of numbers you wish to enter");
        int no=sc.nextInt();
        array_stak obj=new array_stak(no);
        obj.menu();
    }
}
/**Enter the total number of numbers you wish to enter
4
Enter 1 if you wish to push values
Enter 2 if you wish to display vlues
Enter 3 if you wish to pop values
1
Enter the number you wish to enter
245
do you wish to perform any other opertaion Yes NO
yes
Enter 1 if you wish to push values
Enter 2 if you wish to display vlues
Enter 3 if you wish to pop values
1
Enter the number you wish to enter
89
do you wish to perform any other opertaion Yes NO
yes
Enter 1 if you wish to push values
Enter 2 if you wish to display vlues
Enter 3 if you wish to pop values
3
The value returned is 89
do you wish to perform any other opertaion Yes NO
yes
Enter 1 if you wish to push values
Enter 2 if you wish to display vlues
Enter 3 if you wish to pop values
2
245
do you wish to perform any other opertaion Yes NO
no*/