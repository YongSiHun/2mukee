array=[40,60,70,50,10,20,30]

print("원 배열")
for i in range(0,7,1):
    print(array[i],end=" ")

print("\n\n변환과정")
for j in range(1,7,1):
    rr=array[j]
    i=j-1
    while (i>-1 and array[i]>rr):
        array[i+1]=array[i]
        i=i-1
    array[i+1]=rr
    for o in range(0,7,1):
        print(array[o],end=" ")
    print("")

print("\n최종 배열")
for i in range(0,7,1):
    print(array[i],end=" ")
print("")
