## Spring Data JPA 

- O Spring Data JPA faz parte da extensa familia do Spring Data, facilitando a implementação dos repositórios baseados em JPA.

- Anteriormente ao Spring Data JPA, implementar uma camada de acesso de dados era necessário lidar com boilerplates excessivos mesmo para requisições simples, assim como para paginação e auditorias.

- Então, a missão desse projeto é melhorar significativamente a implementação das *layers* de acesso de dados reduzindo o esforço para somente o necessário.

- Basta o desenvolvedor criar sua interface do repositório, incluir os métodos de *find* (um *findByName* por exemplo) e o Spring vai te fornecer a implementação **automaticamente**. Show de bola, né?

```java
@Repository
public interface fodaseRepository extends JpaRepository<Dev,Long>{

    Optional<Dev> findByName(String nomeDev);
}
```

- Aqui são algumas das Annotations que podemos encontrar nas entidades e nas interfaces dos repositórios:
    - ``@Repository``
        - Define o repositório como um Bean.
    - ``@Query``
        - Usada para fornecer uma implementação JPQL para um método do repositório.
    - ``@GeneratedValue``
        - Define que o provedor de persistência (JPA) gerencie a criação do id da entidade.



Ir para: [Spring Batch »](/content/EcossistemaSpring/7-SpringBatch/SpringBatch.md)