## Repositórios _(Repositories)_
Da mesma forma que criamos nosso pacode de modelo faremos para o repositório, mas diferente de criarmos uma classe iremos criar uma ``Interface``. Chamaremos o pacote de ``repository`` e dentro dele teremos a interface ``CursoRepository``.

![Criando o pacote do repositório e a interface](/images/projetospring03.jpg)

E nessa interface faremos duas coisas, anotar com o ``@Repository`` para que o Spring saiba que essa interface é um componente do tipo repositório e que o framework deve usá-lo para realizar as *queries* no banco e tabmém faremos a interface estender uma outra interface chamada de ``JpaRepository``, passando o nosso modelo e o id do modelo:

```java
@Repository
public interface CursoRepository extends JpaRepository<Curso, Long>{
}
```

*Ah, mas como vai fazer o select na tabela?*

Calma, jovem... O Spring sabe das coisas e a gente não precisa fazer as operações básicas de um CRUD explicitamente porque o nosso repositório já conta com esses métodos. Então, por aqui é só isso... vamos para o próximo tópico.

Ir para: [Services »](/content/ProjetoSpring/Services.md)