from geradores import Util
from ordenacao import Ordenacao

import random

lista_bolha = []
lista_insercao = []
lista_selecao = []
lista_sort = []

quantidade = 60000 

tamanhoNome = random.randint(3, 5)  

Util.gerador_Nomes_Idade_para_Lista(lista_bolha, quantidade, tamanhoNome) 
Util.gerador_Nomes_Idade_para_Lista(lista_selecao, quantidade, tamanhoNome)
Util.gerador_Nomes_Idade_para_Lista(lista_insercao, quantidade, tamanhoNome)
Util.gerador_Nomes_Idade_para_Lista(lista_sort, quantidade, tamanhoNome)

print("\nLista Bolha Ordenada\n")
Ordenacao.metodoBolha(lista_bolha)
for aluno in lista_bolha:
    print(aluno)

print("\nLista Seleção Ordenada\n")
Ordenacao.metodoSelecao(lista_selecao)
for aluno in lista_selecao:
    print(aluno)

print("\nLista Inserção Ordenada\n")
Ordenacao.metodoInsercao(lista_insercao)
for aluno in lista_insercao:
    print(aluno)

print("\nLista Sort Ordenada\n")
lista_sort = sorted(lista_sort)
for aluno in lista_sort:
    print(aluno)
