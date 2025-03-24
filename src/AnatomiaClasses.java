public class AnatomiaClasses {
    
   public static void main(String [] args) {
    String primeiroNome = "Arthur ";
    String segundoNome = "Pessoa";
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    System.out.print(nomeCompleto);
   }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome+segundoNome;

    }
   
}