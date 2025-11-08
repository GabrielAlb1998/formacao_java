package iphone;

import iphone.aparelho.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone ip = new Iphone();

        ip.selecionarMusica("Tapout");
        ip.tocar();
        ip.pausar();
        ip.atender();
    }
}