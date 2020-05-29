def Print():
    for i in range(0, 6, 1):
        for j in range(0, 6, 1):
            print("%4d" % arr[i][j], end="")
        print("")
    print("\n")
 
arr=[[0,1,2,3,4,5],[1,0,4,2,5,99,0],[2,99,0,1,99,4],[3,1,3,0,1,2],[4,-2,99,99,0,2],[5,99,-3,3,1,0]]
min=[0,0]
 
print("Floyd array")
Print()
for k in range(1, len(arr), 1):
    print("K = ",k)
    for i in range(1,len(arr),1):
        if (i!=k):
            for j in range(1,len(arr),1):
                if (j!=k and j!=i):
                    min[0]=arr[i][k]+arr[k][j]
                    min[1]=arr[i][j]
                    if (min[0]<min[1]):
                        output=min[0]
                    else:
                        output=min[1]
                    if (arr[i][j]!=output and output<90):
                        print("arr[", i, "][", j, "] = min{arr[", i, "][", j, "] , arr[", i, "][", k, "]+arr[", k, "][",j, "]} = min{", arr[i][j], ",", arr[i][k], "+", arr[k][j], "} =", output)
                        arr[i][j]=output
    Print()
