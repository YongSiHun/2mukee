A=[30,60,90,10,40,80,40,20,10,60,50,30,40,90,80]
 
print("원본 데이터")
for i in range(0,len(A)):
    print(A[i],end=" ")
print()
 
for h in range(5,0,-2):
    for i in range(h,15):
        C_E = A[i]
        j=i
        while j>=h and A[j-h] > C_E :
            A[j] = A[j-h]
            j = j-h
        A[j] = C_E
 
print("정렬된 데이터")
for i in range(0, 15):
    print(A[i], end=" ")
print()
