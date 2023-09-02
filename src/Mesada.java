import java.util.concurrent.ThreadLocalRandom;

public class Mesada {
    public static void main(String[] args){
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
            valorDoce = mesada;
        /**ESSA ITERAÇÃO DO IF APENAS TORNA O VALOR POSITIVO, NÃO INTERFERINDO NO WHILE */
            
            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce;
            }
            System.out.println("Mesada: " + mesada);
            System.out.println("João gastou toda a sua mesada em doce.");
        }
        private static double valorAleatorio() {
            return ThreadLocalRandom.current().nextDouble(2,8);
        }
    }

    /**A CONDIÇÃO DO [WHILE] PRECISA SER FALSA EM ALGUM MOMENTO, SENÃO, A REPETIÇÃO SERÁ INFINITA.
     * ANTES DE INICIAR A EXECUÇÃO, ELE TESTA PARA VER SE A CONDIÇÃO É VERDADEIRA.
    */