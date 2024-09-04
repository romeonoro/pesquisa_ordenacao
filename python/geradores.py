import random

class Util:

    @staticmethod
    def gerador_De_Nomes_Idade(tamanho):
        """
        Método estático que gera nomes e idades aleatórias para um aluno.

        :param tamanho (int): Quantidade de caracteres que o nome terá.
        :return: nome e idade do aluno.
        """
        letras = 'abcdefghijklmnopqrstuvwxyz'
        nomes = ''

        for i in range(tamanho):
            letra_sorteada = letras[random.randint(0, len(letras) - 1)]
            nomes += letra_sorteada

        idade = random.randint(18, 70)
        return nomes, idade

    @staticmethod
    def gerador_Nomes_Idade_para_Lista(lista, quantidade, tamanho):
        """
        Método estático que popula uma lista com os nomes e idades geradas.

        :param lista: Contém o nome e idade do aluno.
        :param quantidade (int): Quantidade de nomes e idades que se deseja gerar.
        :param tamanho (int): Quantidade de caracteres que o nome terá.
        """
        for i in range(quantidade):
            lista.append(Util.gerador_De_Nomes_Idade(tamanho))
