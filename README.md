# Estrutura de dados
As estruturas de dados são formas de armazenar e organizar dados, para os usar durante a execução do `software`.
Aprender sobre as principais estruturas e formas de adicionar, remover, buscar dados dentro delas é muito importante.
Conhecer e dominar a a API de `Collections` é fundamental para resolução de problemas no dia-a-dia do programador.

Repositório criado para exemplificar as principais estruturas além de exercícios, formas de fazer diferente, mais/menos performáticas.
>### Listas
>Nesse módulo foi abordado o comportamento de listas.
>### Classes
>No projeto, foi criado algumas classes, para implementação personalizadas de métodos  que ja existem no `ArrayList` para exercício. Segue as classes com explicação da evolução do código, no  `labs` de cada pacote tem exercícios sobre o item abordado.
>#### Vetor
>Na classe `Vetor`, foi implementado uma lista de `String`, criado `testes` para cada uma funcionalidade;
>#### VetorObject
>Na classe `VetorObject`, foi evoluída a classe `Vetor`, de maneira que podia criar dinamicamente uma lista, com qualquer tipo.
>O problema é que um vetor, deveria ser composto de itens apenas do mesmo tipo, e dessa forma, poderia ser adicionado items
>de qualquer tipo. Os testes presentes em `VetorObjectTest`, também são os mesmos presentes na classe `Vetor`, garantindo o mesmo funcionamento da classe.
>#### Lista
>Na classe `Lista`, houve mais uma evolução, os itens  de uma lista precisam ser todos do mesmo item, foi adicionado um tipo `<T>` fazendo com 
>que todos os itens da lista sejam do mesmo tipo. Mais uma vez os testes foram copiados, mudando apenas as variaves, para o novo tipo.
>Para garantir o funcionamento de todos os métodos, mudando apenas o tipo.


>### Base
> #### EstruturaEstatica
>> Foi criada uma estrutura base, para poder ser `extendida` as funções comuns entre as `Colletions`.

>### Pilhas