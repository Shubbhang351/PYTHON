def solve(n,a):
    value = 0
    prev_value = 0
    answer = 0
    l = [[] for i in range(n)]
    for i in range(len(a)):
        t = a[i]
        l[t[0]].append(t[1])
        l[t[1]].append(t[0])
    visited = [False] * n
    
    return 0
    for i in range(len(visited)):
        if  visited[i] == False:
            value = bfsVisisted(l,i,visited)
        print(answer, prev_value,value)
        answer = answer + (prev_value) * value
        prev_value += value
        value = 0
    return answer

def bfsVisisted(l,i,visited):
    value = 0
    queue = []
    queue.append(i)
    while len(queue) != 0:
        presentNode = queue.pop(0)
        if not visited[presentNode]:
            value += 1
            visited[presentNode] = True

        for i in l[presentNode]:
            if not visited[i]:
                queue.append(i)
    return value


n = 100000
a = [[1,2],[3,4]]
print(solve(n,a))