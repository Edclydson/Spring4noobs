## Inversão de Controle _(Inversion of Control - IoC)_
#
### Chegamos ao módulo de IoC e pra te passar esse assunto, se liga nesse exemplo a seguir:


- Temos uma classe chamada ``Primaria`` e outra chamada ``Secundaria``. 

```java
public class Primaria{

    private Secundaria secundaria;

    public void metodoFodase(){
        secundaria = new Secundaria();
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
- Deu pra perceber que a classe Primaria utiliza um *método* da classe Secundaria, ou seja, possui uma **dependência**.

- O grande lance dessa dependência existente é que para utilizar o método da Secundaria, a classe Primaria seria obrigada a criar uma nova **instância** de Secundaria.

*E como a Inversão de Controle entra nessa jogada?*

- Muito simples, o Spring realiza essa ``Inversão de Controle`` utilizando o próximo tópico desse curso, a ``Injeção de Dependência`` delegando a um Container do framework que realizará a IoC.

    ### *Resumindo, a Inversão de Controle é quando um objeto define suas dependências sem criá-los.*


Ir para: [Dependency Injection »](/content/EcossistemaSpring/3-CoreContainer/DI.md)