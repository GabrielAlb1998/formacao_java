public enum EstadosBrasileiros {
    SAO_PAULO("SP","São Paulo"),
    RIO_JANEIRO("RJ","Rio de Janeiro"),
    PIAUI("PI","Piauí");
    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getEstado(){
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
