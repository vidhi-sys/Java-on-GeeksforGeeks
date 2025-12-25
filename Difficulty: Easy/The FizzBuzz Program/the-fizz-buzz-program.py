num = int(input())
f="Fizz"
a="Buzz"
c="FizzBuzz"


if num%3==0 and num%5==0:
    print(c)
elif num%3==0:
    print(f)
elif num%5==0:
    print(a)
else:
    print(num)  