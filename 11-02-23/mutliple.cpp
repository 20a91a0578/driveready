#include<iostream>
using namespace std;
class A{
    public:
    void run(){
        cout<<"hello\n";
    }
};
class B{
    public:
    void run(){
        cout<<"HIIII\n";
    }
};
class C:public B,public  A{
    public :
    C(){
        A::run();
        B::run();
        cout<<"Byeeeee";
    }
};
int main()
{
freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
C c;
}