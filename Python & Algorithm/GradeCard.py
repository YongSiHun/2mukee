subject=[]
name=[]
score=[]

stusum=[]
stuavr=[]

subsum=[]
subavr=[]

subnum=0
namenum=0
scrnum=0
nameinput=0
n=0
m=0
k=0



sub=int(input("과목수를 먼저 추가해야합니다. \n과목을 몇개 추가 하시겠습니까? : "))
for i in range(0,sub,1):
    nameinput=str(input("과목 이름을 입력하시오 : "))
    subject.append(nameinput)
    subnum+=1

nam=int(input("학생을 추가해야합니다.\n몇명을 추가하시겠습니까? : "))
for i in range(0,nam,1):
    nameinput=str(input("학생 이름을 입력하시오 : "))
    name.append(nameinput)
    namenum+=1

print("\n이제 성적을 입력해야 합니다.")
for i in range(0,namenum,1):
    for j in range(0,subnum,1):
        print(name[i],"의 ",subject[j],end=" ")
        nameinput=int(input("점수 : "))
        score.append(nameinput)
        stusum.append(0)
        subsum.append(0)
        scrnum+=1

for i in range(0,namenum,1):
    for j in range(0,subnum,1):
        stusum[i]+=score[n]
        n+=1

for i in range(0,namenum,1):
    ssum=float(stusum[i]/subnum)
    stuavr.append(ssum)

for i in range(0,subnum,1):
    for j in range(0,subnum,1):
        subsum[i]+=score[k]
        k+=subnum
    k=0
    k+=1

for i in range(0,subnum,1):
    ssum=float(subsum[i]/namenum)
    subavr.append(ssum)


print("\n\n성적표가 완성되었습니다.\n")

n = 0
m = 0
print("이름    ", end="  ")
for i in range(0, subnum, 1):
    print(subject[i], end="      ")
print(" 총합     평균")
for i in range(0, namenum, 1):
    print(name[i], end="     ")
    for j in range(0, subnum, 1):
        print(score[n], end="        ")
        n += 1
    print(stusum[m], end="       ")
    print("%.1f" % stuavr[m], end="    ")
    m += 1
    print()
print("총합  ", end="     ")
for i in range(0, subnum, 1):
    print(subsum[i], end="      ")
print("\n평균   ", end="    ")
for i in range(0, subnum, 1):
    print("%.1f" % subavr[i], end="       ")
print()
