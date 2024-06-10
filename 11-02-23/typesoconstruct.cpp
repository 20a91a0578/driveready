#include<iostream>
using namespace std;
class A{
    public:
    int a;
    A(){
        cout<<"Default Constructor\n";
    }
    A(int a)
    {
        this->a=a;
        cout<<"\nparameterizes constructor:: "<<a<<"\n";
    }
    A(A &a){
        cout<<"Copy Constructor\n";
this->a=a.a;
    }
};
int main()
{
freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
A a;
A b(4);
A c(b);
cout<<c.a;

}