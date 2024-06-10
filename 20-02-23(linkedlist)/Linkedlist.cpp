#include<bits/stdc++.h>
using namespace std;
class Linkedlist{
   public:
    struct Node
    {
        int data;
        Node* next;
        Node(int val){
            this->data=val;
            this->next=nullptr;
        }
        /* data */
    };
  Node* head=nullptr;
  Node* tail=nullptr;
  Linkedlist()
  {
    head=nullptr;
    tail=nullptr;
  }
  //insert end
    void insert(int data){
        Node* j=new Node(data);
        if(head==nullptr)
        {
            head=j;
        tail=j;
        return;
        }
        tail->next=j;
      
        tail=tail->next;
    }
    //insert begin
    void insertbeg(int data){
        Node* j=new Node(data);
        if(head==nullptr)
        {
            head=j;
            tail=j;
            return;
        }
        j->next=head;
        head=j;
    }
   void insertPos(int x,int pos){
    Node* j=new Node(x);
    if(pos==1)
    {
        j->next=head;
        head=j;
    }
    else{
      int  c=0;
        Node* p=head;
        Node* q=p;
        while(p!=nullptr)
        {
            c+=1;
            if(c==pos)
            break;
            q=p;
            p=p->next;
        }
        q->next=j;
        j->next=p;

    }
   }
    void print(){
        Node* t=head;
        while(t)
        {
            cout<<t->data<<" ";
            t=t->next;
        }
        cout<<"\n";
    }
    
};
int main(){
    Linkedlist list;
    list.insertbeg(9);
    list.insert(6);
    list.insert(4);
     list.insertbeg(9);
    list.insert(56);
    list.insertbeg(9);
    list.print();
    list.insertPos(23,2);
    list.print();
    list.insertPos(999,8);
    list.print();
    list.insertPos(1000,1);
    list.print();
}
