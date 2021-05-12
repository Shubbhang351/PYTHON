def fibbo(n,l):
    if n == 0 or n == 1:
        return l[n]

    if l[n] != 0:
        return l[n]

    fnm1 = fibbo(n - 1, l)

    fnm2 = fibbo(n - 2, l)
    
    l[n] = fnm1 + fnm2

    return l[n]


n = 1000
l = [0 for i in range(n + 1)]



print(fibbo(n,l))

