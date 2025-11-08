package apps;

public class Telegram extends ServicoMensagemInstantania {
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem do apps.Telegram");
        salvarHistorioMensagem();
    }

    @Override
    public void receberMensagem() {
        validarConexao();
        System.out.println("Recebendo mensagem do apps.Telegram");
        salvarHistorioMensagem();

    }


}
