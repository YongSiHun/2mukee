def matching(origin,inpute):
    correct_count = 0
    i = 0
    sw = 0
    while (correct_count != len(inpute)):
        j = 0
        correct_count = 0
        if(i==len(origin)):
            print("\n일치하는 값이 없습니다.")
            return
        while (sw == 0 and origin[i + j] == inpute[j]):
            j += 1
            correct_count += 1
            if (correct_count == len(inpute)):
                s = i
                sw = 1
        i += 1
    printing(s)
 
def printing(s):
    print("start point is ", s + 1)
    print("origin string start by search point : ", end="")
    for i in range(s, len(inpute) + s):
        print(origin[i], end=" ")
 
origin="ababaabbababba"
print("origin string = ",origin)
option=1
while(option!=0):
    inpute = str(input("검색할 값 입력 : "))
    matching(origin, inpute)
    option=int(input("\n검색을 계속하려면 아무숫자, 중단하려면 0 입력 : "))
