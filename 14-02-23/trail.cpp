/* Listnode for linked list:

ListNode {
    int val;
    ListNode* next;
    ListNode(int x) {
        val = x;
        next = NULL;
    }
};

*/

    ListNode* reverse(ListNode* h)
    {
        ListNode* p=NULL;
        ListNode* n=NULL;
        ListNode* c=h;
        while(c!=NULL)
        {
            n=c->next;
            c->next=p;
            p=c;
            c=n;
        }
        return p;
    }
    //Function to add two numbers represented by linked list.
    ListNode* addTwoNumbers(ListNode* first, ListNode* second)
    {
        // code here
       ListNode* p=first;
       ListNode* q=second;
       int f=0,s=0;
       while(p!=NULL)
       {
           f+=1;
           p=p->next;
       }
       while(q!=NULL)
       {
           s+=1;
           q=q->next;
       }
     
       p=reverse(first);
       q=reverse(second);
       int su=0;
       ListNode* i=p;
       ListNode* l=q;
       if(f>s)
       {
           while(q!=NULL)
           {
               if(p->val+q->val+su>=10)
               {
                   p->val=(q->val+p->val+su)%10;
                   su=1;
               }
               else
               {
                   p->val=p->val+q->val+su;
               su=0;
               }
             //  cout<<p->val<<": ";
                p=p->next;
               q=q->next;
        }
        ListNode* w=p;
        while(p!=NULL)
        {
            if(p->val+su>=10)
            {
                p->val=(p->val+su)%10;
                su=1;
            }
            else
            {
                
                p->val=p->val+su;
                su=0;
            }
            w=p;
            p=p->next;
        }
        if(su==1)
        {
            ListNode* y=new ListNode(su);
            w->next=y;
        }
        return reverse(i);
    }
    else if(f<s)
    {
        while(p!=NULL)
        {
            if(p->val+q->val+su>=10)
               {
                   q->val=(q->val+p->val+su)%10;
                   su=1;
               }
               else
               {
                   q->val=p->val+q->val+su;
               su=0;
               }
               //cout<<q->val<<": ";
               p=p->next;
               q=q->next;
        }
        ListNode* w=q;
        while(q!=NULL)
        {
            if(q->val+su>=10)
            {
                q->val=(q->val+su)%10;
                su=1;
            }
            else
            {
                
                q->val=q->val+su;
                su=0;
            }
            w=q;
            q=q->next;
        }
        if(su==1)
        {
            ListNode* y=new ListNode(su);
            w->next=y;
        }
         return reverse(l);
    }
    else
    {
        ListNode* a=p;
      while(q!=NULL)
           {
               if(p->val+q->val+su>=10)
               {
                   p->val=(q->val+p->val+su)%10;
                   su=1;
               }
               else
               {
                   p->val=p->val+q->val+su;
               su=0;
               }
             //  cout<<p->val<<": ";
             a=p;
                p=p->next;
               q=q->next;
        }  
        if(su==1)
        {
            ListNode* n=new ListNode(su);
            a->next=n;
        }
    }
    return  reverse(i);
   
    
        
    }
