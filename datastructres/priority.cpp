#include<iostream>
#include<vector>
#include<numeric>
#include<list>
#include<bits/stdc++.h>
using namespace std;
int main() {
    priority_queue<int> l;
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    /*
    for insertion push() , push(),emplace() , emplace() are used
    for deletion pop() , pop() are used
    back() used toknow back element
    front() used to know front element
    */
   l.push(8);
   l.push(23456);
   l.push(56);
   l.emplace(566);
   l.emplace(12345);
   l.pop();
  cout<<l.top();
   while(!l.empty())
   {
    cout<<l.top()<<" ";
    l.pop();
   }

}
