
# Map


- A interface Map é usada para mapear dados na forma de chaves e valores.
- O Map do Java é um objeto que mapeia chaves para valores.
- Um Map não pode conter chaves duplicadas: cada chave pode mapear no máximo um valor.
- A plataforma Java possui três implementações gerais de Map: HashMap, TreeMap e LinkedHashMap.
- As operações básicas do Map são: put (inserir ou atualizar), get (obter), containsKey (verificar se contém uma chave), containsValue (verificar se contém um valor), size (obter o tamanho) e isEmpty (verificar se está vazio)

```
HashTable é uma implementação antiga da interface Map no Java que é sincronizada e thread-safe, tornando-a adequada para uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.
LinkedHashMap, por outro lado, é uma implementação da interface Map que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que os elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.
HashMap é uma implementação da interface Map que não mantém uma ordem específica dos elementos. Ele armazena os elementos internamente usando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos
```


![Logo](https://github.com/cami-la/collections-java-api-2023/raw/master/assets/image/map-interface-hierarchy.png)





