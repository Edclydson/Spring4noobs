## Spring Boot
- O Spring Boot surgiu para facilitar o desenvolvimento web, pois iniciar uma aplicação do zero utilizando o Spring Framework exige um esforço considerável devido as diversas configurações que é necessário fazer. 

- Então, ao iniciar um projeto com o Spring Boot ele já faz todas as configurações básicas necessárias pra conseguir subir a sua aplicação, trazendo também um servidor embutido (Tomcat ou Netty) que ajuda a inicializar o seu projeto.

>Resumindo, se a gente fosse olhar como o Spring Boot é composto, seria assim:


![Composição do Spring Boot](/images/composicaospringboot.jpg)

- Seguem algumas Annotations do Spring Boot:

    - ``@SpringBootApplication``
        - Uma unificação das Annotations ``@Configuration``, ``@EnableAutoConfiguration`` e ``@ComponentScan`` para não precisarmos instalar um servidor web, pois por padrão já vem com o Tomcat.
    - ``@Configuration``
        - Define uma classe como fonte de definições de beans.
    - ``@Bean``
        - Utilizada geralmente dentro de classes marcadas com a ``@Configuration`` para dizer ao Spring Framework quais métodos invocar e gerenciar seus objetos, ou seja, realizar a injeção de dependências desses métodos.

Ir para: [4. Spring MVC »](/content/EcossistemaSpring/4-SpringMVC/SpringMVC.md)
