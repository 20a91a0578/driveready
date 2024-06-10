l=[3,2,7,3]
a=0
b=0
for i in range(0,len(l),2):
        if l[i]>=l[-i-1]:
                a+=l[i]
                b+=l[-i-1]
        else:
                a+=l[-i-1]
                b+=l[i]
return a>b
                
