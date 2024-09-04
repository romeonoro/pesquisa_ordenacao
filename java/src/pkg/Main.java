package pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe Principal para executar a ordenação de listas de alunos usando diferentes métodos.
 */
public class Main {
    public static void main(String[] args) {

        List<Aluno> listaBolha = new ArrayList<>();
        List<Aluno> listaSelecao = new ArrayList<>();
        List<Aluno> listaInsercao = new ArrayList<>();
        List<Aluno> listaSort = new ArrayList<>();

        int quantidade = 60000; 

        Random random = new Random();
        int tamanhoNome = random.nextInt(3, 4); 

        listaBolha = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSelecao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaInsercao = Util.gerarNomesEIdades(quantidade, tamanhoNome);
        listaSort = Util.gerarNomesEIdades(quantidade, tamanhoNome);

        Util.exibirOrdenacao(listaBolha, "bolha");
        Util.exibirOrdenacao(listaSelecao, "selecao");
        Util.exibirOrdenacao(listaInsercao, "insercao");
        Util.exibirOrdenacao(listaSort, "sort");
    }
}
