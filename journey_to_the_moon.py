m,n = map(int, input().split())
l = [[] for i in range(m)]

for i in range(n):
    a,b = map(int,input().split())
    l[a].append(b)
    l[b].append(a)

a = [0] * m

g = 1
for i in range(len(a)):
    if a[i] == 0:
        a[i] = g


def solve(a,g,k,l):
    q = []
    o = l[k]
    if len(o) > 0:
        q.extend(o)
        while len(q) != 0:
            ele = q.pop(0)