## Bean
*O que seria um feijão?*
- **Bean é um objeto que é instanciado, montado e gerenciado pelo container do Spring Framework utilizando IoC e Injeção de Dependência.**

- Assim como tudo na vida, o bean também possui seu ciclo de vida, vê só:

![Ciclo de Vida de um Bean](/images/ciclodevidabean.jpg)

- Como podemos ver, o Container cria e inicia o ciclo, logo após a injeção de dependência ocorre, em seguida o método de inicialização é chamado e o Bean é enviado até a classe que possui a dependência, para que ele possa ser utilizado e descartado quando não houver mais utilidade.

- Nós vimos um exemplo prático desse ciclo no cenário das classes Primaria e Secundaria, utilizando as três formas de injeção de dependência (Setter, Constructor e Annotation).

E por falar em Annotation, o Spring possui alguns estereótipos que são determinados por Annotations específicas para cada tipo de Bean. Estes são alguns exemplos: 

- ``@RestController``
    - Define uma classe que contém métodos para uma API RESTful.
- ``@Autowired``
    - Define os pontos de Injeção de Dependências dentro de uma classe.
- ``@Repository``
    - Define um repositório Bean.
- ``@Service``
    - Define uma classe de serviço.

No decorrer dos módulos seguintes existirão mais exemplos de Annotations.

Ir para: [Spring Boot »](/content/EcossistemaSpring/3-SpringBoot/SpringBoot.md)
