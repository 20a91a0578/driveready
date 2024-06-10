#include<iostream>
#include<vector>
using namespace std;
vector<int> v;
void  alloccur(int a[],int i,int n,int k)
{
if(n==0)
return;
if(a[i]==k)
{
    v.push_back(i);
    return alloccur(a,i+1,n-1,k);
}
else
return alloccur(a,i+1,n-1,k);
}
int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int a[]={1,2,3,4,5,6,5,6,5};
    int k=5;
    int n=sizeof(a)/sizeof(int);
    alloccur(a,0,n,k);
    for(int i=0;i<v.size();i++)
    cout<<v[i]<<" ";
}