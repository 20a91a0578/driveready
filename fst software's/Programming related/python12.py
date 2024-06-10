##
##import math as m
##def isperfect(k):
##    s=1
##    i=2
##    l=int(m.sqrt(k))
##    while i!=l+1:
##        if k%i==0:
##            s=s+i+(k//i)
##        i+=1
##    print(s)
##    if s==k:
##        return True
##    else:
##        return False
##
##t=int(input())
##for _ in range(t):
##    n=int(input())
##    res=isperfect(n)
##    print(n,' is perfect number') if res else print(n,' is not perfect number')
##
##
##
##
##def isspy(n):
##    s=0
##    p=1
##    while n:
##        r=n%10
##        s+=r
##        p*=r
##        n=n//10
##    if s==p:
##        return True
##    else:
##        return False
##
##
##
##t=int(input())
##for _ in range(t):
##    n=int(input())
##    res=isspy(n)
##    print(res)
##
##
##
##
##import math as m
##def isautomorph(n):
##    k=str(n)
##    l=len(k)
##    p=n**2
##    o=int(p%(m.pow(10,l)))
##    if n==o:
##        return True
##    else:
##        return False
##
##
##t=int(input())
##for _ in range(t):
##    n=int(input())
##    res=isautomorph(n)
##    print(res)
##
##
##import math as m
##def isprim(n):
##    l=int(m.sqrt(n))
##    for i in range(2,l+1):
##        if n%i==0:
##            return False
##    return True
##def issemiprim(n):
##    l=int(m.sqrt(n))
##    for i in range(2,l+1):
##        if n%i==0:
##            if isprim(i) and isprim(n//i):
##                return True
##    return False
##
##
##def isselfdivid(n):
##    t=n
##    while t>0:
##        r=t%10
##        if n%r!=0:
##            return False
##        t=t//10
##    return True
##
##
##t=int(input())
##for _ in range(t):
##    n=int(input())
##    res=isselfdivid(n)
##    print(res)
##
##
##
##russian peasent algorith for multiplication
##
##
##
##
##def multip(a,b):
##    c=0
##    while a>0:
##        
##        if a%2!=0:
##            c+=b
##        a=int(a/2)
##        b=b*2
##        print(a,'  ',b)
##    return c
##
##
##
####def multip(a,b):
##    if a==1:
##        return b
##    if a%2:
##        return b+multip(a//2,b*2)
##    else:
##        return multip(a//2,b*2)
##    
##
##
##
##a,b=map(int,input().split())
##res=multip(a,b)
##print(res)
##
##import math as m
##i=2
##a=int(input())
##sq=int(m.sqrt(a))
##def isprime(a):
##    global i
##    if i>sq:
##        return True
##    if a%i==0:
##        return False
##    else:
##        i+=1
##        return isprime(a)
##
##
##
##
##res=isprime(a)
##print(res)
##
##import math as m
##i=1
##a=int(input())
##sq=int(m.sqrt(a))
##def fact(a):
##    s=0
##    global i
##    if i>sq:
##        return 0
##    if a%i==0:
##        if i!=a//i:
##            s+=(a//i)
##        s+=i
##    i+=1
##    return s+fact(a)
##
##
##
##res=fact(a)
##print(res)
##
##
##
##
##def lcm(a,b):
##    i=2
##    s=1
##    while i<=a and i<=b:
##        if a%i==0 and b%i==0:
##           a//=i
##           b//=i
##           s*=i
##        else:
##            i=i+1
##    return s*a*b
##
##
##
##a,b=map(int,input().split())
##res=lcm(a,b)
##print(res)
##
##
##
##def gcd(a,b):
##    while b!=0:
##        if a>b:
##            a,b=b,a
##        b=b%a
##    return a
##            
##def gcdl(a,b):
##    if b==0:
##        return a
##    if b<a:
##        a,b=b,a
##    b=b%a
##    return gcdl(a,b)
##
##
##a,b=map(int,input().split())
##res=gcdl(a,b)
##print(res)
##
##
##def isHappy(n):
##        s=0
##        while n>0:
##                r=n%10
##                s+=r*r
##                n//=10
##        if s==1 or s==7:
##                return True
##        elif s==4:
##                return False
##        else:
##                return isHappy(s)
##print(isHappy(19))
##        
##import math as m
##def isPowerOfTwo(n):
##        s=1
##        c=0
##        if n==1:
##                c=0
##        while s<n:
##                s*=2
##                c+=1
##        k=m.pow(2,c)
##        if n==k:
##                return True
##        else:
##                return False
##print(isPowerOfTwo(3))
##
##
##def isUgly(n):
##        if (n==0 or n<0):
##                return False
##        if n<=6:
##                return True
##        k=int(m.sqrt(n))
##        for i in range(1,k+1):
##            if n%i==0:
##                if isPrim(i) or isPrim(n//i):
##                    if i>5 or (n//i)>5:
##                        return False
##        return True
##def isPrim(n):
##        k=int(m.sqrt(n))
##        for i in range(2,k+1):
##            if n%i==0:
##                return False
##        return True
##ugly number
##def ugly(n):
##    while(n%2==0):
##        n=n//2
##    while n%3==0:
##        n=n//3
##    while n%5==0:
##        n=n//5
##    if n==1:
##        return True
##    else:
##        return False
##for i in range(int(input())):
##               n=int(input())
##               print(ugly(n))
##
##
##Excel sheet
##def ret(n):
##    result=""
##    while(n>0):
##        if(n%26==0):
##            result='Z'+result
##            n=(n//26)-1
##        else:
##            result=chr(int(n%26+64))+result
##            n=n//26
##    return result
##print(ret(int(input())))

# Python program to print a given number in
# words. The program handles numbers
# from 0 to 9999

# A function that prints
# given number in words
##
##
##def convert_to_words(num):
##
##	# Get number of digits
##	# in given number
##	l = len(num)
##
##	single_digits = ["zero", "one", "two", "three",
##					"four", "five", "six", "seven",
##					"eight", "nine"]
##
##	# The first string is not used,
##	# it is to make array indexing simple
##	two_digits = ["", "ten", "eleven", "twelve",
##				"thirteen", "fourteen", "fifteen",
##				"sixteen", "seventeen", "eighteen",
##				"nineteen"]
##
##	# The first two string are not used,
##	# they are to make array indexing simple
##	tens_multiple = ["", "", "twenty", "thirty", "forty",
##					"fifty", "sixty", "seventy", "eighty",
##					"ninety"]
##
##	tens_power = ["hundred", "thousand"]
##
##	# Used for debugging purpose only
##	print(num, ":", end=" ")
##
##	# For single digit number
##	if (l == 1):
##		print(single_digits[ord(num[0]) - 48])
##		return
##
##	# Iterate while num is not '\0'
##	x = 0
##	while (x < len(num)):
##
##		# Code path for first 2 digits
##		if (l >= 3):
##			if (ord(num[x]) - 48 != 0):
##				print(single_digits[ord(num[x]) - 48],
##					end=" ")
##				print(tens_power[l - 3], end=" ")
##				# here len can be 3 or 4
##
##			l -= 1
##
##		# Code path for last 2 digits
##		else:
##
##			# Need to explicitly handle
##			# 10-19. Sum of the two digits
##			# is used as index of "two_digits"
##			# array of strings
##			if (ord(num[x]) - 48 == 1):
##				sum = (ord(num[x]) - 48 +
##					ord(num[x+1]) - 48)
##				print(two_digits[sum])
##				return
##
##			# Need to explicitly handle 20
##			elif (ord(num[x]) - 48 == 2 and
##				ord(num[x + 1]) - 48 == 0):
##				print("twenty")
##				return
##
##			# Rest of the two digit
##			# numbers i.e., 21 to 99
##			else:
##				i = ord(num[x]) - 48
##				if(i > 0):
##					print(tens_multiple[i], end=" ")
##				else:
##					print("", end="")
##				x += 1
##				if(ord(num[x]) - 48 != 0):
##					print(single_digits[ord(num[x]) - 48])
##		x += 1
##
