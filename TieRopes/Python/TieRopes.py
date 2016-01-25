__author__ = 'rana'
def solution(K, A):
    cnt = 0
    current = 0
    for part in A:
        current += part
        if current >= K:
            cnt +=1
            current = 0

    return cnt

arr = [1,2,3,4,1,1,3]
answer = solution(4, arr)
print(answer)
