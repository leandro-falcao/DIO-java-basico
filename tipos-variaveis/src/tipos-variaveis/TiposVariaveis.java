public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salario = 2135.45;
        short numCurto = 1;
        int numNormal = numCurto;
        short numCurto2 = (short) numNormal;

        System.out.println("double salario: " + salario);
        System.out.println("short numCurto: " + numCurto);
        System.out.println("int numNormal: " + numNormal);
        System.out.println("short numCurto2: " + numCurto2);
    }

}
