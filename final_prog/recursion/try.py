def allPermutations(s,ans):
    if len(s) == 0:
        print(ans)
        return
    
    for i in range(len(s)):
        new_str = s[0:i] + s[i + 1:]
        allPermutations(new_str,ans + s[i])

def coinToss2(n,head,ans):
    if n == 0:
        print(ans)
        return
    
    if not head:
        coinToss2(n - 1,True,ans + "H")
    coinToss2(n - 1,False, ans + "T")

def lexo(k,n):
    if k > n:
        return
    if k == 0:
        print(0)
        for i in range(1,10):
            lexo(i,n)
    else:
        print(k)
        for i in range(10):
            lexo(k * 10 + i,n)

def jumpingNumbers(n,k):
    if k > n:
        return
    if k == 0:
        print(0)
        for i in range(1,10):
            jumpingNumbers(n,i)
    else:
        print(k)
        rem = k % 10
        if rem != 0:
            jumpingNumbers(n, k * 10 + (rem - 1))
        if rem != 9:
            jumpingNumbers(n, k * 10 + (rem + 1))

def palindromePartitions(ques, ans):
    if len(ques) == 0:
        print(ans)
        return
    
    for i in range(1,len(ques) + 1):
        part = ques[0:i]
        roq = ques[i:]
        if isPalindrome(part):
            palindromePartitions(roq, ans + part + "  ")




def isPalindrome(s):
    i = 0
    j = len(s) - 1
    while i < j:
        if s[i] != s[j]:
            return False
        i += 1
        j -= 1
    return True

# coinToss2(3,False,"")
# lexo(0,10)
# jumpingNumbers(20,0)
palindromePartitions("nitin","")