def fibbo(n,l):
    if n == 0 or n == 1:
        return l[n]

    if l[n - 1] != -1:
        fnm1 = l[n - 1]
    else:
        fnm1 = fibbo(n - 1, l)
    
    if l[n - 2] != -1:
        fnm2 = l[n - 2]
    else:
        fnm2 = fibbo(n - 2,l)
    
    l[n] = fnm1 + fnm2

    return l[n]


n = int(input())
l = [-1] * (n + 1)

l[0],l[1] = 0,1

print(fibbo(n,l))

