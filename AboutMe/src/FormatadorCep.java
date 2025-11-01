public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("52150050");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            System.err.println("Cep invalido");
        }


    }

    static String formatarCep(String cep) throws CepInvalidoException {
       
        if (cep.length() != 8)
            throw new CepInvalidoException();

        cep = cep.substring(0,2)+"."+cep.substring(2,5)+"-"+cep.substring(5,8);

        return cep;


    }


}

