public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 27.0;

        System.out.println("Saldo: " + saldo);

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        
        else
            System.out.println("Saldo insuficiente.");

        System.out.println("Novo saldo: " + saldo);
    }
}


/**EXEMPLO DE CONDICIONAL SIMPLES( SOMENTE IF) E COMPOSTA (IF/ELSE) */