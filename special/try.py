def saveThePrisoner(n, m, s):
    ans = m % n
    #print(ans)
    ans  = ans + (s - 1)
    #print(ans)
    if ans  > n:
        ans = ans % n
    #print("ans -- ", ans)

    j = s

    # for i in range(1, m + 1):
    #     if j == n:
    #         j = 1
    #     else:
    #         j += 1
    #print("j -- ", j - 1)
    return str(ans)


file1 = open("test1.txt",'r')
file2 = open("ans1.txt",'r')

l1 = file1.readlines()
l2 = file2.readlines()

print(l1[0])

for i in range(len(l1)):
    a = l1[i]
    a = a[0:len(a) - 1].split()
    a = [int(x) for x in a]
    print(a, " << -- >>",i,end = " ")
    n,m,s = a[0],a[1],a[2]
    #print(n,m,s)
    ans = saveThePrisoner(n,m,s)
    #print(ans)
    o = l2[i]
    if ans != o[0:len(o) - 1]:
        print("not equal", "  >> ans -- ",ans, " and real ans is -- ", o)
    else:
        print("equal ",ans,  o[0:len(o) - 1])

    

file1.close()
file2.close()
