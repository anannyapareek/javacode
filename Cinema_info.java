import java.util.*;
class Cinema_info
{
    String name,movie,ticket_category,ticket_no,ticketprice,hall_no;
    Cinema_info next;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Person");
        name=sc.nextLine();
        System.out.println("Enter the name of the movie");
        movie=sc.nextLine();
        System.out.println("Enter the ticket price");
        ticketprice=sc.nextLine();
    }
}
        
        
        