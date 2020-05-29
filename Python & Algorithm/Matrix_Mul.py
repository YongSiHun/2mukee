import random
m=int(input("A행렬의 행 수 m 입력 : "))
l=int(input("B행렬의 열 수 l 입력 : "))
n=int(input("A의 열 수, B의 행 수 n 입력 : "))
 
A=[[0 for j in range (n)]for i in range(m)]
B=[[0 for j in range (l)]for i in range(n)]
C=[[0 for j in range (l)]for i in range(m)]
 
print("\nA 행렬 ")
for i in range(0,m):          #A의 원소값 설정 및 출력
    for j in range(0,n):
        A[i][j]=random.randrange(1,10)
        print(A[i][j],end=" ")
    print()
 
print("\nB 행렬")
for i in range(0,n):           #B의 원소값 설정 및 출력
    for j in range(0,l):
        B[i][j]=random.randrange(1,10)
        print(B[i][j],end=" ")
    print()
 
for i in range(0,m):           #C에 대한 A+B 연산
    for j in range(0,l):
        for k in range(0,n):
            C[i][j]+=A[i][k]*B[k][j]
 
print("\nC행렬 ")
for i in range(0,m):
    for j in range(0,n):
        print("%3d"%C[i][j],end=" ")
    print()
