import java.util.*;
class alphabeticalsorting
{
    String ss="";
    char temp;
    char chr[];
    int num;
    void alphabeticalsort(String str)
    {
        num=str.length();
        chr=new char[num];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            chr[i]=ch;
        }
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=0;j<str.length()-1-i;j++)
            {
                if(chr[j]>chr[j+1])
                {
                    temp=chr[j+1];
                    chr[j+1]=chr[j];
                    chr[j]=temp;
                }
            }
        }
    }
    void print()
    {
        System.out.println("Sorted String is");
        for(int i=0;i<num;i++)
        {
           System.out.print(chr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        alphabeticalsorting obj=new alphabeticalsorting();
        System.out.println("enter the string to be sorted");
        String str=sc.next();
        obj.alphabeticalsort(str);
        obj.print();
    }
}
        
        
        
        