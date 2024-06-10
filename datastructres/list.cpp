#include<iostream>
#include<vector>
#include<numeric>
#include<list>
using namespace std;
int main() {
    list<int> l;
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    /*
    for insertion push_back() , push_front(),emplace_back() , emplace_front() are used
    for deletion pop_back() , pop_front() are used
    back() used toknow back element
    front() used to know front element
    */
   l.push_back(8);
   l.push_front(56);
   l.emplace_back(566);
   l.emplace_front(12345);
   for(auto i=l.begin();i!=l.end();i++)
   cout<<(*i)<<" ";
   cout<<endl;
   l.pop_back();
   l.pop_front();
   for(auto i=l.begin();i!=l.end();i++)
   cout<<(*i)<<" ";
   cout<<endl;

   cout<<l.front()<<" back: "<<l.back()<<endl;
   l.reverse();
   for(auto i=l.begin();i!=l.end();i++)
   cout<<(*i)<<" ";
   cout<<endl;

}
