//package OOPs;

//import javax.print.attribute.standard.MediaSize.NA;

class Author {
    String name,email;
    char gender;
    Author(String name,String email,char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public void displayAuthirdetails()
    {
        System.out.println("Author_Name:"+name+"\nEmail:"+email+"\nGender:"+gender);
    }
}
class Book
{
String Name;
float price;
int qty;
Author a;
public Book(String Name,float price,int qty,Author a)
{
    this.Name=Name;
    this.price=price;
    this.qty=qty;
    this.a=a;
}
public void displayBookdetails()
{
    System.out.println("Book_name:"+Name);
    a.displayAuthirdetails();
    System.out.print("Price:Rs."+price+"\nBooks Published:"+qty+"\n");
}
}

public class WiproTask {
    public static void main(String[] args) {
        Author a=new Author("M.Srinu","m.srinu@gmail.com",'M');
        Book b=new Book("Java", 50, 15, a);
        b.displayBookdetails();
    }
}
