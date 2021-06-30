import math

# n = int(input())

# primes = [True] * (n + 1)

# primes[0],primes[1] = False,False

# for i in range(2, int(math.sqrt(n)) + 1):
#     if primes[i]:
#         j = 2
#         while i * j <= n:
#             primes[i * j] = False
#             j += 1

# for i in range(len(primes)):
#     if primes[i]:
#         print(i)



def check_prime(n):
    if n == 1:
        return False
    elif n == 2 or n == 3:
        return True
    else:
        for i in range(2, int(math.sqrt(n)) + 1):
            if n % i == 0:
                return False
        return True


def all_prime(l,r):
    if l == r:
        if check_prime(l):
            return 0
        else:
            return -1
    elif r - l == 1:
        l1 = check_prime(l)
        r1 = check_prime(r)

        if l1 and r1:
            return r - l
        elif l1 or r1:
            return 0
        else:
            return -1
    n = r
    primes = [True] * (n + 1)

    primes[0],primes[1] = False,False

    for i in range(2, int(math.sqrt(n)) + 1):
        if primes[i]:
            j = 2
            while i * j <= n:
                primes[i * j] = False
                j += 1
    
    lower = 0
    higher = 0
    
    for i in range(l,r + 1):
        if primes[i]:
            lower = i
            break
    
    for i in range(r,l - 1,-1):
        if primes[i]:
            higher = i
            break
    
    if lower == 0 or higher == 0:
        return -1
    return higher - lower


if __name__ == "__main__":
    l,r = map(int, input().split())
    print(all_prime(l,r))