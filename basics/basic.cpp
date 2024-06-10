#include<bits/stdc++.h>
using namespace std;
int main(){
// #ifndef ONLINE_JUDGE
// freopen("input.txt","r",stdin);
// freopen("output.txt","w",stdout);
// #endif
// string n;
// cin>>n;
// cout<<n;
int n;
cin>>n;
int q=2*n-1;
int t=0;
        int l=0;       int r=2*n-2;
        int d=2*n-2; 
int a[2*n-1][2*n-1];
for(int i=0;i<q;i++)
{
    for(int j=0;j<q;j++)
    {
        int mie=min(min(i-t,d-i),min(j-l,r-j));
        a[i][j]=n-mie;
            
}
}
for(int i=0;i<q;i++)
{
    for(int j=0;j<q;j++)
    {
        cout<<a[i][j]<<" ";
    }
    cout<<endl;
}}

// OUTPUT::abort
// 4 4 4 4 4 4 4 
// 4 3 3 3 3 3 4 
// 4 3 2 2 2 3 4 
// 4 3 2 1 2 3 4 
// 4 3 2 2 2 3 4 
// 4 3 3 3 3 3 4 
// 4 4 4 4 4 4 4 

