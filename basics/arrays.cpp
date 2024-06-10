#include<bits/stdc++.h>
using namespace std;
//using namespace std;
int main(){
#ifndef ONLINE_JUDGE
freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
#endif
int n;
cin>>n;

// linear search
int a[8]={11,12,13,14,15,16,17,18};
//         0  1  2  3  4  5  6  7
// int k=find(a,a+8,n)-a;
int k=binary_search(a,a+8,n);
cout<<lower_bound(a,a+8,n)-a<<endl;
cout<<upper_bound(a,a+8,n)-a<<endl;

if(k==8)
cout<<"Element not  found   "<<k;
else
cout<<" FOUND   "<<k;
}
