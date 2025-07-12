import java.util.*;
class statename
{
    String states[] = {"Arunachal Pradesh","Itanagar","Assam","Dispur","Bihar","Patna","Himachal Pradesh","Shimla","Karnataka","Bengaluru","Goa","Panaji","Madhya Pradesh","Bhopal"};
 
    int pradesh_find(int i,int count)
    {
        if(i==states.length)
            {
                if(count==0)
                {
                   return-1;
                }
                else
                {
                   return count;
                }
            }
        else
        {
            if(states[i].endsWith("Pradesh"))
            {
               System.out.println(states[i]);
               count=count+1;
            }
            return pradesh_find(i+2,count);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        statename obj=new statename();
        int number=obj.pradesh_find(0,0);
        if(number==-1)
        {
            System.out.println("There are no states in the array that have a name ending with Pradesh");
        }
        else
        {
            System.out.println("There are "+number+" states ending with Pradesh");
        }
    }
}
         
        
        
               
                
                
                
        
            
        
        
        
        