package pkg;

import java.util.List;

/**
 * Classe contendo métodos de ordenação para a lista de alunos.
 */
public class Ordenar {

    /**
     * Ordena a lista de alunos usando o método de ordenação Bolha.

     * @param A lista de alunos a ser ordenada.
     */
    public static void metodoBolha(List<Aluno> lista) {

        boolean houveTroca = true;
        while (houveTroca) {
            houveTroca = false;
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i).compareTo(lista.get(i + 1)) > 0) {
                    houveTroca = true;
                    Aluno aux = lista.get(i);
                    lista.set(i, lista.get(i + 1));
                    lista.set(i + 1, aux);
                }
            }

        }
    }

    /**
     * Ordena a lista de alunos usando o método de ordenação Seleção.

     * @param A lista de alunos a ser ordenada.
     */
    public static void metodoSelecao(List<Aluno> lista) {

        int n = lista.size();
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (lista.get(j).compareTo(lista.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            Aluno temp = lista.get(minIndex);
            lista.set(minIndex, lista.get(i));
            lista.set(i, temp);

        }
    }

    /**
     * Ordena a lista de alunos usando o método de ordenação Inserção.
     *
     * @param A lista de alunos a ser ordenada.
     */
    public static void metodoInsercao(List<Aluno> lista) {

        for (int i = 1; i < lista.size(); i++) {
            Aluno aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).compareTo(aux) > 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }

    }


}
