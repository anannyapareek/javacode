//Anannya Pareek, SC-A, O/713
import java.util.*;
class word
{
    String bname,freegift;
    static int price;
    int dis;
    word(String n,int p)
    {
        bname=n;
        price=p;
    }

    static void calculate(word oj)
    {
        if(price>800)
        {
            oj.freegift="2 bookmarks and a bookbank";
        }
        else
        {
            oj.freegift="a bookmark";
        }
        System.out.println("The free gift is "+oj.freegift+" with the book "+oj.bname+" of price "+price);
    }

    void display()
    {
        System.out.println("the name of the book is "+bname);
        System.out.println("the price of the book is "+price);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of book");
        String name=sc.nextLine();
        System.out.println("Enter the price of the book");
        int p=sc.nextInt();
        word obj=new word(name,p);
        System.out.println("the price of the book is"+(price));
        obj.display();
        obj.calculate(obj);
    }

}
/**
 * Observation 1:if nonstatic function calls a static variable: it does work
 * Observation 2:if static function calls non-static variable:it does not work 
 * it only works if we make it (the non-static variable)a object of the class
 * Observation 3:if static function calls the static variable of the class; it does works
 * Observation 4:if nonstatic function calls a static variable: it does work
 * Observation 5:if static variable is called from :it does work 
 * */

