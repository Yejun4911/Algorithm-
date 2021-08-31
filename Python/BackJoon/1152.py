a=input()
b=a.split(" ")

while True:
    if "" in b:
        b.remove("")
    else:
        break

print(len(b))