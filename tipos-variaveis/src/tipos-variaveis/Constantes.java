public class Constantes {
    public static void main(String[] args) {
        // constantes en java, uma variavel imutavel, po exemplo
        final double VALOR_PI = 3.14;
        final String nomeLeandro = "Leandro Falcão";
        System.out.println(VALOR_PI);
        System.out.println("nome e constante imutavel: " + nomeLeandro);

        // CAIXA ALTA SEM FINAL NAO É IMUTAVÉL
        double VALOR_CX_ALTA = 12.56;
        VALOR_CX_ALTA = 35.81; // Mudou o valor, se para ser imutavel precisa de final.
        System.out.println(VALOR_CX_ALTA);
        ///
    }
}
