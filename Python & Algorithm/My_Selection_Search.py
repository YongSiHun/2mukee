def _print():
    for i in range(1,len(arr)-1):
        print("%3d"%arr[i],end=" ")
    print()
 
arr=[0,8,3,11,9,12,2,6,15,18,10,7,14,13]
sw=1
key = (int(input("키값 입력 : ")))
print("입력자료 배열 : ")
_print()
 
while(sw!=0):
    sw=0
    for r in range(len(arr) - 1, key, -1):
        if (arr[r] < arr[key]):
            arr[r], arr[key] = arr[key], arr[r]
            sw=1
        for l in range(1, key):
            if (arr[key] < arr[l]):
                arr[l], arr[key] = arr[key], arr[l]
                sw=1
print("\nkey 값 기준 재정렬 : ")
_print()
print("\nkey index =%2d  "%key)
print("%d번째 자료 = "%key,end="")
print(arr[key])
