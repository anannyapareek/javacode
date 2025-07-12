import java.util.*;
class countprime
{
    int arr[];
    void input(int n,int i)
    {
        int arr[]=new int[n];
        if(i>=n)
        {
            return;
        }
        else
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter value of array for"+i+"position");
            arr[i]=s.nextInt();
        }
    }
    int countprimeno(int n,int i,int count)
    {
        if(count==2 && i==n)
        {
           return 1;
        }
        else
        {
            if(n%i==0)
            {
                count=count+1;
                return countprimeno(n,i+1,count);
            }
            return countprimeno(n,i+1,count);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        countprime obj=new countprime();
        System.out.println("Enter number's to enter in array");
        int  n=sc.nextInt();
        int arr[]=new int[n];
        obj.input(n,0);
        System.out.println("The number of prime numbers are");
        int sum=0;
        for(int i=0;i<=10;i++)
        {
            int temp=obj.countprimeno(arr[i],0,0);
             sum=sum+temp;
        }
        System.out.println("The number of prime numbers are"+sum);
    }
}
            
            
        
            
        