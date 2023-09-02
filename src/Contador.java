public class Contador {
    public static void main(String[] args) {
        /**EXEMPLO BREAK */
        for (int num = 1; num <= 5; num++) {
            if (num == 3)
                break;

            System.out.println("O número é: " + num);
        }
        System.out.println("Interrompeu o contador quando a condição foi verdadeira. Condição: Número igual a 3");

        /**EXEMPLO CONTINUE */
        for (int num = 1; num <= 5; num++){
            if (num == 3)
                continue;
            
            System.out.println("O número é: " + num);
            }
            System.out.println(
                    "Não interrompeu o contador, mas não imprimiu o valor referente a condição verdadeira. Condição: Número igual a 3");
    }
}