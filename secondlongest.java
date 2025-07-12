package recursion;
//Anannya Pareek
//ScA  O-713
//Program to find the second longest word in a String and the longest word with vowels in it.
import java.util.*;
class secondlongest
{
    void secondlongest22(int i,String word,String str,int max1,int max2,String word2 )
    {
        if(str.length()-1==i)
        {
            System.out.println("The 2nd longest word is "+word2);
        }
        else
        {
            if(str.charAt(i)==' ')
            {
                String wrd=str.substring(i+1,str.indexOf(' ',i+1));
                if(max1<wrd.length())
                {
                    max2=max1;
                    max1=wrd.length();
                    word2=word;
                    word=wrd;
                }
                if(max2==wrd.length())
                    word2=word2+" and "+wrd;
                if(max1>wrd.length() && max2<wrd.length())
                {
                    max2=wrd.length();
                    word2=wrd;
                }
            }
            secondlongest22(str.indexOf(' ',i+1),word,str,max1,max2,word2);
        }
    }

    void maxvowel(String str,int i,int j,int count,int count2,String vowelword)
    {
        if(str.length()-1==i)
        {
            System.out.println("The word with maximum vowels is:"+ vowelword);
        }
        else
        {
            if(str.charAt(i)==' ')
            {
                String word=str.substring(i+1,str.indexOf(' ',i+1));
                if(j!=word.length())
                {
                    char ch=word.charAt(j);
                    if(ch=='A' ||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    {
                        count2++;
                    }
                    maxvowel(str,i,j+1,count,count2,vowelword);
                }
                if(j==word.length())
                {
                    if(count2>count)
                        maxvowel(str,i+1,0,count2,0,word); 
                    else if(count==count2)
                        maxvowel(str,i+1,0,count2,0,vowelword+" "+word);
                    else
                        maxvowel(str,i+1,0,count,0,vowelword);  
                } 
            }
            else
                maxvowel(str,i+1,0,count,0,vowelword);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String sent=sc.nextLine();
        secondlongest obj=new secondlongest();
        obj.secondlongest22(0,""," "+sent+" ",0,0,"");
        obj.maxvowel(" "+sent+" ",0,0,0,0,"");
    }
}
/**
 * Enter the string: please get me the chair
The 2nd longest word is chair
The word with maximum vowels is:please

Enter the string: nitin arora is mad and bad
The 2nd longest word is mad and and and bad
The word with maximum vowels is:arora

Enter the string: i am mad at you and sad
The 2nd longest word is am and at
The word with maximum vowels is:you

Enter the string: This beat is for you
The 2nd longest word is for and you
The word with maximum vowels is:beat you*/

