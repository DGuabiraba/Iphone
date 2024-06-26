public class NavegadorInternet {
    
private String url;

public String getUrl() {
    return url;
}

public void setUrl(String url) {
    this.url = url;
}

public void exibirPagina(String url){
    System.out.println("Exibindo Pagina: "+ url +"...");
}

public void adicionarNovaAba(){
    System.out.println("Nova Aba... ");
}

public void atualizarPagina(){
    System.out.println("Pagina Atualizada...");
}

}
