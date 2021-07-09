import math

# Function to compute the N-th
# Fibonacci number in the
# sequence where a = 2
# and b = 3
def probability(N):

	# The first two numbers in
	# the sequence are initialized
	a = 2
	b = 3

	# Base cases
	if N == 1:
		return a
	elif N == 2:
		return b
	else:
		
		# Loop to compute the fibonacci
		# sequence based on the first
		# two initialized numbers
		for i in range(3, N + 1):
			c = a + b
			a = b
			b = c
		return b

# Function to find the probability
# of not getting two consecutive
# heads when N coins are tossed
def operations(N):

	# Computing the number of
	# favourable cases
	x = probability (N)

	# Computing the number of
	# all possible outcomes for
	# N tosses

	return x

# Driver code
if __name__ == '__main__':

	N = 4
	
	print(operations(N))

