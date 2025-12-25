def stringJumper(s):
    for i in range(len(s)):
        # from 0 to length of str and skip 2
        if i%2!=0 :
            continue
        print(s[i], end="")
        #printing character and separating characters by nothing
