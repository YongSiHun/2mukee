origin="aaaaaefbbbbbbcdefg"
encoding=""
decoding=""
count=0
i=0
print("original string =",origin)
while i<len(origin):
    temp=origin[i]
    while i< len(origin) and origin[i] == temp:
        count+=1
        i+=1
    if (count < 3):
        encoding+=temp
        count=0
    if (3 <= count):
        encoding+='&'+str(count)+temp
        count=0
print("encoded string =",encoding)
i=0
while(i<len(encoding)):
    if (encoding[i]=='&'):
        count=int(encoding[i+1])
        temp=encoding[i+2]
        for j in range(0,count,1):
            decoding+=temp
        i+=3
    else:
        decoding+=encoding[i]
        i+=1
print("decoded string =",decoding)
