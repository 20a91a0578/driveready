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
    if(!vis[j])
    DFS(j,adj,vis);
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
            if(!vis[it]){
                q.push(it);
                vis[it]=1;
            }
        }
    }
}


int main(){
    freopen("input.txt","r",stdin);
freopen("output.txt","w",stdout);
int n,e,u,v;
cin>>n>>e;
vector<int> ind(n+1,0);
vector<int> out(n+1,0);
vector<int> adj[n+1];
for(int i=0;i<e;i++)
{
cin>>u>>v;
adj[u].push_back(v);
ind[v]++;
out[u]++;
}
cout<<"\n InDEGREE:\n";
for(int i=0;i<n+1;i++)
cout<<"indeg "<<i<<"= "<<ind[i]<<"\n";
cout<<"\n OUtDEGREE:\n";
for(int i=0;i<n+1;i++)
cout<<"outdeg "<<i<<"= "<<out[i]<<"\n";
vector<int> vis(n+1,0);
//DFS
//DFS(1,adj,vis);
BFS(1,adj,vis);
}