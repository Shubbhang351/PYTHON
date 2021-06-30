def check(b,v):
	n = len(b)
	m = len(v)

	i = 0
	j = 0
	while i < n and j < m:
		if b[i] == v[j]:
			i += 1
		j += 1
	return i == n

v = "coronavirus"
b = "abcde crnas onarous".split()
for i in b:
	print(check(i,v))