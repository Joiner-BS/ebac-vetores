import java.util.Scanner;

public class InversaoNome {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura do nome pelo teclado.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        // Fecha o leitor após a última entrada de dados.
        scanner.close();

        // Transforma o nome em um vetor de caracteres.
        char[] letras = nome.toCharArray();

        // Exibe os caracteres na ordem original.
        System.out.println("Nome informado:");

        for (char letra : letras) {
            System.out.print(letra);
        }

        System.out.println();

        // Percorre a primeira metade do vetor e troca os caracteres opostos.
        for (int i = 0; i < letras.length / 2; i++) {

            // Calcula a posição correspondente na outra extremidade.
            int posicaoOposta = letras.length - 1 - i;

            // Preserva o caractere inicial antes da troca.
            char auxiliar = letras[i];

            letras[i] = letras[posicaoOposta];
            letras[posicaoOposta] = auxiliar;
        }

        // Exibe os caracteres depois da inversão.
        System.out.println("Nome invertido:");

        for (char letra : letras) {
            System.out.print(letra);
        }

        System.out.println();

    }
}