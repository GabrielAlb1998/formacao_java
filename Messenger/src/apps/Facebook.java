package apps;

public class Facebook extends ServicoMensagemInstantania{
    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Enviando mensagem do apps.Facebook");
        salvarHistorioMensagem();
    }

    @Override
    public void receberMensagem() {
        validarConexao();
        System.out.println("Recebendo mensagem do apps.Facebook");
        salvarHistorioMensagem();
    }
}
