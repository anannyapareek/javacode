package recursion;
//Anannya pareek O-713
//program to extract words and count palindromic words
import java.util.*;
class dromeword
{
    String str;
    dromeword(String s)
    {
        str=s+" ";
    }

    int countPalin(String rev,int count,int i,int pos,int j)
    {
        if(str.length()==i)
            return count;
        else
        { 
            if(str.charAt(i)==' ')
            {
                String word=str.substring(pos,i);
                rev=rev+str.charAt(j);
                if(pos==j)
                {
                    if(rev.trim().equalsIgnoreCase(word.trim()))
                    {
                        return countPalin("",count+1,i+1,i+1,i+1);
                    }
                    else 
                    {
                        return countPalin("",count,i+1,i+1,i+1);
                    }
                }
                return countPalin(rev,count,i,pos,j-1);
            }
            else
                return countPalin(rev,count,i+1,pos,j+1);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\f");
        System.out.print("Enter the String you wish to enter: ");
        String str=sc.nextLine();
        dromeword obj=new dromeword(" "+str);
        int count=obj.countPalin("",0,1,0,0);
        System.out.println("the number of palindrome words in the string are: "+count);
    }
}
/**Enter the String you wish to enter: Mom and Dad are very mad at Nitin Arora
the number of palindrome words in the string are: 4*/
