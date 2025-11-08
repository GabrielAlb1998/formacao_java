import apps.Facebook;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantania;
import apps.Telegram;

public class Computador {

    public static void main(String[] args){
        ServicoMensagemInstantania smi = null;

        String appEscolhido = "fb";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fb"))
            smi = new Facebook();
        else if(appEscolhido.equals("tl"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
