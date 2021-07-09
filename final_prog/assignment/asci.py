def solve(s,i,ans):
    if i == len(s):
        print(">> ",ans)
        return

    solve(s,i + 1,ans)
    solve(s,i + 1,ans + s[i])
    solve(s,i + 1,ans + str(ord(s[i])))
    

s = "ab"
solve(s,0,"")