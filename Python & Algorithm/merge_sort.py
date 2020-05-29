a=[20,30,40,50]
b=[25,35,55,60,70]
c=[]
 
for i in range(0,(len(a)+len(b))):
    c.append(0)
k=0
i=0
j=0
while i<len(a) and j<len(b):
    if (a[i] < b[j]):
        c[k] = a[i]
        i+=1
    elif (b[j] < a[i]):
        c[k] = b[j]
        j += 1
    k+=1
 
while k<len(c):
    if (i==len(a)):
        c[k]=b[j]
        j+=1
    elif (j==len(b)):
        c[k]=a[i]
        i+=1
    k+=1
print("a배열 = ",a,"\nb배열 = ",b,"\nc배열 = ",c)
