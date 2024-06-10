#include<iostream>
#include<vector>
using namespace std;
void permut(int n,string &s,string &ds,int frq[])
{
    if(ds.size()==n)
    {
        cout<<ds<<"\n";
        return;
    }
    for(int i=0;i<n;i++)
    {
        if(frq[i]==0)
        {
            frq[i]=1;
            ds.push_back(s[i]);
            permut(n,s,ds,frq);
            frq[i]=0;
            ds.pop_back();
        }
    }
}
int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
   
    // int n=s.size();
    // int frq[3]={0};
    // string ds;
    // permut(n,s,ds,frq);
}
// #include<bits/stdc++.h>

// using namespace std;
// void perm(int n,string &s,string&ds,int fre[])
// {
//       if(ds.size()==n)
//       {
//             cout<<ds<<endl;
//             return;
//       }
//       for(int i=0;i<n;i++)
//       {
//         if(fre[i]==0)
//         {
//             fre[i]=1;
//             ds.push_back(s[i]);
//             perm(n,s,ds,fre);
//             fre[i]=0;
//             ds.pop_back();
//         }
//       }
// }
// int main(){
//     freopen("input.txt","r",stdin);
//     freopen("output.txt","w",stdout);
//     int n;
//     cin>>n;
//     string s;
//     cin>>s;
//     string ds;
//     int fre[3]={0};
// perm(n,s,ds,fre);
    
// }