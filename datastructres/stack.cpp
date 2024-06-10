#include<iostream>
#include<vector>
#include<numeric>
#include<list>
#include<stack>
using namespace std;
int main() {
    stack<int> l;
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    /*
    for insertion push() used
    for deletion pop() used
    back() used toknow back element
    front() used to know front element
    top() used to know the top element;
    tocheck stack is empty or not use emmpty()
    */
   l.push(8);
   l.push(56);
l.push(34);
l.push(234);
l.push(234567);
  
  cout<<"top element::::"<<l.top()<<endl;
 while(!l.empty())
{
    cout<<l.top()<<" ";
    l.pop();
}
}
