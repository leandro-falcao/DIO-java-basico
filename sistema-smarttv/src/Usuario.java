public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        // System.out.println("TV está ligada? " + " = " + smartTv.ligada);
        // System.out.println("TV qual CANAL? " + " = " + smartTv.canal);
        // System.out.println("TV qual VOLUME? " + " = " + smartTv.volume);

        // chamando o metodo ligar, informando que a tc ligada
        smartTv.ligar();
        System.out.println("NOVO status da TV :: " + " : " + smartTv.ligada);
        //

        // chamando o metodo desligar, informando que a tv desligada
        smartTv.desligar();
        System.out.println("NOVO status da TV2 des : " + ": " + smartTv.ligada);
        //

        // metodo de volume e qual volume depois de aumentado
        smartTv.aumentarVolume();
        System.out.println("TV qual VOLUME atual, depois de mais " + ":: " + smartTv.volume);
        //

        // metodo de volume e qual volume depois de diminuido
        smartTv.diminuirVolume();
        System.out.println("TV qual VOLUME atual, depois de menos " + ":: " + smartTv.volume);
        //

        // metodo de volume e qual canal é:
        smartTv.diminuirVolume();
        System.out.println("TV qual VOLUME atual, depois de menos " + ":: " + smartTv.volume);
        //

        // metodo de canal maior. Qual canal é:
        smartTv.aumentarCanal();
        System.out.println("+TV qual CANAL? " + " = " + smartTv.canal);
        //

        // metodo de diminuir canal. Qual canal é:
        smartTv.aumentarCanal();
        System.out.println("TV qual -CANAL? " + " = " + smartTv.canal);
        //

        // metodo de mudar para canal inserido. Qual canal é:
        smartTv.mudarCanal(25);
        System.out.println("inserrindo o canal CANAL, é " + " = " + smartTv.canal);
        //
    }
}
