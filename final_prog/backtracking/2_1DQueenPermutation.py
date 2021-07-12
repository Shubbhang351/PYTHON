def queenPermutation(board, tq, qpsf,ans):
    if tq == qpsf:
        print(ans)
        return
    
    for i in range(len(board)):
        if board[i] == False:
            board[i] = True
            queenPermutation(board, tq, qpsf + 1,ans + "q" + str(qpsf) + "b" + str(i) + "  ")
            board[i] = False

board = [False] * 4
tq = 2
qpsf = 0
ans = ""
queenPermutation(board, tq, qpsf,ans)