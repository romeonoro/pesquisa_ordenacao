package pkg;

/**
 * Representa um aluno com nome e idade.
 * Implementa a interface Comparable para a comparação e ordenação de alunos.
 */
public class Aluno implements Comparable<Aluno> {

    private String nome;
    private int idade;

    /**
     * Construtor da classe Aluno.

     * @param nome O nome do aluno.
     * @param idade A idade do aluno.
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public String toString() {

        return "\nAluno [nome=" + nome + ", idade=" + idade + "]";

    }

    /**
     * Comparação de alunos para ordenação.
     * Ordena primeiro por nome. Em caso de duplicação, por idade.

     * @param Outro aluno para comparação.
     * @return 
     */
    @Override
    public int compareTo(Aluno outroAluno) {

        int nomeCompare = this.nome.compareTo(outroAluno.getNome());
        if (nomeCompare != 0) {
            return nomeCompare;
        } else {
            return Integer.compare(this.idade, outroAluno.getIdade());
        }

    }
}
