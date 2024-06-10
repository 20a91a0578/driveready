#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    int cur_max=1;
    int cur_min=1;
    int f=1;
    for(int i=0;i<n;i++)
    {
        cur_max*=cur_max;
        if(cur_max<0)
        {
            cur_min=cur_max;
            cur_max=1;
        }
    }
}