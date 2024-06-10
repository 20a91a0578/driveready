#include<iostream>
using namespace std;
int main(){
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int n,l,r,k,x;
    int c=0;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)
    cin>>a[i];
    cin>>k;
    int pr[n+1]={0};
//     while((k--)>0)
//     {
//         c+=1;
// cin>>l>>r>>x;
// for(int z=l;z<=r;z++)
// {
//     a[z]=a[z]+x;c+=1;
// }

// }
while((k--)>0)
    {
        c+=1;
cin>>l>>r>>x;
pr[l]+=x;
pr[r+1]-=x;

}

int w[n];
w[0]=pr[0];
a[0]+=pr[0];
    for(int i=1;i<n;i++)
   {
    w[i]=w[i-1]+pr[i];
    a[i]+=w[i];
    c+=1;
   }
   cout<<c<<"\n";
   for(int i=0;i<n;i++)
   cout<<a[i]<<" ";
}