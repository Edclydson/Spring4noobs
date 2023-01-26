## Controladores _(Controllers)_

Controladores são acessos as funcionalidades que criamos lá no nosso serviço, vê só:


- Anotamos com o ``@RestController`` para informar ao Spring que essa classe será nosso controlador e injetamos a dependência do serviço via construtor.

```java
@RestController("/")
public class He4rtController{

    private final CursoService service;

    public He4rtController(CursoService service) {
        this.service = service;
    }

    @PostMapping("/novo4noobs")
    public void create(@RequestBody Curso curso){
        service.create(curso);
    }

    @GetMapping("/all4noobs")
    public List<Curso> read(){
        return service.read();
    }

    @GetMapping("/this4noob/{id}")
    public ResponseEntity<Curso> readOne(@PathVariable Long id){
        return ResponseEntity.ok(service.readOne(id));
    }

    @PutMapping("/alter4noobs/{id}/{nome}")
    public ResponseEntity update(@PathVariable("nome") String nomeDoCurso, @PathVariable("id") Long id){
        service.update(nomeDoCurso,id);
        return ResponseEntity.ok("Nome do curso alterado!");
    }

    @DeleteMapping("/vaza4noobs/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

}
```

- Por fim, criamos os métodos que são anotados com os verbos HTTP (GET, POST, PUT e DELETE) e passamos parâmetros tanto no corpo da requisição (o ``@RequestBody``), quanto no caminho da nossa aplicação (o ``@PathVariable``).

Feito isso, temos uma API RESTful que realiza o cadastro, leitura, alteração e também apaga os registros inseridos no banco de dados. 

Se você quiser ver esse projeto completo é só clicar [aqui](/content/ProjetoSpring/api4noobs/) que você vai parar lá na pasta dele, ai dá pra baixar e testar ai na sua máquina!

Bom, é isso galera! Um abraço no 💜 de vocês!