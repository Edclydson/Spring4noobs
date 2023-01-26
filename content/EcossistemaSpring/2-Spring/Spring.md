## O que é o Spring?

O Spring é um framework que tem como foco principal aumentar a produtividade dos desenvolvedores, dando suporte nas configurações de baixo nível, fornecendo o necessário para que a sua aplicação Java possa rodar tranquilamente na JVM, permitindo os devs focarem nas regras de negócio. 

O ecossistema do Spring conta com suporte para Groovy e Kotlin, e dá a possibilidade de criar diversos tipos de arquiteturas conforme a necessidade do projeto a ser desenvolvido. O framework teve sua primeira versão lançada há 21 anos (levando em consideração que estamos em 2023), mais precisamente em outubro de 2002.

Além de ser open source, a comunidade é ativa e constantemente fornece feedbacks a equipe de desenvolvedores, com base nos casos de uso da vida real. Atualmente a sua versão mais atual é a [6.0.4](https://docs.spring.io/spring-framework/docs/current/reference/html/) e para utilizar o Spring em uma versão superior a 6.0 é necessário utilizar uma versão superior ao Java 17.

#
## A platforma Spring é dividida em projetos/módulos, aqui estão alguns deles:


- ### Spring Boot
- ### Spring Security
- ### Spring Data
- ### Spring Cloud
        
#

O Spring Framework é o projeto base para todo o ecossistema Spring, e está dividido em 7 grupos:
- Data Access/Integration
    * Esse carinha aqui é responsável pelo gerenciamento de transações, possuindo diversas abstrações consistentes que abrangem diversas API's como o Java Transaction API (JTA), **Java Persistence API (JPA)**, JDBC e Hibernate.

- Web
    * O módulo Web é responsável por conter os recursos (como o MVC e o REST) para a criação de uma aplicação Web.
    Por exemplo, para criarmos uma aplicação web utilizando o Spring Framework, será utilizado o **Spring MVC**. Mas... falaremos mais dele em outro momento.

- Aspect Oriented Programming (AOP)
    * Fica responsável pela implementação da Programação Orientada a Aspectos.

- Instrumentation
    * Fornece implementações de instrumentação.

- Messaging
    * Possui implementação e também o suporte para a programação baseada em mensagens.

- Test
    * Este módulo contém suporte para **testes unitários** com **JUnit** e também **testes de integração**.

- Core Container
    *  É a parte onde estão localizadas as partes fundamentais do framework, desde as classes mais simples até as mais complexas, além de conter suas implementações e o controle das definições em tempo de execução das configurações que poder ser por arquivos XML ou por anotações.
    Por exemplo, é aqui que está implementado a **Inversão de Controle**, o assunto do nosso próximo tópico.

*Neste curso, passaremos por uma explicação sobre os principais projetos do framework para que ao final possamos construir uma API utilizando os recursos do Spring.

#

Ir para: [Inversion of Control »](/content/EcossistemaSpring/2-Spring/IoC.md)