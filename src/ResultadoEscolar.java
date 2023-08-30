public class ResultadoEscolar {
    public static void main(String[] args) {
        int Nota = 5;
        /**CONDICIONAL ENCADEADA */
        if (Nota >= 7)
        System.out.println("Aprovado");
        else if (Nota >= 5 && Nota < 7 )
        System.out.println("Recuperação");
        else
        System.out.println("Reprovado");

    /**CONDIÇÃO TERNARIA */
    String resultado = Nota >= 7 ? "Aprovado" : Nota >= 5 && Nota < 7 ? "Recuperação" : "Reprovado"; //ABREVIAÇÃO DO IF/ELSE
    //SINTAXE = [CONDIÇÃO 1 ] ? [SE COOND VDD] : [SE COND FALSA][AQUI VOCE PODE INSERIR OUTRA COND 2 TBM, CASO FAÇA USAR ?] : [RESULT DA COND 2];
    System.out.println(resultado);
    }
}