arr=["원","달러","100","50","20","10","1"]
won=[1000000,1300000,1900000,2100000]
dol=[]
hund=0
fif=0
two=0
ten=0
one=0
dum=0
dor=0

for i in range(0,4,1):
    dor=int(won[i]/1300)
    dol.append(dor)

for i in range(0,7,1):
    print("%4s"%arr[i],end="  ")
print()
for i in range(0,4,1):
    print(won[i],end="    ")
    print(dol[i],end="   ")

    hund=int(dol[i]/100)
    dol[i]-=int(hund*100)
    fif=int(dol[i]/50)
    dol[i]-=int(fif*50)
    two=int(dol[i]/20)
    dol[i]-=int(two*20)
    ten=int(dol[i]/10)
    dol[i]-=int(ten*10)
    one=dol[i]
    print(hund,"   ",fif,"   ",two,"    ",ten,"    ",one,"    ")
