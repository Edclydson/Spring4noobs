## Projeto Spring

Eu sei que você tava ansioso pra ver o Spring na prática, mas tenha sempre em mente que é bacana conhecer a tech que a gente vai trabalhar primeiro e depois a gente começa a brincar com o que ela nos oferece.

Mas chega de papo e vamos falar brevemente sobre alguns conceitos chave que a gente vai usar na aplicação que vai ser desenvolvida neste módulo.

- API REST e RESTful
    - Aplicação *Client*/*Server* que envia e recebe dados por meio do protocolo HTTP utilizando padrões de comunicação como XML e o JSON (_mais utilizado atualmente_).
    
    - API (_Application Programming Interface_)
        - Permite a interoperabilidade (_nome gigante pra dizer que troca de dados/informações_) entre sistemas, por exemplo um sistema desktop e mobile podem consumir uma mesma API.

    - REST
        - Modelo arquitetural (_leia como conjunto de boas práticas_) utilizado para que o desenvolvimento de uma aplicação não seja uma zona e tenha uma documentação minimamente descente.

    - RESTful
        - (_Senta que lá vem história..._) Um brother chamado Leonard Richardson propôs um modelo de maturidade composto por quatro níveis:

            - **Nivel 0**: Chamado também de nível POX, que é quando uma API utiliza o protocolo HTTP apenas como mecanismo de comunicação e não utiliza os verbos existentes.

            - **Nivel 1**: Quando uma API passa a utilizar os recursos de forma correta, definindo cada recurso no seu quadrado e utilizando os substantivos pra representar os objetos.

            - **Nivel 2**: Usa o HTTP de forma semântica com os métodos e os tipos que vão ser retornados pra cada resposta de uma requisição.

            - **Nivel 3**: Possui o HATEOAS que são hipermidias que mostram o estado atual, o relacionamento com elementos ou estados futuros, resumindo, é a capacidade que um documento tem de se relacionar com os demais.

Passado essa breve explicação sobre API, REST, RESTful e niveis... Vamos ao que realmente interessa.

Ir para: [Spring Initializr](/content/ProjetoSpring/SpringInitializr.md)