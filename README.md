# Programa de Retângulos

Este projeto em Java implementa uma classe `Retangulo` com métodos para calcular a área, o perímetro, e exibir informações sobre o retângulo. O programa também realiza operações com vetores de objetos `Retangulo`, incluindo classificação e expansão dinâmica.

## Estrutura do Projeto

O projeto é dividido em três partes principais:

### Parte 1: Classes, Objetos e Métodos

Nesta parte, a classe `Retangulo` foi implementada com os seguintes métodos:

- **Construtor:** Recebe os valores de `largura` e `altura` e os atribui aos atributos da classe.
- **calcularArea():** Retorna a área do retângulo (`largura * altura`).
- **calcularPerimetro():** Retorna o perímetro do retângulo (`2 * (largura + altura)`).
- **exibirInformacoes():** Exibe a largura, altura, área e perímetro do retângulo.

### Parte 2: Vetores

Nesta parte, foi criado um vetor de `Retangulo` com capacidade para 5 objetos. O programa permite que o usuário forneça os valores de `largura` e `altura` para preencher o vetor, e depois exibe as informações de cada retângulo. Além disso, o programa encontra e exibe o retângulo com a maior área e o retângulo com o menor perímetro.

### Parte 3: Classificação e Expansão de Vetores de Objetos

Nesta parte, o vetor de `Retangulo` é ordenado em ordem crescente com base na área. O vetor também é expandido dinamicamente para permitir a adição de mais retângulos, com o vetor original sendo duplicado em tamanho (de 5 para 10 posições). Após a expansão, novas informações de retângulos são coletadas e exibidas.
