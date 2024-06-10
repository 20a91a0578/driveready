#include<iostream>
#include<vector>
#include<numeric>
#include<list>
#include<bits/stdc++.h>
using namespace std;
void show(queue<int> l)
{
    while(!l.empty())
    {
        cout<<l.front()<<" ";
        l.pop();
    }
}
int main() {
    queue<int> l;
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    queue<int> l2;
    l2.push(1);
    l2.push(2);
    l2.push(3);
    l2.push(4);
    cout<<"front::::      "<<l2.front()<<endl<<l2.back();
    //show(l2);

}