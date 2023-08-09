## Injeção de Dependência _(Dependency Injection)_
#
*Bom... E essa Injeção de Dependência, o que é?*

 - **É a maneira que o Spring aplica a IoC, definindo quais classes serão instanciadas e em quais lugares deverão ser injetadas quando solicitado. Detalhe é que as injeções podem ser feitas de três formas: Annotations, Constructor ou Setter**

- Utilizando as classes do exemplo anterior, nós criaremos um ponto de injeção de Secundaria dentro da classe Primaria. 


> ### **Se liga, como isso fica na prática...**

Primeiro, precisamos utilizar uma Annotation de Bean na classe Secundaria para que o Spring gerencie e saiba injetar a dependência.

```java
@Service
class Secundaria{

    public void metodoVaiCaralho(){
        System.out.println("vai caralho");
    }
}
```

Agora veremos os possiveis métodos de injeção de dependência:
#
*Utilizando ``Constructor`` (Recomendada pela equipe do Spring)*

```java
public class Primaria{

    private Secundaria secundaria;

    public Primaria(Secundaria secundaria){
        this.secundaria = secundaria;
    }

    public void metodoFodase(){
        secundaria.metodoVaiCaralho();
        System.out.println("fodase");
    }

}
```
#
*Utilizando Annotations: ``@Autowired``*

```java
public class Primaria{

    @Autowired
    private Secundaria secundaria;

    public void metodoFodase(){
        secundaria.metodoVaiCaralho();
        System.out.println("fodase");
    }

}
```
#
*Utilizando Setter:*

```java
public class Primaria{

    private Secundaria secundaria;

    @Autowired
    public void metodoSetter(Secundaria secundaria){
        this.secundaria = secundaria;
    }

    public void metodoFodase(){
        secundaria.metodoVaiCaralho();
        System.out.println("fodase");
    }

}
```
- Então, quando for necessário o próprio Spring se responsabilizará pela criação da instância da classe Secundaria para que a Primaria possa usar o método.


Simples, né?

Ir para: [Bean »](/content/EcossistemaSpring/2-Spring/Bean.md)