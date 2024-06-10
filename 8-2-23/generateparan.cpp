#include<iostream>
#include<vector>
using namespace std;
  void genera(int n,int o,int c,vector<string> &v,string s)
    {
        if(n==o&&n==c)
        {
            v.push_back(s);
            return;
        }
        if(o<n)
        genera(n,o+1,c,v,s+'(');
        if(c<o)
        genera(n,o,c+1,v,s+')');
    }
vector<string> generateParenthesis(int n) {
     vector<string> v;
     genera(n,0,0,v,"");
     return v;
    }
    int main()
    {
        freopen("input.txt","r",stdin);
        freopen("output.txt","w",stdout);
        int n;
        cin>>n;
        vector<string> k=generateParenthesis(n);
        cout<<k.size();
    }
  