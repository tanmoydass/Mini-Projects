import random

thenumber=random.randint(1,100)

mynumber=None
guess=1

while(thenumber!=mynumber):
    mynumber=int(input("Guess the number: "))
    if(thenumber==mynumber):
        print("You guess the number perfectly")
    else:
        guess+=1
        if(thenumber>mynumber):
            print("Guess a greater number")
        else:
            print("Guess a lower number")

print(f"You takes {guess} guess to find the number")
print(f"The perfect number: {thenumber}")

