def findMaximum(l, p, q, r):
    dp = [-1]*(l + 1)
 
    dp[0] = 0
 
    for i in range(l+1):
 
    
        if (dp[i] == -1):
            continue
 
      
        if (i + p <= l):
            dp[i + p] = (max(dp[i + p],dp[i] + 1))
 
       
        if (i + q <= l):
            dp[i + q] = (max(dp[i + q],dp[i] + 1))
 
     
        if (i + r <= l):
            dp[i + r] = (max(dp[i + r],dp[i] + 1))
 
    if dp[l] == -1:
        dp[l] = 0
    return dp[l]

for i in range(int(input())):
    l = int(input())
    x,y,z = map(int,input().split())
    ans = findMaximum(l,x,y,z)
    print(ans)