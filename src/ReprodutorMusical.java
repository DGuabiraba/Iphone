public class ReprodutorMusical {
private String musica;

public String getMusica() {
    return musica;
}

public void setMusica(String musica) {
    this.musica = musica;
}

public void  tocar(){
    System.out.println("tocando...");
}

public void pausar(){
    System.out.println("Musica Pausada...");
}

public void selecionarMusica (String musica){
    System.out.println("Musica Selecionada :" + musica);
}
}
