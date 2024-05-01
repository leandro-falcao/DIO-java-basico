package calculadoras;

public class calculadora2 {
    public static void main(String[] args) {
        int resultado = somaMulti(3, 4, "m");
        System.out.println("o Resultado é: " + resultado);

    }

    public static int somaMulti(int num, int mult, String simbol) {
        int resultado = 0;
        if (simbol.equals("M") || simbol.equals("m")) {
            resultado = num * mult;
        } else {
            resultado = num + mult;
        }
        return resultado;
    }
}
