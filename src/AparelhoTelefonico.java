public class AparelhoTelefonico {

    private String numero ;
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void ligar(String numero) {
        
     System.out.println(numero  + ": está ligando... ");
    }
    public void atender() {
        
     System.out.println( "Atendendo telefone... ");
    }
    public void iniciarCorreioVoz() {
        
     System.out.println(" Iniciando Correio de Voz... ");
    }
}
