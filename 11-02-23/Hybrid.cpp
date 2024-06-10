#include<iostream>
using namespace std;
class A{
    public:
    A()
    {
        cout<<"A  ";
    }
};
class B:public A{
    public:
    B(){
        cout<<"B ";
    }
};
class C{
    public:
    C(){
        cout<<"C ";
    }
};
class  D:public C,public B{
    public:
    D(){
        cout<<"D ";
    }
};
int main()
{
   freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
D d; 
}