package apps;

public class MSNMessenger extends ServicoMensagemInstantania{

    public void enviarMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem");
        salvarHistorioMensagem();
    }
    public void receberMensagem(){
        validarConexao();
        System.out.println("Recebendo mensagem");
        salvarHistorioMensagem();
    }
    }


