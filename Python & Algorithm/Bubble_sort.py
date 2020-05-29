array=[47,68,96,27,13]

print("원 배열")
for i in range(0,5,1):
    print(array[i],end=" ")

print("\n\n변환 과정")
for i in range(0,5,1):
    print(i+1,"번째 회전")
    for j in range(0,4,1):
        if (array[j] > array[j + 1]):
            temp = array[j]
            array[j] = array[j + 1]
            array[j + 1] = temp
        for k in range(0, 5, 1):
            print(array[k], end=" ")
        print(" ")


print("\n변환된 배열")
for i in range(0,5,1):
    print(array[i],end=" ")
