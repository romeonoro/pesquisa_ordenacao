from aluno import Aluno

lista = []
lista.append(Aluno("Alex", 50))
lista.append(Aluno("Matheus", 20))
lista.append(Aluno("Iago", 21))
lista.append(Aluno("Bruno", 22))
lista.append(Aluno("Bruno", 19))
lista.append(Aluno("Romeo", 19))

lista.sort()

for item in lista:
    print(item)

#lista.append(14)
#lista.append(Aluno("Alex", 50))

#print(lista)