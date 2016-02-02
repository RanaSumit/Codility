__author__ = 'ranaf'
def solution(A, B):
    L = max(A)
    P_max = max(B)

    fib = [0] * (L+2)
    fib[1] = 1
    for i in range(2, L + 2):
        fib[i] = (fib[i-1] + fib[i-2]) & ((1 << P_max) - 1)

    return_arr = [0] * len(A)

    for idx in range(len(A)):
        return_arr[idx] = fib[A[idx]+1] & ((1 << B[idx]) - 1)

    return return_arr

a = {4,4,5,5,1}
b = {3,2,4,3,1}
answer = solution(a,b)
print(answer)