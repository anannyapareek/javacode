import java.util.*;
class binaryoct_recursion
{
    void octconvert(int binary,String octal,int bin,int decimal,int i)
    {
        if(binary==0 && bin==0)
        {
            octal=octal+Integer.toString(decimal);
            System.out.println("The octal number is "+octal);
        }
        else
        {
            if(i==3)
            {        
                octal=octal+Integer.toString(decimal);
                octconvert(binary/1000,octal,binary%1000,0,0);
            }
            else
            {
                decimal+=(int)Math.pow(2,i)*bin%10;
                octconvert(binary,octal,bin/10,decimal,i+1);
            }
        }
    }

    public static void main(String args[])
    {
        binaryoct_recursion obj=new binaryoct_recursion();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary number to be converted");
        int bin=sc.nextInt();
        obj.octconvert(bin,"",0,0,0);
    }
}
 