import java.util.Random;

public class Telefone {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while (tocando());

        System.out.println("Alô!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
} /**ESSE É O METODO PARA ADICIONAR O VALOR ALEATORIO, NÃO SE ESQUEÇA DE IMPORTAR O METODO ANTES DE INICIAR O PROGRAMA */
}

/**O [DO WHILE] SE INICIA SENDO FALSO E CONTINUA SENDO EXECUTADO ATÉ SE TORNAR VERDADEIRO.
 *FOI UTILIZADO UM METODO DE VALOR ALEATORIO PARA INFORMAR QUANDO ESSA CONDIÇÃO IRA SE TORNAR VERDADEIRA, NO CASO, O VALOR ESCOLHIDO FOI O 3.
 */