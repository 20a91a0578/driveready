/*
recursion:::mainly contains 3 stages::: base case,implement,condtion update
*/
#include<bits/stdc++.h>
using namespace std;
// bool ispall(string s,int i,int j)
// {
// if(i>j)
// return true;
// if(s[i]!=s[j])
// return false;
// return ispall(s,i+1,j-1);
// }
// void print(int n){
// if(n>10)return;
// cout<<n<<" ";
// print(n+1);
// cout<<n<<" ";
// }
int  fib(int n)
{
   // cout<<n<<" \n";
    if(n<=1)
    return n;
    else 
    return fib(n-1)+fib(n-2);
}
int main()
{
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
string s;
//cin>>s;
//cout<<ispall(s,0,s.length()-1)<<endl;
int n;
 cin>>n;
 cout<<fib(n);
// print(1);


}