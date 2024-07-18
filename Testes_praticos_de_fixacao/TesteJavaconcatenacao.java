public class App {
    public static void main(String[] args) {

        String primeiroNome = "Joao";
        String segundoNome = "Guilherme";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
