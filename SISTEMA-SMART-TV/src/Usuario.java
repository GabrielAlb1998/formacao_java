//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();



        smartTv.ligar();
        System.out.println("Tv ligada : " + smartTv.ligada);
        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.proximoCanal();
        System.out.println("Canal : " + smartTv.canal);



        smartTv.canalAnterior();
        System.out.println("Canal : " + smartTv.canal);
        smartTv.dimunuirVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.dimunuirVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.dimunuirVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.dimunuirVolume();
        System.out.println("Volume : " + smartTv.volume);
        smartTv.mudarCanal(13);
        System.out.println("Canal : " + smartTv.canal);

        smartTv.desligar();
        System.out.println("Tv ligada : " + smartTv.ligada);


    }
}