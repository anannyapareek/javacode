import java.util.*;
class recur_insertsort
{
    void insertsort(int arr[],int i)
    {
        if(i<=1)
        {
            return ;
        }
        insertsort(arr,i-1);
         int temp=arr[i-1];
         int j=i-2;
        while (j>=0 && arr[j]>temp) 
         {
             arr[j+1]=arr[j];
             j--;
        }
        arr[j+1]=temp;
        insertsort(arr,i-1);
    }    
    void print(int arr[])
    {
        System.out.println("The sorted array is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(+arr[i]);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={2,89,14,56,3,10};
        recur_insertsort obj=new recur_insertsort();
        obj.insertsort(arr,arr.length);
        obj.print(arr);
    }
}
