import java.util.*;
class selectionsortrecursion
{
    int arr[]={225,89,56,4,0,1000,456738,8956,22,77};
    int ss[]={12,89,45,845,982,2,65,24,66,1};
    void selectionsort1()
    {
         for(int i=0; i<(arr.length-1);i++)  
         {  
            int small=i;
            for(int j=i+1;j<arr.length;j++)
            {  
                if(arr[j]<arr[small])
                {  
                    small=j;
                }
            }
               int temp=arr[small];   
               arr[small]=arr[i];  
               arr[i]=temp;    
         }  
         for(int k=0;k<arr.length;k++)
         {
            System.out.println( +arr[k]);
         }
    }   
    int smallindex(int ss[],int i,int j)
    {
        if(i==j)
        {
            return i;
        }
        else
        {
            int k=smallindex(ss,i+1,j);
            if(ss[i]<ss[k])
            {
                return i;
            }
            else
            {
                return k;
            }
        }
    }
    void rec_sort(int ss[],int n,int index)
     {
        if(index==n)
        {
            return ;
        }
        else
        {
            int h=smallindex(ss,index,n-1);
            if(h!=index)
            {
               int temp=ss[index];   
               ss[index]=ss[h];  
               ss[h]=temp;  
            }
             rec_sort(ss,n,index+1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        selectionsortrecursion obj=new selectionsortrecursion();
        int ss[]={12,89,45,845,982,2,65,24,66,1};
        System.out.println("The data is sorted non-recursively: ");
        obj.selectionsort1();
        System.out.println("The data is sorted recursively: ");
        obj.rec_sort(ss,ss.length,0);
        for(int i=0;i<ss.length;i++)
        {
            System.out.println(+ss[i]);
        }
    }
}
//The data is sorted non-recursively: 
//0
//4
//22
//56
//77
//89
//225
//1000
//8956
//456738
//The data is sorted recursively: 
//1
//2
//12
//24
//45
//65
//66
//89
//845
//982