a=[[2,3,4],[5,3,2],[1,3,2]]
b=[[1,2,3],[3,2,3],[1,3,4]]
bb=[[0,0,0],[0,0,0],[0,0,0]]
c=[[0,0,0],[0,0,0],[0,0,0]]
dummy=0

print("a 행렬")
for i in range(0,3,1):
    for j in range(0,3,1):
        print(a[i][j],end="  ")
    print()

for i in range(0,3,1):
    for j in range(0,3,1):
        dummy=a[i][j]
        a[i][j]=a[j][i]
        a[j][i]=dummy

print("\n\n변환된 a행렬")
for i in range(0,3,1):
    for j in range(0,3,1):
        print(a[i][j],end="  ")
    print()

print("\n\nb 행렬")
for i in range(0,3,1):
    for j in range(0,3,1):
        print(b[i][j],end="  ")
    print()

for i in range(0,3,1):
    for j in range(0,3,1):
        bb[i][j]=b[j][i]

print("\n\n변환된 bb행렬")
for i in range(0,3,1):
    for j in range(0,3,1):
        print(bb[i][j],end="  ")
    print()

print("\n\n행렬곱된 c행렬")
for i in range(0,3,1):
    for j in range(0,3,1):
        for k in range(0,3,1):
            c[i][j]+=a[k][i]*b[j][k]

for i in range(0,3,1):
    for j in range(0,3,1):
        print(c[i][j],end="  ")
    print()
