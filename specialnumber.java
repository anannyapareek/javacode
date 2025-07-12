import java.util.*;
class specialnumber
{
    int num;
    int fact;
    int sum=0;
    int check=num;
  int input()
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be check as special number");
        num=sc.nextInt();
        return num;
  }
  int extractionofdigits(int num,int check,int fact)
   {
       if(check==sum)
       {
           return 100;
       }
       else if(num==0)
       {
           return 101;
       }
       else 
       {
           int r=num%10;
           return factorial(r);
       }
  }
  int factorial(int j)
  {
     if(j>0)
     {
         int fact=j*factorial(j-1);
          return fact;
     }
     else
     {
         sum=sum+fact;
         return extractionofdigits(num/10,num,fact);
     }
  }
  public static void main()
  {
        Scanner sc=new Scanner(System.in);
        specialnumber obj=new specialnumber();
        int n=obj.input();
        int checkno=obj.extractionofdigits(n,n,1);
        if(checkno==100)
        {
            System.out.println("It is a special Number");
        }
        else
        {
            System.out.println("It is not a special number");
        }
  }
}
        
        
        
        
        
        