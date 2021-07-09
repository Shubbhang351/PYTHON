def solve(s,i,indi,ans):
    if i == len(s):
        return ans
    
    if indi == 'p':
        if s[i] == 'i':
            return solve(s,i + 1,s[i] , ans + "3.14")
        elif s[i] == 'p':
            return solve(s,i + 1,s[i],ans + 'p')
        else:
            return solve(s,i + 1,s[i],ans + 'p' + s[i])
    elif s[i] == 'p':
        return solve(s, i + 1,s[i],ans)
    else:
        return solve(s,i + 1,s[i],ans + s[i])

s = "xpipippixx"
print(solve(s,0,"  ",""))
