package apps;

public abstract class ServicoMensagemInstantania {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    protected void validarConexao(){
        System.out.println("Validado internet!");
    }
    void salvarHistorioMensagem(){
        System.out.println("Salvando histórico de mensagens");
    }
}
