n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
total = 0
max_val = 0

for i in range(n):
    for j in range(n):
        if i + 2 < n:
            if j + 2 < n:
                for k in range(3):
                    total += grid[i+k][j] + grid[i+k][j+1] + grid[i+k][j+2]
                if total > max_val:
                    max_val = total
                total = 0
print(max_val)