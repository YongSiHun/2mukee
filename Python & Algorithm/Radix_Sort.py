radix_queue=[[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0],[0,0]]
data=[15,23,31,49,58,64,72,80,96,7,5,93,81,79,68,54,42,30,26,17]
var_data=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
rest_num=10
div_num=1
K_counter=1

print("입력 데이터")
for i in range(0,20,1):
    print(data[i],end=" ")
    var_data[i]=data[i]
print()

while(div_num<=10):
    for i in range(0, 10, 1):
        n = 0
        for j in range(0, 20, 1):
            if int((var_data[j] % rest_num) / div_num) == i:
                radix_queue[i][n] = var_data[j]
                if (n==0):
                    n += 1
    n=0
    for i in range(0,10,1):
        for j in range(0,2,1):
            var_data[n]=radix_queue[i][j]
            n+=1

    print("\nK",K_counter,"정렬 큐 상태")
    for i in range(0, 10, 1):
        print("큐",i,end=" ")
        for j in range(0, 2, 1):
            print("%3d"%radix_queue[i][j], end=" ")
        print("")

    print("\nK",K_counter,"정렬 자료")
    for i in range(0, 20, 1):
        print(var_data[i], end=" ")
    rest_num*=10
    div_num*=10
    K_counter+=1
    print()
