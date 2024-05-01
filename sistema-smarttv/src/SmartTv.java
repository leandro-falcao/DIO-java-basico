public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    /// métodos estados
    // Método mudar falando que canal é:
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
    //

    // Método mudar de canal para maior
    public void aumentarCanal() {
        canal++;
        System.out.println("o canal agora é:" + canal);
    }
    //

    // Método mudar de canal para Menor
    public void diminuirCanal() {
        canal--;
        System.out.println("o canal agora é:" + canal);
    }
    //

    // Método Aumentar Volume
    public void aumentarVolume() {
        volume++;
    }
    //

    // Método Diminuir Volume
    public void diminuirVolume() {
        volume--;
    }
    //

    // método ligar
    public void ligar() {
        ligada = true;
    }
    //

    // método desligar
    public void desligar() {
        ligada = false;
    }
    //
}
