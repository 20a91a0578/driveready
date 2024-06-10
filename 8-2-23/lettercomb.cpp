#include<iostream>
#include<vector>
using  namespace std; 
vector<string> sl;
string l[10]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
void comb(int i,string &d,int n,string k)
    {
        if(i==n)
        {
         cout<<k<<"\n";
           sl.push_back(k);
            return;
        }
        int x=d[i]-'0';
        for(char c:l[x])
        {
            comb(i+1,d,n,k+c);
        }
    }
    int main()
    {
        freopen("input.txt","r",stdin);
        freopen("output.txt","w",stdout);
        //string k="456";
        string k;
        cin>>k;
        comb(0,k,k.length(),"");
        cout<<sl.size();
      
    }
   