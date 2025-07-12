package trees;
//anannya pareek O-713
import java.util.*;
class tree
{
    treenode root,curr,prevnode,newroot,node;
    node start;
    int count=0;
    void create()
    {
        curr=new treenode();
        while(true)
        {
            treenode newNode=new treenode();
            newNode.input();
            if(newNode.info==0)
                break;
            if(root==null)
                root=newNode;
            else
            {
                curr=root;
                while(true)
                {                    
                    if(curr.info<newNode.info)
                    {
                        if(curr.right==null)
                        {
                            curr.right=newNode;
                            break ;
                        }
                        curr=curr.right;
                    }
                    if(curr.info>newNode.info)
                    {
                        if(curr.left==null)
                        {
                            curr.left=newNode;
                            break ;
                        }
                        curr=curr.left;
                    }
                }
            }
        }
    }

    void traversal() //stack
    {
        curr=root;
        count=0;
        while(curr!=null)
        {
            while(curr!=null)
            {
                if(curr.right==null && curr.left==null)
                    count=count+1;
                System.out.println("The number is"+curr.info);
                if(curr.right!=null)
                    push(curr.right);
                curr=curr.left;
            }
            curr=pop();       
        }
        System.out.println("The total number of leaves in the tree are: "+count);
    }

    void delete()
    {  
        treenode temp=new treenode();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the node to be deleted: ");
        int node=sc.nextInt();
        curr=root;

        while(curr!=null)
        {   
            if(node>curr.info)
            {
                prevnode=curr;
                curr=curr.right;
            }
            if(node<curr.info)
            {
                prevnode=curr;
                curr=curr.left;
            }
            if(curr.info==node)
            {
                if(curr.left==null && curr.right==null)//when have to delete leaf node
                {
                    temp=curr;
                    prevnode.left=null;
                    prevnode.right=null;
                    System.out.println("The node deleted is "+temp.info);
                    break;
                }
                else if(curr.right!=null && curr.left==null)//When left is null
                {
                    temp=curr;
                    prevnode.right=curr.right;
                    System.out.println("The node deleted is "+temp.info);
                    break;
                }
                else if(curr.left!=null && curr.right==null)//when right is null
                {
                    temp=curr;
                    prevnode.left=curr.left;
                    System.out.println("The node deleted is "+temp.info);
                    break;
                }
                else//When both the nodes have children
                {
                    if(prevnode.right==curr)
                    {
                        temp=curr.right;
                        System.out.println("the deleted node is "+curr.info);
                        prevnode.right=curr.left;
                        curr=curr.left;
                        while(curr!=null)
                        {
                            if(curr.right==null)
                            {
                                curr.right=temp;
                                break;
                            }
                            curr=curr.right;
                        }
                        break;
                    }
                    if(prevnode.left==curr)
                    {
                        temp=curr.left;
                        System.out.println("the deleted node is "+curr.info);
                        prevnode.left=curr.left;
                        curr=curr.left;
                        while(curr!=null)
                        {
                            if(curr.right==null)
                            {
                                curr.right=temp;
                                break;
                            }
                            curr=curr.right;
                        }
                        break;
                    }
                }
            } 
        }

    }

    /** void split()
    {
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    prevnode= new treenode();
    curr=root;
    while(curr!=null)
    {
    while(curr!=null)
    {
    if(curr.left.info==no && curr.right.info)
    {
    prevnode=curr;
    curr=curr.left;
    newroot=curr;
    prevnode.right=null;
    prevnode.left=null;
    break;
    }
    if(curr.right.info==no)
    {
    prevnode=curr;
    curr=curr.right;
    newroot=curr;
    prevnode.right=null;
    prevnode.left=null;
    break;
    }
    if(curr.right!=null)
    push(curr.right);
    curr=curr.left;
    }
    curr=pop();       
    }
    }*/

    void push(treenode p)
    {
        node ptr=new node();
        ptr.info=p;
        if(start==null)
            start=ptr;
        else
        {
            ptr.next=start;
            start=ptr;
        }
    }

    treenode pop()
    {
        if(start==null)
            return null;
        else
        {
            treenode tn=start.info;
            start=start.next;
            return tn;
        }
    }

    public static void main(String args[])
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        tree obj=new tree();
        obj.create();
        obj.traversal();
        obj.delete();
        obj.traversal();
    }
}
/**
 * Preorder Traversal:
 *Enter the number: 1000
Enter the number: 500
Enter the number: 2000
Enter the number: 1500
Enter the number: 4000
Enter the number: 1800
Enter the number: 2500
Enter the number: 800
Enter the number: 250
Enter the number: 450
Enter the number: 0
The number is1000
The number is500
The number is250
The number is450
The number is800
The number is2000
The number is1500
The number is1800
The number is4000
The number is2500
The total number of leaves in the tree are: 4

**When both nodes have children:
*case 1:
Enter the number: 1000
Enter the number: 2000
Enter the number: 1500
Enter the number: 2500
Enter the number: 3000
Enter the number: 500
Enter the number: 250
Enter the number: 150
Enter the number: 400
Enter the number: 0
The number is1000
The number is500
The number is250
The number is150
The number is400
The number is2000
The number is1500
The number is2500
The number is3000
The total number of leaves in the tree are: 4
Enter the node to be deleted: 
500
The node deleted is 500
The number is1000
The number is250
The number is150
The number is400
The number is2000
The number is1500
The number is2500
The number is3000
The total number of leaves in the tree are: 4

*case 2:
Enter the number: 1000
Enter the number: 500
Enter the number: 2000
Enter the number: 1500
Enter the number: 2500
Enter the number: 3000
Enter the number: 250
Enter the number: 150
Enter the number: 400
Enter the number: 0
The number is1000
The number is500
The number is250
The number is150
The number is400
The number is2000
The number is1500
The number is2500
The number is3000
The total number of leaves in the tree are: 4
Enter the node to be deleted: 
2000
the deleted node is 2000
The number is1000
The number is500
The number is250
The number is150
The number is400
The number is1500
The number is2500
The number is3000
The total number of leaves in the tree are: 3

*When left is null:
Enter the number: 1000
Enter the number: 500
Enter the number: 2000
Enter the number: 250
Enter the number: 2500
Enter the number: 3000
Enter the number: 0
The number is1000
The number is500
The number is250
The number is2000
The number is2500
The number is3000
The total number of leaves in the tree are: 2
Enter the node to be deleted: 
2000
The node deleted is 2000
The number is1000
The number is500
The number is250
The number is2500
The number is3000
The total number of leaves in the tree are: 2


*When deleted node is leaf node:
Enter the number: 1000
Enter the number: 500
Enter the number: 150
Enter the number: 50
Enter the number: 400
Enter the number: 2000
Enter the number: 1500
Enter the number: 2500
Enter the number: 0
The number is1000
The number is500
The number is150
The number is50
The number is400
The number is2000
The number is1500
The number is2500
The total number of leaves in the tree are: 4
Enter the node to be deleted: 
1500
The node deleted is 1500
The number is1000
The number is500
The number is150
The number is50
The number is400
The number is2000
The total number of leaves in the tree are: 3

*When right is null:
*
*/

