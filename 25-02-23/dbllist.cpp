#include<iostream>
// #include<vector>
#include<queue>
using namespace std;
class Node{
   public:
 
        int data;
        Node* left;
        Node* right;
        Node(int val){
            data=val;
            left=nullptr;
            right=nullptr;
        
        /* data */
    }

};
void inordertrav(Node* root)
{
    if(root==nullptr)
    return;
    inordertrav(root->left);
    cout<<root->data<<" ";
    inordertrav(root->right);
}
void preordertrav(Node* root)
{
    if(root==nullptr)
    return ;
    cout<<root->data<<" ";
    preordertrav(root->left);
    preordertrav(root->right);

}
void postordertrav(Node* root)
{
    if(root==nullptr)
    return;
    postordertrav(root->left);
    postordertrav(root->right);
    cout<<root->data<<" ";
}
// void leverorder1(Node* root)
// {
//     queue<Node* >q;
//   q.push(root);
//   while(!(q.empty()))
//   {
//     Node *temp=q.front();
//     q.pop();
//     if(temp!=NULL)
//     {
//       cout<<temp->data<<" ";
//     }
//     if(temp->left!=NULL)
//     {
//       q.push(temp->left);

//     }
//     if(temp->right!=NULL)
//     {
//       q.push(root->right);
//     }
//   }

// }
void levelorder(Node* root,int l,vector<vector<int>> &v)
{
    if(root==NULL)
    return;
   // cout<<root->data<<" ";
    if(v.size()==l)
    v.push_back({root->data});
    else
    v[l].push_back(root->data);
    levelorder(root->left,l+1,v);
    levelorder(root->right,l+1,v);

}
int main()
{
     freopen("input.txt","r",stdin);
   freopen("output.txt","w",stdout);
    Node* root=new Node(10);

root->left=new Node(20);
root->right=new Node(23);
root->left->left=new Node(89);
root->left->right=new Node(47);
root->right->left=new Node(54);
root->right->right=new Node(356);
vector<vector<int>> v;
//leverorder1(root);
// cout<<"\n";
levelorder(root,0,v);
for(int i=0;i<v.size();i++)
{
    for(auto j:v[i])
cout<<j<<" ";
cout<<"\n";
}
// inordertrav(root);
// cout<<"\n";
// preordertrav(root);
// cout<<"\n";
// postordertrav(root);
// cout<<"\n";
   
}