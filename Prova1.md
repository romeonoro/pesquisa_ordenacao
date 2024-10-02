Avaliação semestral de Pesquisa e Ordenação <br>
18/09/2024 <br>
Nome: Romeo Noro Guterres


1) O que é Ordenação e qual o seu papel nos sistemas de informação?

   É organizar dados em uma estrutura usando uma ou mais chave de ordenação para facilitar as pesquisas.

2) Na construção de algoritmos, por exemplo, algoritmos de ordenação, há o conceito de complexidade. Assim, em ordenação como se calcula
ou se mede a complexidade?

    Quanto de esforço um algoritmo faz, calculado com a quantidade de comparações e trocas.

3) Novamente, no contexto de algoritmos de ordenação, há algoritmos estáveis e instáveis. Explique o que isso significa.

    Métodos estáveis não desordenam a estrutura no processo.
    Métodos instáveis desordenam temporariamente a estrutura.

4) Dos algoritmos que estudamos (bolha, seleção, inserção e pente), há um desses que tem um desempenho muito bom. Qual é? 
E qual o recurso computacional que ele utiliza para ser tão melhor que os outros? Explique a resposta.

    Pente, análise à distância e não contígua. Pré-organizando a estrutura, valores menores são trazidos para o começo e
    valores maiores para o fim.

5) Observe a sequência de números no vetor: <br>
    0 1 2 3 4 5 6 - índices <br>
    7 3 5 1 8 2 5 - valores <br>

    a) quantas comparações e trocas vão ocorrer usando bolha?   24 comparações e 11 trocas. <br>
    b) quantas comparações e trocas vão ocorrer usando pente?   23 comparações e 5 trocas. <br>

6) Dos métodos estudados (bolha, seleção, inserção e pente), quais são estáveis e quais são instáveis?

    ESTÁVEIS: Bolha e Inserção. <br>
    INSTÁVEIS: Seleção e Pente. <br>

7) No processo de ordenação de listas contendo objetos, como pessoas que derivam da classe Pessoa(nome, email, telefone, curso), para usar o método 
sort() em Java ou C Sharp é preciso realizar alterações na classe Pessoa para que a ordenação ocorra corretamente. Exemplifique e explique 
qual(is) é(são) essa(s) alterações? Assuma que o atributo chave de ordenação da classe pessoa é nome seguido de curso.

    Na classe Pessoa é preciso reescrever o método compareTo (java) ou CompareTo (c#), que são métodos da interface Comparable ou IComparable.
