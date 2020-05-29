data=[60,45,78,36,25,90,74,39,47,16]
print("입력 데이터 리스트 = ",data)
 
for i in range(0,len(data)-1):
    for j in range(i+1,len(data),1):
        if(data[i]>=data[j]):
            data[i],data[j]=data[j],data[i]
print("정렬 데이터 리스트 = ",data)
key= int(input("입력 : 찾고자하는 숫자 입력 (종료시에는 0을 입력) = "))
 
while(key!=0):
    low=0
    high=len(data)-1
    while(low<=high):
        m=int((low+high)/2)
        if(key>data[m]):
            low=m+1
        if(key<data[m]):
            high=m-1
        if(key == data[m]):
            print("출력 : 찾고자하는 값은 %2d이며 이 값은 리스트의 %2d번째에 위치한다"%(key,m+1))
            break
    if(high<low):
        print("출력 : 찾고자하는 값은 %2d이며 이 값은 리스트에 존재하지 않는다"%key)
    key = int(input("입력 : 찾고자하는 숫자 입력 (종료시에는 0을 입력) = "))
