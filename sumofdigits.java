import java.util.*;
class sumofdigits
{
    int digitssum(int num,int sum)
    {
        if(num==0)
        {
            return sum;
        }
        else
        {
            int rem=num%10;
            sum=sum+rem;
            return digitssum(num/10,sum);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        sumofdigits obj=new sumofdigits();
        System.out.println("Enter number you wish to find sum of");
        int n=sc.nextInt();
        int s=obj.digitssum(n,0);
        System.out.println("Sum of numbers in: "+s);
    }
}
        
        