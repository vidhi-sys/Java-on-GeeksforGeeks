def multiplicationTable(N):
    #code here 
    for i in range(1,10*N):
        print(i*N,end=" ")
        if i*N==10*N:
            break
    