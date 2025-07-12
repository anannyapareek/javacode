import java.util.*;
class insertionsort1
{
    int temp;
    void insertationsort(int aa[])
    {
       for(int i=1;i<aa.length;++i)
       {
           temp=aa[i];
           int j;
           for( j=i-1;j>=0;j=j--)
           {
               if(aa[j]>temp)
               {
                   aa[j+1]=aa[j];
               }
               else
               {
                   break;
               }
        }
        aa[j+1]=temp;
    }
}
    void print(int aa[])
    {
        for(int i=0;i<aa.length;i++)
        {
            System.out.println(+aa[i]);
        }
    }
    public static void main(String args[])
    {
        int aa[]={5,19,34,2,56};
        Scanner sc=new Scanner(System.in);
        insertionsort1 obj=new insertionsort1();
        obj.insertationsort(aa);
        System.out.println("The sorted array is: ");
        obj.print(aa);
    }
}
               
          
               
               
               
           
        