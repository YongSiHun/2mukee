arr=[89,70,35,131,910]
t=10
n=1
 
print("원 배열")
for i in range(0,5,1):
    print(arr[i],end="  ")
print("\n")
 
while (t<=1000):
    for i in range(0,5,1):
        for j in range(0,5,1):
            if int((arr[i]%t)/n)<int((arr[j]%t)/n):
                temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
    print(n,"의 자리 순서정렬")
    for k in range(0, 5, 1):
        print(arr[k], end="  ")
    print("\n")
    t*=10
    n*=10
