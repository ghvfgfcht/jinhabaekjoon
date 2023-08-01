str1 = input()
str2 = input()

dp = [[0] * (len(str1) + 1) for _ in range(len(str2) + 1)]

for i in range(1, len(str2) + 1):
    for j in range(1, len(str1) + 1):
        # 같으면 왼쪽 위 +1
        if str2[i - 1] == str1[j - 1]:
            # j --> col
            # i --> row
            # print(i, j, str2[i - 1], str1[j - 1])
            dp[i][j] = dp[i - 1][j - 1] + 1
        # 다르면 왼쪽, 오른쪽 중 큰 수
        else:
            left = dp[i][j - 1]
            up = dp[i - 1][j]
            if left > up:
                dp[i][j] = left
            else:
                dp[i][j] = up

print(dp[len(str2)][len(str1)])