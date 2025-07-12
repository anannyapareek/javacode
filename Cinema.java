import java.util.*;
class Cinema
{
    Cinema_info front,rear,ptr;
    String tic_category;
    String tic_hall1[], tic_hall2[], tic_hall3[];
    String Hall_1,Hall_2,Hall_3,ticket_category,row;
    int hallno;
      void Create()
    {
        Scanner sc=new Scanner(System.in);
       tic_hall1=new String[15];
       tic_hall2=new String[15];
       tic_hall3=new String[15];
       System.out.println("Enter 1 if you wish to watch Devil wears prada");
       System.out.println("Enter 2 if you wish to watch All is well");
       System.out.println("Enter 3 if you wish to watch The Last Song");
       int check=sc.nextInt();
       if(check==1)
       {
           ptr.hall_no="1";
           ptr.movie="Devils Wear Prada";
           ticketassign(tic_hall1);
        }
        else if(check==2)
        {
           ptr.hall_no="2";
           ptr.movie="All is well";
           ticketassign(tic_hall2);
        }
        else if(check==3)
        {
            ptr.hall_no="3";
            ptr.movie=" The Last Song";
            ticketassign(tic_hall3);
        }
        else
        {
            System.out.println("Wrong Input");
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
    
     void Ticket()
    {
        String row,ticket_category,convert_seatno;
        int j=1;
        for(int i=0;i<15;i++)
        {
            convert_seatno=Integer.toString(j);
            if(i<5)
            {
               ticket_category="Silver_A";
            }
            else if(i>=5 && i<10)
            {
                ticket_category="Gold_B";
            }
            else 
            {
               ticket_category="Platinum_C";
            }
        tic_hall1[i]=ticket_category.concat(convert_seatno);
        tic_hall2[i]=ticket_category.concat(convert_seatno);
        tic_hall3[i]=ticket_category.concat(convert_seatno);
        if(j==5)
        j=1; 
       }
    }
    void ticketassign(String tic_cat[])
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
          ptr=new Cinema_info();
          ptr.input();
          System.out.println("Enter the ticket category you wish to have");
          System.out.println("Choose out of Gold,Silver,Platinum");
          String choosen_category=sc.nextLine();
         for(int i=0;i<15;i++)
         {
             String temp;
             StringTokenizer obj=new StringTokenizer("_");
             temp=tic_cat[i];
            String Category=obj.nextToken(temp);
            if(choosen_category.equalsIgnoreCase(Category))
            {
                ptr.ticket_no=obj.nextToken(temp);
                tic_cat[i]="Sold";
            }
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
    Scanner sc=new Scanner(System.in);
    {
        System.out.println("Enter the name of the Category of which we have to name the people");
        String checkcat=sc.next();
        ptr=front;
        while(true)
        {
            if(ptr.ticket_category.equalsIgnoreCase(checkcat))
            {
                System.out.println(ptr.name);
            }
            ptr=ptr.next;
        }
    }
}
void totalcollection()
{
    int count=0,cnt2=0,cnt3=0;
    front=ptr;
    while(ptr!=null)
    {
        if(ptr.hall_no.equalsIgnoreCase("1"))
        count=count+1;
        else if(ptr.hall_no.equalsIgnoreCase("2"))
        
          cnt2=cnt2+1;
        else
            cnt3=cnt3+1;
        ptr=ptr.next;
    }
        System.out.println(" Total collection made by hall one"+count);
        System.out.println(" Total collection made by hall two"+cnt2);
        System.out.println(" Total collection made by hall three"+cnt3);
        if(count>cnt2 && count>cnt3)
        {
            System.out.println("The maximum number of people viewed  Devil wears prada");
        }
        else if(cnt2>count && cnt2>cnt3)
        {
            System.out.println("The maximum number of people viewed All is Well");
        }
        else
        {
            System.out.println("The maximum number of people viewed The Last Song");
        }
}
    public static void main()
    {
       Cinema obj2=new Cinema();
       obj2.Ticket();
       obj2.Create();
       obj2.totalcollection();
       
    }
}
              
    
    
    