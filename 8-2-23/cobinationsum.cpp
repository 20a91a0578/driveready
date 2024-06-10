#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void subg(int ind,vector<int> c,int n,vector<vector<int>> &v,vector<int> &ds,int t)
{
    cout<<" "<<ind<<" "<<t<<endl;

         if(t==0)
         {
             v.push_back(ds);
             cout<<"\n:";
             return;
         }
         for(int i=ind;i<n;i++)
         {
            
            
             if(i>ind && c[i]==c[i-1])continue;
             if(c[i]>t)break;
             cout<<i<<"\n";
             ds.push_back(c[i]);
             subg(i+1,c,n,v,ds,t-c[i]);
             ds.pop_back();
         }
 
     }
vector<vector<int>> combinationSum2(vector<int>& c, int t) {
        sort(c.begin(),c.end());
        vector<vector<int>> v;
        vector<int> ds;
        subg(0,c,c.size(),v,ds,t);
        return v;
    }

int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    vector<int> c={2,5,2,1,2};
    vector<vector<int>> v=combinationSum2(c,5);
    cout<<endl<<endl<<endl;
    for(auto i:v)
    {
        for(auto j:i)
        cout<<j<<" ";
        cout<<"\n";
    }
}