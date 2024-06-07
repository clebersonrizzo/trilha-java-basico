
public class FormatadorCepExemplo extends Exception {
    public static void main(String[] args) {
        try{
            String cepFormatado = formatarCep(23765064)
            System.out.println(cepFormatado);
        } catch (CepInvalidoException excepion) {
            System.err.println("O cep não correspondente com as regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if(cep.length() != 8)
            throw new CepInvalidoException();


            return "23.765-064";
    }
}
 

