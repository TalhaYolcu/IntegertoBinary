def DecimalToBinary(num):
    if(num>=1):
        DecimalToBinary(num//2)
        print(num%2,end='')


if __name__ == '__main__':

    y=int(input("Enter integer"))

    DecimalToBinary(y)