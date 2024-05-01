package operadores;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        // relacionais é tipo resposta booleana, se tue faça algo, se false outra olgo

        int num1 = 10;
        int num2 = 20;

        boolean simNao = num1 == num2;

        System.out.println(simNao); // retorna o boolenano de false

        // String sao uma classe e a comparação de String ideal usar o .equal(). Pq se
        // usar new String mesmo que igual vai dar erro se comparar com == ou ===
        String nome1 = "leandro";
        String nome2 = new String("leandro");
        System.out.println("resultado:" + (nome1 == nome2)); // retorna booleano false
        System.out.println("resultado: " + nome1.equals(nome2)); // Assim retorna true
        //

        // usando Operadores Logicos como && E também || OU
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("condição verdadeira. Todas as condiçoes são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("condição verdadeira com OU com uma condição  verdadeira");
        }
        //
    }

}
