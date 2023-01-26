## Modelos _(Models)_
Criaremos um pacote _(package)_ chamado de *model* dentro do pacote principal do nosso projeto e em seguida criamos a classe ``Curso``:

![Criando o pacote model e a classe Curso](/images/projetospring01.jpg)

Olhando para nosso modelo de ``Curso``:


```java
@Entity(name = "4noobs_tb")
public class Curso{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idDoCurso;
    private String nomeDoCurso;
    private String autorDoCurso;
    private String linkDoCurso;


    public String getNomeDoCurso() {
        return nomeDoCurso;
    }

    public void setNomeDoCurso(String nomeDoCurso) {
        this.nomeDoCurso = nomeDoCurso;
    }

    public String getAutorDoCurso() {
        return autorDoCurso;
    }

    public void setAutorDoCurso(String autorDoCurso) {
        this.autorDoCurso = autorDoCurso;
    }

    public String getLinkDoCurso() {
        return linkDoCurso;
    }

    public void setLinkDoCurso(String linkDoCurso) {
        this.linkDoCurso = linkDoCurso;
    }

    public Long getIdDoCurso() {
        return idDoCurso;
    }

    public void setIdDoCurso(Long idDoCurso){
        this.idDoCurso = idDoCurso;
    }
}
```

Criamos os atributos ``idDoCurso``, ``nomeDoCurso``, ``autorDoCurso`` e ``linkDoCurso``. Anotamos a classe com o ``@Entity`` do *Jakarta persistence**
para informar ao Spring que crie uma tabela no banco de dados com o nome de *4noobs_tb*, também informamos que os atributos daquela classe serão as colunas da tabela e que ao usar a annotation ``@Id`` tornamos o ``idDoCurso`` a chave primária _(Primary Key - PK)_ da nossa tabela e que ele será gerado automaticamente por conta da ``@GeneratedValue``.

Após a criação dos atributos, geramos os Getters e Setters já que não usaremos o lombok.


**A ultima versão do Spring (6.0.4) não se utiliza mais o javax persistence*

Ir para: [Repositories »](/content/ProjetoSpring/Repositories.md)