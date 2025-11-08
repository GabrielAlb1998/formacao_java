package iphone.aparelho;

import iphone.AparelhoTelefonico.Telefone;
import iphone.navegadorinternet.Navegador;
import iphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, Navegador, Telefone {


    @Override
    //Player de música
    public void tocar() {
        System.out.println("Música tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
          System.out.println("Música selecionada: "+ musica);
    }
    //Navegador de internet
    @Override
    public void exibirPagina(String url) {
          System.out.println("Acessando a pagina:" + url);
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Nova aba aberta");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Recarregando página");
    }
    //Telefone
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+ numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo gravação");

    }
}
