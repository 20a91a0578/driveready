#include<bits/stdc++.h>
using namespace std;
int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    map<int,int> m;
    int n=3;
    int arr[]={10,40,20};
    for(int j=0;j<n;j++)
{
    m[arr[j]]=j;
}
    map<int,int>::iterator i;
    for(i=m.begin();i!=m.end();i++)
    cout<<i->first<<"    "<<i->second<<endl;
    int j=0;
    for(i=m.begin();i!=m.end();i++)
    {
arr[i->second]=j;
j++;
    }
    for(j=0;j<n;j++)
    cout<<arr[j]<<" ";

}