import java.util.*;
class dequeue
{
    int arr[];
    int limit,front,rear;
    dequeue(int capacity)
    {
        limit=capacity;
        arr=new int [limit];
        front=0;
        rear=0;
    }

    void addfront(int val)
    {
        if(front!=0)
        front--;
        if(arr[front]==0)
            arr[front]=val;
        else
            System.out.println("Overflow from Front");
    }

    void addrear(int val)
    {
        if(rear>limit-1)
        {
            System.out.println("Overflow from rear!");
            rear--;
        }
        else
        {
            arr[rear]=val;
            rear=rear+1;
        } 
    }

    int popfront()
    {
        if(arr[front]!=0)
        {
            int pop=arr[front];
            arr[front]=0;
            front=front+1;
            return pop;
        }
        else
            return -9999;
    }

    int poprear()
    {
        int pop;
        if(arr[rear]!=0)
        {
            pop=arr[rear];
            arr[rear]=0;
            rear--;
            return pop;
        }
        else
            return-9999;
    }

    void display()
    {
        for(int i=front;i<limit;i++)
        {
            if(arr[i]!=0)
            System.out.print(arr[i]+" ");
        }
    }

    void menu()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a value ");
        addrear(sc.nextInt());
        System.out.println("Press 1 for Adding from front");
        System.out.println("Press 2 for adding from rear");
        System.out.println("Press 3 for popping from front");
        System.out.println("Press 4 for popping from rear");
        System.out.println("Press 5 to display the values present");
        while(true)
        {
            System.out.print("Enter your choice  ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter the value you wish to add  ");
                int addfront=sc.nextInt();
                addfront(addfront);
                break;
                case 2:
                System.out.print("Enter the value you wish to add  ");
                int addrear=sc.nextInt();
                addrear(addrear);
                break;
                case 3:
                int popfront=popfront();
                System.out.println("The popped element from front is:  "+popfront);
                break;
                case 4:
                int poprear=poprear();
                System.out.println("The popped element from rear:  "+poprear);
                break;
                case 5:
                display();
                break;
                default:
                System.out.println("Wrong Input");
                break;
            }
            System.out.print("\n do you wish to perform any other opertaion Yes NO  ");
            String choice=sc.next();
            if(choice.equalsIgnoreCase("No"))
            {
                break;
            }
        }
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements the user wishes to enter  ");
        int limit=sc.nextInt();
        dequeue obj=new dequeue(limit);
        obj.menu();
    }
}
/**enter the number of elements the user wishes to enter  4
enter a value 100
Press 1 for Adding from front
Press 2 for adding from rear
Press 3 for popping from front
Press 4 for popping from rear
Press 5 to display the values present
Enter your choice  2
Enter the value you wish to add  200

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  2
Enter the value you wish to add  300

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  2
Enter the value you wish to add  400

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  2
Enter the value you wish to add  500
Overflow from rear!

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  1
Enter the value you wish to add  50
Overflow from Front

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  3
The popped element from front is:  100

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  1
Enter the value you wish to add  50

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  5
50 200 300 400 
 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  4
The popped element from rear:  400

 do you wish to perform any other opertaion Yes NO  yes
Enter your choice  5
50 200 300 
do you wish to perform any other opertaion Yes NO  no */