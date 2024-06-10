#include<bits/stdc++.h>
using namespace std;
int main(){
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    //declaring strings
    string s1;
    string s2="hello";
    char s3[]={'k','l','m','\0'};
    getline(cin,s1);
   // s2.append("#$%^&*");
    //s1.clear()  toempty whole data
    //to remove particular word=====s.erase(starting index,end index)
    cout<<s1<<endl<<s2<<endl<<s3<<endl<<s1.empty()<<endl<<s1.compare(s2)<<endl;
    
}