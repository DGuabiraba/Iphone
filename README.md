# Java-dio-DesafioUML

## ATIVIDADES DO DESAFIO
1. Criar um diagrama UML que represente as funcionalidades descritas acima.
2. Implementar as classes e interfaces correspondentes em Java (Opcional).
   ### Implementação feita com menu responsivo com a utilização de todos os recursos ensinados em aula.

## UML
### Exemplo de Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        -musica: String
        +getMusica() String
        +setMusica(Musica: String) Void
        +selecionarMusica(Musica: String) Void
        +pausar() Void
        +tocar() Void
    }

    class AparelhoTelefonico {
        -numero: String
        +getNumero() String
        +setNumero(numero: String) Void
        +ligar(numero: String) Void
        +atender() Void
        +iniciarCorreioVoz() Void
    }

    class NavegadorInternet {
        -url: String
        +geturl() String
        +seturl(url: String) Void
        +exibirPagina(url: String) Void
        +adicionarNovaAba() Void
        +atualizarPagina() Void
    }

    class Iphone {
    }

    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
```


    Iphone --> ReprodutorMusical
    Iphone --> AparelhoTelefonico
    Iphone --> NavegadorInternet
'''
