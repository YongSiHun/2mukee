hang_1 = [[0,0,0,0],[0,1,-1,2],[0,3,0,1],[0,1,0,2]]
hang_2 = [[0,0,0,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,0,0],[0,0,0,0,0,0,0]]
 
for i in range(1,4,1):
    for j in range(1,4,1):
        hang_2[i][j]=hang_1[i][j]
 
for i in range(1,4,1):
    for j in range(1,4,1):
        if (i==j):
            hang_2[i][j+3]=1
        else:
            hang_2[i][j+3]=0
 
for i in range(1,4,1):
    temp=hang_2[i][i]
    for j in range(1,7,1):
        hang_2[i][j]/=temp
    for k in range(1,4,1):
        if (i!=k):
            temp=hang_2[k][i]
            for j in range(1,7,1):
                hang_2[k][j]-=(hang_2[i][j]*temp)
 
for i in range(1,4,1):
    for j in range(1,7,1):
        print("%4.1f"%hang_2[i][j],end="  ")
    print()
 
