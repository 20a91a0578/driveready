n=input()
k=input()
n=list(set(list(n)))
k=list(set(list(k)))
v=0
u=0
for i in n:
    if i not in k:
        v=1
        break
for i in k:
    if i not in n:
        u=1
        break
print(u==0 and v==0)
