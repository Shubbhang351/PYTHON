def solve(s1,choices,ans,s):
    if ans >= s:
        return
        
    if len(ans) == len(s1):
        print(ans)
        return
    
    for i in range(len(choices)):
        if choices[i] == False:
            choices[i] = True
            solve(s1,choices,ans + s1[i],s)
            choices[i] = False

s = "cab"

s1 = sorted(s)
choices = [False for i in range(len(s))]
solve(s1,choices,"",s)