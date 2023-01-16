## Spring MVC

- Esse projeto do Spring é baseado no pattern MVC e tem como objetivo ajudar a criar aplicações web mais robustas e flexíveis, tudo isso de uma maneira super simples e com elegância.

- Um controller é criado utilizando a Annotation ``@Controller`` ou ``@RestController``, então os métodos criados dentro desta classe são mapeados para a URL que o controller irá ser chamado.

```java
@RestController("/")
public class Controlador{

    @GetMapping("/hello")
    public ResponseEntity helloHe4rt(){
        return ResponseEntity.ok("Olá He4rt Developers");
    }

}
```

- Aqui estão algumas Annotations que podemos encontrar:

    - ``@PathVariable``
        - Define o recebimento de parâmetros de uma requisição.
    - ``@RequestBody``
        - Realiza o mapeamento do corpo da solicitação HTTP para um objeto.
    - ``@RequestMapping``
        - Mapeia requisições REST.

Ir para: [5. Spring Security »](/content/EcossistemaSpring/5-SpringSecurity/SpringSecurity.md)
