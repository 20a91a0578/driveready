//package OOPs;
import java.util.*;
public class Movie {
    Scanner s=new Scanner(System.in);
    String movie_name,actor,actress,director,producer;
    int budget;
    float rating;
    void getdetails()
    {
      // System.out.println("\nenter details\n");
        movie_name=s.nextLine();
        actor=s.nextLine();
        actress=s.nextLine();
        director=s.nextLine();
        producer=s.nextLine();
        budget=s.nextInt();
        rating=s.nextFloat();
    }
    void showdetails()
    {
        System.out.println("Moviename:"+movie_name+"\nActor:"+actor+"\nActress:"+actress+"\nDirector:"+director+"\nProducer:"+producer+"\n Budget:"+budget+"\nRating:"+rating);
    }
    public String toString()
    {
        return "Moviename:"+movie_name+"\nActor:"+actor+"\nActress:"+actress+"\nDirector:"+director+"\nProducer:"+producer+"\n Budget:"+budget+"\nRating:"+rating;
    }
public String getActor(){
return actor;
}
public int budget()
{
    return budget;
}
public float getRating(){
return rating;
}

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("how many Movie details you want to store");
        int n=s.nextInt();
        Movie m[]=new Movie[n];
        for(int i=0;i<n;i++)
        {
                m[i]=new Movie();
                m[i].getdetails();
        }
        //System.out.println("Enter the  Actor name:");
        //s.nextLine();
        //String ac=s.nextLine();
        System.out.println("\nThe Movie's in Which Ramcharan or NTR or Prabhas played as actor\n");
        for(int i=0;i<n;i++)
        if(((m[i].actor).equalsIgnoreCase("Ramcharan"))||((m[i].actor).equalsIgnoreCase("NTR")) || ((m[i].actor).equalsIgnoreCase("Prabhas")))
        System.out.println(m[i].movie_name);
        //System.out.println("Enter the  Actress name:");
        //String acs=s.nextLine();
        System.out.println("\nThe Movie's in Which Actor is NTR and Actress is KAJOL \n");
        for(int i=0;i<n;i++)
        if(((m[i].actress).equalsIgnoreCase("KAJOL"))&&((m[i].actor).equalsIgnoreCase("NTR")))
        System.out.println(m[i].movie_name);
        //System.out.println("\nenter the budget:\n");
        //int bud=s.nextInt();
        System.out.println("\nThe movies with budget in range 100 to 300 cr:\n");
        for(int i=0;i<n;i++)
        if(m[i].budget>=100 || m[i].budget<=300)
        System.out.println(m[i].movie_name);
        //System.out.print("\nEnter the rating\n");
       // float rat=s.nextFloat();
        System.out.println("\n Movies with  rating grater than or equal to 7.5:\n");
        for(int i=0;i<n;i++)
        if(m[i].rating>=7.5)
        System.out.println(m[i].movie_name);
s.close();
s.close();
    }
}
//output
/*
Brundhavanam
NTR
KAJOL
teldu
teledu
150
8.5
NAYAK
Ramcharan
KAJOL
teledu
teludu
200
7.5
Darling
Prabhas
KAJOL
teledu
teledu
100
9.0
RRR
RAMcharan
aliabhat
Rajmouli
teledu
300
9.5
Kaidhi no.150
Chiranjeevi
KAJOL
teludu
teledu
175
8.5
*/