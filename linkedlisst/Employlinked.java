package linkedlisst;
import java.util.*;
class Node
{
    String Name;
    int sno;
    String college;
    Node next;
    public Node(int sno,String Name,String college)
    {
        this.sno=sno;
        this.Name=Name;
        this.college=college;
        next=null;
    }
}
public class Employlinked {
    public static void main(String[] args) {
        Node head;
        Node n1=new Node(201,"abc","aec");
        Node n2=new Node(301,"xyz","acet");
        Node n3=new Node(401,"pqr","acoe");
        head=n1;
        int c=0;
        n1.next=n2;
        n2.next=n3;
        Node ptr=head;
System.out.print("The Linked list is:");
        while(ptr!=null)
        {
            c+=1;
            System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");

ptr=ptr.next;        }
    
    //Insertion at Begining........
    System.out.println("\n\nAfter Inserting new node at begining new list is:");
Node ne=new Node(345,"sde","acs");
ne.next=head;
head=ne;
c=0;
ptr=head;
while(ptr!=null)
{
    c+=1;
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");

ptr=ptr.next;        }


//Inserting at end;
System.out.println("\n\nAfter inserting node at end of the list:");
ne=new Node(582, "jhgfd", "hb8yubi");
ptr=head;
while(ptr.next!=null)
ptr=ptr.next;
ptr.next=ne;
c=0;
ptr=head;
while(ptr!=null)
{
    c+=1;
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");

ptr=ptr.next;        }

Scanner s=new Scanner(System.in);
System.out.println("\nenter at which postion you want to insert:");
int k=3;
ne=new Node(44455, "eerr", "gfhf");
int p=1;
Node pre=head;
ptr=head;
while(p!=k)
{
    p+=1;
    pre=ptr;
    ptr=ptr.next;

}
pre.next=ne;
ne.next=ptr;
System.out.println("\nAfter Inserting given node at given position the list is:");
ptr=head;
int w=0;
while(ptr!=null)
{
    w+=1;
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");

ptr=ptr.next;  
 
    }

    //Searching Operation.
System.out.println("\nSearching for an Element:");
int x=0;
String name="pqr";
ptr=head;
while(ptr!=null)
{
if(ptr.Name.equals(name))
{
    System.out.println("Found");
    x=1;
    break;
}
ptr=ptr.next;
}
if(x==0)
System.out.println("\nNot Found");

//Deletion atBegining
System.out.println("After deleting the begining node:");
head=head.next;
ptr=head;
while(ptr!=null)
{
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");
ptr=ptr.next;  
 
    }
//Deletion at ending
System.out.println("After deleting the ending  node:");
ptr=head;
pre=head;
while(ptr.next!=null)
{
    pre=ptr;
    ptr=ptr.next;
}
pre.next=null;
ptr=head;
while(ptr!=null)
{
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");
ptr=ptr.next;  
 
    }

    //Deleting at given position
 k=3;
 p=1;
 pre=head;
ptr=head;
while(p!=k)
{
    p+=1;
    pre=ptr;
    ptr=ptr.next;

}
pre.next=ptr.next;
//ne.next=ptr;
System.out.println("\nAfter deleting given node at given position the list is:");
ptr=head;
while(ptr!=null)
{
    System.out.print("["+ptr.Name+"-"+ptr.sno+"-"+ptr.college+"]");

ptr=ptr.next;  
 
    }

}
}
