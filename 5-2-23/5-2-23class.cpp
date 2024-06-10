// #include<iostream>
// using namespace std;
// //with recursion
// int digits(int n)
// {
//     if(n==0)return 0;
//     return 1+digits(n/10);
// }
// int main()
// {
//     freopen("input.txt","r",stdin);
//     freopen("output.txt","w",stdout);
//     //to find  no of digits in a number without recursion
//     int n;cin>>n;
//     int s=0,c=0,k=n;
//     while(n>0){
//         c+=1;
//         //for reversing the number
//         s=s*10+n%10;
//         n/=10;
//     }
//     cout<<k<<" reverse ="<<s;
//     }
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    cin>>n;
    for(int i=0;i<n;i++)
    {
        char c;
        cin>>c;
        string s="codeforces";
        if(find(s.begin(),s.end(),c)!=s.end())
        cout<<"YES\n";
        else
        cout<<"NO\n";
    }
}