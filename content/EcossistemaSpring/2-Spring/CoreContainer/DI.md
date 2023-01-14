## Injeção de Dependência _(Dependency Injection)_
#
*Bom... E essa Injeção de Dependência, o que é?*

 - **É a maneira que o Spring aplica a IoC, definindo quais classes serão instanciadas e em quais lugares deverão ser injetadas quando solicitado.**

- Utilizando as classes do exemplo anterior, nós criaremos um ponto de injeção, pelo construtor, de Secundaria dentro da classe Primaria. 


> ### **Se liga, como isso fica na prática...**

```java
public class Primaria{

    private Secundaria secundaria;

    public Primaria(Secundaria secundaria){
        this.secundaria = secundaria
    }
    public void metodoFodase(){
        secundaria.metodoVaiCaralho();
        System.out.println("fodase");
    }

}

public class Secundaria{

    public void metodoVaiCaralho(){
        System.out.println("vai caralho");
    }
}
```
- Então, quando for necessário o próprio Spring se responsabilizará pela criação da instância da classe Secundaria para que a Primaria possa usar o método.


Simples, né?

Ir para: [Data Access/Integration »]()