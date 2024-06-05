/*
 * Este programa calcula o saldo de vitórias e derrotas de um jogador
 * em partidas rankeadas e determina o nível do jogador com base na
 * quantidade de vitórias.
 * 
 * Funcionalidades:
 * - Solicita a quantidade de vitórias e derrotas do jogador
 * - Calcula o saldo de partidas rankeadas (vitórias - derrotas)
 * - Determina o nível do jogador com base na quantidade de vitórias
 * 
 * Níveis de classificação:
 * - Ferro: menos de 10 vitórias
 * - Bronze: 11 a 20 vitórias
 * - Prata: 21 a 50 vitórias
 * - Ouro: 51 a 80 vitórias
 * - Diamante: 81 a 90 vitórias
 * - Lendário: 91 a 100 vitórias
 * - Imortal: mais de 100 vitórias
 * 
 * Saída:
 * Exibe uma mensagem com o saldo de vitórias e o nível do jogador.
 * 
 * Explicação dos Comentários

    Importação da Classe Scanner: Explica a necessidade de importar a classe Scanner para ler a entrada do usuário.
    Criação do Scanner: Detalha a criação do objeto Scanner e seu propósito.
    Leitura de Entradas: Comenta a leitura das entradas do usuário para vitórias e derrotas.
    Cálculo do Saldo: Explica o uso da função calcularSaldo e o armazenamento do resultado.
    Determinação do Nível: Explica o uso da função determinarNivel e o armazenamento do resultado.
    Exibição da Mensagem: Descreve a exibição da mensagem final ao usuário.
    Função calcularSaldo: Detalha a função que calcula o saldo de vitórias menos derrotas.
    Função determinarNivel: Descreve a função que determina o nível do jogador com base nas vitórias, incluindo a lógica de decisão.
 */

import java.util.Scanner; // Importa a classe Scanner, que é usada para ler a entrada do usuário

public class CalculadoraPartidasRankeadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        // Solicita a quantidade de vitórias do jogador
        System.out.print("Digite a quantidade de vitórias: ");
        int vitorias = scanner.nextInt(); // Lê a quantidade de vitórias inserida pelo usuário

        // Solicita a quantidade de derrotas do jogador
        System.out.print("Digite a quantidade de derrotas: ");
        int derrotas = scanner.nextInt(); // Lê a quantidade de derrotas inserida pelo usuário

        // Calcula o saldo de partidas rankeadas
        int saldoVitorias = calcularSaldo(vitorias, derrotas); // Chama a função calcularSaldo passando as vitórias e
                                                               // derrotas, e armazena o resultado em saldoVitorias

        // Determina o nível do jogador com base na quantidade de vitórias
        String nivel = determinarNivel(vitorias); // Chama a função determinarNivel passando as vitórias, e armazena o
                                                  // resultado em nivel

        // Exibe a mensagem final com o saldo de vitórias e o nível do jogador
        System.out.println("O Herói tem de saldo de " + saldoVitorias + " está no nível de " + nivel);

        scanner.close(); // Fecha o Scanner para liberar os recursos
    }

    // Função para calcular o saldo de partidas rankeadas
    public static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas; // Retorna o resultado da subtração entre vitórias e derrotas
    }

    // Função para determinar o nível do jogador com base na quantidade de vitórias
    public static String determinarNivel(int vitorias) {
        if (vitorias < 10) { // Se vitórias for menor que 10
            return "Ferro"; // Retorna "Ferro"
        } else if (vitorias >= 11 && vitorias <= 20) { // Se vitórias for entre 11 e 20
            return "Bronze"; // Retorna "Bronze"
        } else if (vitorias >= 21 && vitorias <= 50) { // Se vitórias for entre 21 e 50
            return "Prata"; // Retorna "Prata"
        } else if (vitorias >= 51 && vitorias <= 80) { // Se vitórias for entre 51 e 80
            return "Ouro"; // Retorna "Ouro"
        } else if (vitorias >= 81 && vitorias <= 90) { // Se vitórias for entre 81 e 90
            return "Diamante"; // Retorna "Diamante"
        } else if (vitorias >= 91 && vitorias <= 100) { // Se vitórias for entre 91 e 100
            return "Lendário"; // Retorna "Lendário"
        } else { // Se vitórias for maior ou igual a 101
            return "Imortal"; // Retorna "Imortal"
        }
    }
}
