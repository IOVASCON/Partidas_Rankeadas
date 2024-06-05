# Calculadora de Partidas Rankeadas

Este projeto é um sistema simples em Java para calcular o saldo de vitórias e derrotas de um jogador em partidas rankeadas e determinar o nível do jogador com base na quantidade de vitórias.

## Funcionalidades

- Solicita a quantidade de vitórias e derrotas do jogador.
- Calcula o saldo de partidas rankeadas (vitórias - derrotas).
- Determina o nível do jogador com base na quantidade de vitórias:
  - Ferro: menos de 10 vitórias
  - Bronze: 11 a 20 vitórias
  - Prata: 21 a 50 vitórias
  - Ouro: 51 a 80 vitórias
  - Diamante: 81 a 90 vitórias
  - Lendário: 91 a 100 vitórias
  - Imortal: mais de 100 vitórias

## Como Executar

### Pré-requisitos

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.

### Passos para Compilar e Executar

1. **Clone o repositório**:

   git clone https://github.com/IOVASCON/Nivel_Heroi.git

2. Navegue até o diretório do projeto:

    cd Nivel_Heroi/NivelHeroi/src

3. Compile o arquivo Java:

    javac CalculadoraPartidasRankeadas.java

4. Execute o programa:

    java CalculadoraPartidasRankeadas

## Exemplo de Uso

Digite a quantidade de vitórias: 15
Digite a quantidade de derrotas: 5
O Herói tem de saldo de 10 está no nível de Bronze

## Estrutura do Projeto

Partidas_Ranqueadas/
├── PartidasRanqueadas
|    ├── .vscode
|    ├── bin/
|    ├── lib/
|    ├── src/
│        └── CalculadoraPartidasRankeadas.java
└── README.md

## Contribuição

Sinta-se à vontade para contribuir com este projeto. Para isso, siga os passos abaixo:

    Faça um fork do projeto.
    Crie uma nova branch (git checkout -b feature/nova-feature).
    Faça as alterações necessárias e adicione os commits (git commit -m 'Adiciona nova feature').
    Envie as mudanças para o seu repositório forkado (git push origin feature/nova-feature).
    Crie um novo Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT