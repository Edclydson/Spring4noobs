## Serviços _(Services)_

Essa é a camada onde ficam as regras de négocio, ela é a responsável por realizar toda a lógica da nossa API.

Dentro dela teremos os métodos para realizarmos as operações e a anotação ``@Service`` para dizer ao Spring que essa classe contém as regras de negócio da nossa aplicação, olha só como fica:


```java
@Service
public class CursoService{
    
    private final CursoRepository repository;

    public CursoService(CursoRepository repository) { // OLHA A INJEÇÃO DE DEPENDENCIA VIA CONSTRUTOR
        this.repository = repository;
    }

    public void create(Curso curso){    //CREATE
        repository.save(curso);
    }

    public List<Curso> read(){  //READ
        return repository.findAll();
    }

    public Curso readOne(Long idDoCurso){   //READ ONLY ONE
        return repository.findById(idDoCurso).get();
    }

    public void update(String nomeDoCurso, Long id){ //UPDATE
        Curso cursoExistente = readOne(id);
        cursoExistente.setNomeDoCurso(nomeDoCurso);
        repository.save(cursoExistente);
    }

    public void delete(Long idDoCurso){ //DELETE
        repository.deleteById(idDoCurso);
    }
}
```

É possível observar que a dependência de ``CursoRepository`` é injetada via construtor e logo após temos os métodos que utilizam-se da variável ``repository``.

O ultimo passo é criar nosso controlador.

Ir para: [Controllers »](/content/ProjetoSpring/Controllers.md)