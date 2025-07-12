//

//anannya pareek
import java.util.*;
class myString
{
    String str;
    myString()
    {
        String ss="";
        int ascii;
    }
    String encode(int shift,String str)
    {
        String ss="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int ascii=(int)ch;
            if(ch=='y')
            {
                 ascii=65;
            }
            if(ch=='z')
            {
                ascii=66;  
            }
            int finalno=shift+ascii;
            char ch2=(char)finalno;
          ss=ss.concat(Character.toString(ch2));
        }
        return ss;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        myString obj=new myString();
        System.out.println("Enter String to be decoded");
        String str=sc.nextLine().toLowerCase();
        System.out.println("Enter Shift");
        int shift=sc.nextInt();
        String decode=obj.encode(shift,str);
        System.out.println("The decoded code id "+decode);
    }
}
//Enter String to be decoded
//abcd
//Enter Shift
//3
//The decoded code id defg
        
        
        
        
        
    
            
            
            