def allPermutations(s,ans):
    if len(s) == 0:
        print(ans)
        return
    
    for i in range(len(s)):
        new_str = s[0:i] + s[i + 1:]
        allPermutations(new_str,ans + s[i])

s = "abc"
allPermutations(s,"")