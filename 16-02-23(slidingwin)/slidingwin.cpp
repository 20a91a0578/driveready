//finding maximum average of subarray
#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;
int maxav(vector<int> v,int k)
{
    int n=v.size();
    int j;
    int i=0;
    double su=0;
    double maxi=INT_MIN;
    for(j=0;j<k;j++)
    su+=v[j];
    maxi=su;
    while(j<n){
        su+=v[j];
        su-=v[i];
        i++;
        j++;
        maxi=max(maxi,su);
    }
    return maxi/k;
}
int main()
{
vector<int> v={1,2,3,4,5,6,7,1,1,0,13};
cout<<maxav(v,3);
}