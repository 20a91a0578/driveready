#include<iostream>
#include<vector>
#include<queue>
using namespace std;

//DFS TRAVERSAL
void DFS(int node,vector<int> adj[],vector<int> &vis)
{
    vis[node]=1;
    cout<<node<<" ";
    for(auto j: adj[node])
   {
     if(!vis[j])
    {
        DFS(j,adj,vis);
    }
   }
}
void  BFS(int node,vector<int> adj[],vector<int> &vis){
    queue<int> q;
    q.push(node);
    vis[node]=1;
    while(!q.empty())
    {
        node=q.front();
        cout<<node<<" ";
        q.pop();
        for(auto it:adj[node])
        {
            if(!vis[node]){
                q.push(it);
                vis[it]=1;
            }
        }
    }
}


int main(){
    freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
int n,e;
cin>>n>>e;
// //-----------------> MaTRIX REPRESENTATION  <-------------------
// int mat[n+1][n+1];
// int v,u;
// for(int i=0;i<n+1;i++)
// {
// for(int j=0;j<n+1;j++)
// mat[i][j]=0;
// }
// for(int i=0;i<e;i++)
// {
//     cin>>v>>u;
//     mat[u][v]=1;
//     mat[v][u]=1;
// }
// for(int i=0;i<n+1;i++)
// {
// for(int j=0;j<n+1;j++)
// cout<<mat[i][j]<<" ";
//     cout<<"\n";
// }


// ----------->ADJACENT LIST <----------------

//TO KNOW THE DEGREE OF EACH NODE WE ADD INCREEMENT THE NODE VALUE IN DEGREE VECTOR DURING INPUT
vector<int> deg(n+1,0);
vector<int> adj[n+1];
int u,v;
for(int i=0;i<e;i++)
{
    cin>>u>>v;
    adj[u].push_back(v);
    adj[v].push_back(u);
    deg[v]+=1;
    deg[u]+=1;
}
//DEGREE OF NODE.....
// for(int i=0;i<n+1;i++)
// {
//     cout<<"degree of "<<i<<" = "<<deg[i]<<"\n";
// }
// for(int i=0;i<n+1;i++)
// {
//     cout<<i<<" :";
//     for(auto j:adj[i])
//     cout<<j<<" ";
//     cout<<"\n";
// }
vector<int>  vis(n+1,0);
int C=0;
//TO KNOW THE NUMBER OF COMPONENTS IN GRAPH CAN BE FOUND
//BY CALCULATING NUMBER OF DFS CALLS MADE
// for(int i=1;i<n+1;i++)
// {
//     if(!vis[i])
//     {
//         C+=1;
//         DFS(i,adj,vis);
//     }
// } 
DFS(1,adj,vis);
// cout<<"\n"<<C;


}