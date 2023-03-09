package edu.Vini.classes;
public class Concat {
    
    /**
     * @param args
     */
    public static void main (String [] args) {

        String primeiroNome = "Vinícius";
    
        String segundoNome = "Henrique";
    
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    
        System.out.println(nomeCompleto);
    
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
