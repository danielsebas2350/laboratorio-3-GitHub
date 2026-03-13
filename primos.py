t = int(input())

for _ in range(t):
    a, b = map(int, input().split())
    
    contador = 0
    
    for num in range(a, b + 1):
        if num < 2:
            continue
        
        primo = True
        
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                primo = False
                break
        
        if primo:
            contador += 1
    
    print(contador)