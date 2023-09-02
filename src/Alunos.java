public class Alunos {
    public static void main(String[] args) {
        String alunos[] = { "LEANDRO", "CAIO", "LORRAYNE", "DALVA", "ORLANDO" };
        
        /**FORMA TRADICIONAL */
        for (int x = 0; x < alunos.length; x++)
            System.out.println("O aluno no indice x: " + x + " é " + alunos[x] );

        /**FORMA RESUMIDA */
        for(String aluno : alunos)
        System.out.println("O nome do aluno é: " + aluno);
    }
}