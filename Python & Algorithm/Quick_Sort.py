data=[0,8,3,11,9,12,2,6,15,18,10,7,14]
stack=[[0 for j in range (11)]for i in range(2)] #stack create
bound=["lower bound = ","upper bound = "]
low=1 #lower bound
upp=12 #upper bound
i1=1 #전체 수행을 위한 sign
i2=1 #분리된 파일 수행을 위한 sign
top=-1 #Stack Pointer
print("\n sort 대상자료 = ",end="")
for ii in range(1,len(data),1):
    print("%3d"%data[ii],end="")
print()
while(i1!=0):
    i=m=low #1번부터 탐색
    j=upp  #끝부터 탐색
    key=data[low]    #피봇값을 파일의 첫 번 원소로 지정
    while(i<j):
        i+=1
        while(data[i]<key and i< upp): #좌측 배열중 피봇보다 큰 값의 위치 확인
            i+=1
        while(data[j]>key and j > low): #우측 배열중 피봇보다 작은 값의 위치 확인
            j-=1
        if (i<j): #위치확인 인덱스가 엇갈릴때
            print("\nSort 과정 ",end=" ")
            print("  하한 = %2d    상한 = %2d  i = %2d   j = %2d    key위치 = %2d\n결과 자료 = "%(low,upp,i,j,m),end=" ")
            data[i],data[j]=data[j],data[i]
            for ii in range(1,len(data)):
                print("%3d"%data[ii],end="")
    data[m],data[j]=data[j],data[m]
    print("\n\nSort과정 ",end=" ")
    print("  하한 =%2d    상한 = %2d  i = %2d   j = %2d    key위치 = %2d\n결과 자료 = " % (low, upp, i, j, m), end=" ")
    for ii in range(1,len(data)):
        print("%3d"%data[ii],end="")
    if(upp-low >1):
        if (upp>j+1):
            top+=1
            stack[0][top]=j+1
            stack[1][top]=upp
        if (low<j-1):
            top+=1
            stack[0][top]=low
            stack[1][top]=j-1
        print("")
        for ii in range(0,2):
            print("%15s"%bound[ii],end="")
            for jj in range(0,10):
                print("%3d"%stack[ii][jj],end="")
            print()
    if(top==-1):
        i1=0
    else:
        low=stack[0][top]
        stack[0][top]=0
        upp=stack[1][top]
        stack[1][top]=0
        top-=1
print("\nSort 결과 자료 = ",end="")
for ii in range(1,len(data)):
    print("%3d"%data[ii],end="")
print()
