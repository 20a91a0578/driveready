#include<iostream>
#include<vector>
using namespace std;
void printsubset(int ind,int a[],int n,vector<int> &ds,vector<vector<int>> &v)
{
    if(ind==n)
    {
        v.push_back(ds);
        for(auto i:ds)
        cout<<i<<" ";
        cout<<"\n";
        return;
    }
    ds.push_back(a[ind]);
    printsubset(ind+1,a,n,ds,v);
    ds.pop_back();
    printsubset(ind+1,a,n,ds,v);
}
/*
comibination sum
subsets
subsets II
*/
int main(){
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int a[]={1,2,3};
    int n=sizeof(a)/sizeof(int);
    vector<int> ds;
    vector<vector<int>> v; 
    printsubset(0,a,n,ds,v);
    for(auto i:v)
    {
        for(auto j:i)
        cout<<j<<" ";
        cout<<endl;
    }
}