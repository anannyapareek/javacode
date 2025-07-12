package trees;
//anannya pareek o-713
import java.util.*;
class treenode
{
    treenode right,left;
    int info;
    treenode()
    {
        left=right=null;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        info=sc.nextInt();
    }
}