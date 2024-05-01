package operadores;

public class OperadoresTernarios {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 6;
        String resultado = "";

        if (a == b)
            resultado = "Verdadeiro";
        else
            resultado = "Falso";

        System.out.println(resultado);

        // ou usando ternarios
        resultado = (a == b) ? "Verdadeira" : "Falsa";
        System.out.println(resultado); // imprimindo falsa
        //

    }
}
