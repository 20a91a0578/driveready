#include<iostream>
using namespace std;
void printsub(int a[],int n)
{
    for(int i=0;i<n;i++)
    {
        for(int j=i;j<n;j++)
        {
            cout<<"[";
            for(int k=i;k<=j;k++)
            cout<<a[k]<<" ";
            cout<<"]"<<endl;
        }
    }
}
void printsubset(int a[],int n)
{
    for(int i=0;i<(1<<n);i++)
    {
        for(int j=0;j<n;j++)
        {
            if(i&(1<<j))
            cout<<a[j]<<" ";
        }
        cout<<endl;
    }
}
int main()
{
   freopen("input.txt","r",stdin);
   freopen("output.txt","w",stdout);
    int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    printsubset(a,n);
}