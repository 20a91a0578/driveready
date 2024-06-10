#include<iostream>
using namespace std;
int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    //to check nth bit is set or not
   int n=43;
    int i=6;
    while(i>0)
    {
        cout<<(n&(1<<i-1))<<endl;
        i-=1;
       // n=n>>1;
    }

}