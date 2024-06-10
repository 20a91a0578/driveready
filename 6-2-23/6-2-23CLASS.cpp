#include<iostream>
using namespace std;
//to find whether array is sorted or not using recursion
string issorted(int a[],int i,int n)
{
    if(i==n-1)return "array is sorted";
    if(a[i]<a[i+1])return issorted(a,i+1,n);
    else return "array is not sorted";
}
//to find whether array is sorted or not using recursion with out using extra variboe
string issorted(int *a,int n)
{
    if(n==1)return "array is sorted";
    if(a[0]<a[1])return issorted(a+1,n-1);
    else return "array is not sorted";
}
//to know the index of first occurance of element with recursion & without using extra  variable 
int firstoccur(int *a,int n,int k){
    if(n==0)
    return -1;
    if(a[0]==k)
    return 0;
    if(firstoccur(a+1,n-1,k)==-1)
    return -1;
    else return 1+firstoccur(a+1,n-1,k);
}
int lastoccur(int *a,int n,int k)
{
    if(n==0)return -1;
    int i=lastoccur(a-1,n-1,k);
    if(i==-1)
    {
        if(a[0]==k)
        return 0;
        return -1;
    }
    return i+1;
}
int main(){
    freopen("input.txt","r",stdin);
    freopen("output.txt","w",stdout);
    int a[]={0,1,2,3,4,5,5,5,5,6,8,7,8,6};
    int n=sizeof(a)/sizeof(int);
    cout<<n<<endl;
    cout<<firstoccur(a,n,5)<<endl;
    cout<<n-lastoccur(a+n-1,n,5);
    // cout<<issorted(a,n);
    // cout<<issorted(a,0,n-1);'


}