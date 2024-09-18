Avaliação semestral de Pesquisa e Ordenação
18/09/2024
Nome: Romeo Noro Guterres


1) O que é Ordenação e qual o seu papel nos sistemas de informação?

    É o processo de organizar dados de acordo com uma determinada ordem ou sequência. 
    Isso geralmente envolve reorganizar os elementos de uma lista, array ou qualquer 
    outra estrutura de dados para que eles apareçam em uma ordem específica, como crescente, 
    decrescente ou baseada em algum critério.
    Seu papel em geral é otimizar as buscas e pesquisas. 
    Também enssencial para a integridade e manipulação de dados, podendo facilitar na manutenção de sistemas.

2) Na construção de algoritmos, por exemplo, algoritmos de ordenação, há o conceito de complexidade. Assim, em ordenação como se calcula
ou se mede a complexidade?

    A complexidade de um algoritmo de ordenação pode ser calculada analisando o número de comparações e trocas realizadas.
    Complexidade Temporal: mede o número de operações realizadas em função do tamanho da entrada.
    Complexidade Espacial: mede a quantidade de memória extra que o algoritmo precisa além da entrada.

3) Novamente, no contexto de algoritmos de ordenação, há algoritmos estáveis e instáveis. Explique o que isso significa.

    Métodos estáveis, ao ordenar, não desordenam a estrutura no processo.
    Métodos instáveis, ao ordenar, desordenam temporariamente a estrutura.

4) Dos algoritmos que estudamos (bolha, seleção, inserção e pente), há um desses que tem um desempenho muito bom. Qual é? 
E qual o recurso computacional que ele utiliza para ser tão melhor que os outros? Explique a resposta.

    O Inserção pois ele utiliza adaptabilidade. 
    Seu desempenho melhora significativamente quando a lista já está quase ordenada. 
    Isso ocorre porque ele não precisa percorrer todos os elementos e trocar cada par, 
    ele percorre a lista apenas até encontrar a posição correta para cada elemento, resultando em menos movimentações.

5) Observe a sequência de números no vetor:
    0 1 2 3 4 5 6 - índices
    7 3 5 1 8 2 5 - valores

    a) quantas comparações e trocas vão ocorrer usando bolha?   21 comparações e 11 trocas.
    b) quantas comparações e trocas vão ocorrer usando pente?   18 comparações e 13 trocas.

6) Dos métodos estudados (bolha, seleção, inserção e pente), quais são estáveis e quais são instáveis?

    ESTÁVEIS: Bolha e Inserção.
    INSTÁVEIS: Seleção e Pente.

7) No processo de ordenação de listas contendo objetos, como pessoas que derivam da classe Pessoa(nome, email, telefone, curso), para usar o método 
sort() em Java ou C Sharp é preciso realizar alterações na classe Pessoa para que a ordenação ocorra corretamente. Exemplifique e explique 
qual(is) é(são) essa(s) alterações? Assuma que o atributo chave de ordenação da classe pessoa é nome seguido de curso.

    O principal motivo para usar o método compareTo é que ele define a ordem dos objetos em Java. 
    Sem o compareTo, a ordenação precisaria ser implementada manualmente pelo programador. 
    Com o compareTo, podemos definir a ordem dos objetos de maneira direta. 
    Para isso, é necessário implementar a interface Comparable e modificar o método compareTo na classe Pessoa, 
    usando o atributo nome como critério principal de comparação. Se os nomes forem iguais, a comparação deve ser feita pelo atributo curso. 
    Além disso, na classe principal, é importante importar a classe Collections para usar o método sort() e ordenar a lista.