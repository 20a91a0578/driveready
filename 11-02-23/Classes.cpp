#include<iostream>
using namespace std;
//to create a class 
class Demo
{
protected:
void run(){
    cout<<"Base Class\n";
}
};
//to inherit classes we use "" : "" symbols
//single level inheritance
class fr : public Demo{
protected:
void kill(){
    run();
    cout<<"Sinlge inheritance\n\n ";
}
} ;
//Multilevel Inheritance
class Demo2:public fr{
public:
void demo()
{
    kill();
    cout<<"\nHierarichal inheritance";
}
};
//Hierarical Inheritance
class Demo11:public Demo
{
    public:
    void demo11(){
        run();
        cout<<"HierarichalInheritance 1\n";
    }
};
class Demo12:public Demo{
    public:
    void demo12(){
        run();
        cout<<"HierarichalInheritance 2\n";
    }
};
class Demo22:public Demo11,public Demo12{
public :

};
int main()
{
freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
//Base Class
// Demo d;
// d.run();
//Single Inheritance
// fr f;
// f.kill();
//Multilevel  Inheritance
// Demo2 d;
// d.demo();
//Hierarichal  Inheritance
Demo11  q;
q.demo11();
Demo12 w;
w.demo12();
}