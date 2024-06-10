
#include<iostream>
#include<list>
#include<vector>
#include<algorithm>
#include<string>
//#include<bits/stdc++.h>
using namespace std;

int main()
{
    freopen("input.tx","r",stdin);
    freopen("output.txt","w",stdout);
    vector<int> l;
    /*
    for insertion:::::::::push_back()
    for deletion:::::::::pop()
    */
   l.push_back(12);
   l.push_back(10);
   l.push_back(9);
   l.push_back(8);
   l.pop_back();


   l.push_back(1234);
/*for printing elements of vector we use iterators<<<begin() && end()>>>*/
for(auto l1=l.begin();l1!=l.end();l1++)
  {
     cout<<(*l1)<<"->";
  }
  //find() used for finding element in vector
auto it=find(l.begin(),l.end(),10);
  cout<<endl<<it - l.begin()<<endl;

   
 /*  to know the top element front()
   to know the bottom element back()*/
   cout<<endl<<"frontelement::"<<l.front()<<"\n backelement::  "<<l.back();


}