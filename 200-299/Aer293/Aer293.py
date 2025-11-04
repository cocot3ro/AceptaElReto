casos = int(input())

for i in range(casos):
    entrada = input()
    numeros = entrada.split(" ")
    
    numInsectos = int(numeros[0])
    numAracnidos = int(numeros[1])
    numCrustaceos = int(numeros[2])
    numEscolopendras = int(numeros[3])
    numAnillos = int(numeros[4])
    
    numPatas = numInsectos * 6 + numAracnidos * 8 + numCrustaceos * 10 + numEscolopendras * numAnillos * 2
    
    print(numPatas)