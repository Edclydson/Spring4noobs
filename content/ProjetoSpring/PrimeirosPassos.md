## Primeiros Passos

Depois de tudo o que vimos, vamos colocar em prática os conhecimentos que foram passados. 
Vamos construir uma API RESTful (o famoso CRUD), para vermos o quão simples o Spring torna a vida do dev.

Portanto, neste projetinho super simples usaremos:

*IDE*
- Intellij

*Banco de dados*
- PostgreSQL (Relacional)

*Build*
- Maven

*Dependencias*
- Spring Boot Dev Tools (Auto restart)
- Spring Web
- Spring Data JPA
- PostgreSQL Driver

*Testagem da API*
- Postman

Após criarmos nosso projeto Spring, iremos configurar a conexão com a base de dados no arquivo ``application.properties`` que está no caminho ``src/main/resources/`` :

```
# para dropar e criar as tabelas do banco
spring.jpa.hibernate.ddl-auto=update

# conexão com a base de dados
spring.datasource.url=jdbc:postgresql://localhost:5432/he4rt_db
spring.datasource.username=postgres
spring.datasource.password=password4noobs
```
Feito isso, vamos criar nosso primeiro modelo.

Ir para: [Models »](/content/ProjetoSpring/Models.md)