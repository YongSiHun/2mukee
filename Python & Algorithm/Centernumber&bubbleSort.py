arr=[]
num=1
i=1
cen=0

while(num!=0):
    print(i,end="")
    num=int(input("번째 숫자 입력 = "))
    arr.append(num)
    i+=1
i=i-2
print("\n입력된 배열자료 ")
for m in range(0,i,1):
    print(arr[m],end="  ")

if (i%2==0):
    print("\n오름차순 정렬 배열 자료 (짝수의 경우)")
    for n in range(0,i,1):
        for j in range(n+1,i,1):
            if (arr[n]>arr[j]):
                dummy=arr[n]
                arr[n]=arr[j]
                arr[j]=dummy
    for k in range(0,i,1):
        print(arr[k],end="  ")
    l=int(k/2)
    cen=int((arr[l]+arr[l+1])/2)
    print("\n중위수 = ",cen)
