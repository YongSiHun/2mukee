array=[40,70,60,30,10,50]

print("원 배열")
for i in range(0,6,1):
    print(array[i],end=" ")

print("\n\n변환 과정")
for i in range(0,5,1):
    min=i
    for j in range(i+1,6,1):
        if (array[j]<array[min]):
            min=j
    temp=array[i]
    array[i]=array[min]
    array[min]=temp
    for o in range(0,6,1):
        print(array[o],end= " ")
    print("")




print("\n변환된 배열")
for i in range(0,6,1):
    print(array[i],end=" ")
