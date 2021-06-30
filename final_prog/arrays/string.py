def Substring(s):
 
    ans, temp = 1, 1
 
    # Traverse the string
    for i in range(1, len(s)):
         
        # If character is same as
        # previous increment temp value
        if (s[i] == s[i - 1]):
            temp += 1
        else:
            ans = max(ans, temp)
            temp = 1
 
    ans = max(ans, temp)
 
    # Return the required answer
    return ans

def solve(s):
    ar = [0 for i in range(len(s))]
    ar[0] = 1
    for i in range(1, len(s)):

        if s[i] == s[i - 1]:
            ar[i] = ar[i - 1] + 1
          
        else:
            ar[i] = 1
    maxi = max(ar)
    start = 0
    end = 0
    for i in range(len(ar) - 1,-1,-1):
        if ar[i] == maxi:
            end = i
        if end != 0 and ar[i] == 1:
            start = i
            break
    return (s[start:end + 1],len(s[start:end + 1]))
   



s = "aaaaaaabbccbbbccc"
 
# Function call
print(solve(s))