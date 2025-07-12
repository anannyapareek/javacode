//Anannya Pareek O-713
import java.util.*;
class node
{
    String name;
    int marks;
    node next;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name ");
        name=sc.next();
        System.out.println("Enter marks of students ");
        marks=sc.nextInt();
    }
}
    