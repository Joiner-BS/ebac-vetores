import java.util.Scanner;

public class OrdenacaoEVogais {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura dos dados pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Recebe a quantidade de números que serão armazenados.
        System.out.println("Quantos números deseja informar?");
        int n = scanner.nextInt();

        // Cria o vetor com a quantidade de posições informada.
        int[] numeros = new int[n];

        // Preenche cada posição com um número digitado pelo usuário.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();
        }

        // Exibe os valores para conferir o preenchimento.
        System.out.println("Vetor informado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        // Faz passagens pelo vetor para colocar os valores em ordem crescente.
        for (int passagem = 0; passagem < numeros.length - 1; passagem++) {

            // Compara os vizinhos da parte que ainda precisa ser ordenada.
            for (int i = 0; i < numeros.length - 1 - passagem; i++) {

                // Troca as posições quando o valor da esquerda é maior.
                if (numeros[i] > numeros[i + 1]) {
                    int auxiliar = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = auxiliar;
                }
            }
        }

        // Exibe o vetor depois da ordenação.
        System.out.println("Vetor ordenado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        // Consome a quebra de linha deixada pela última leitura com nextInt().
        scanner.nextLine();

        // Recebe o nome completo.
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        // Converte o nome em um vetor de caracteres.
        char[] letras = nome.toCharArray();

        // Inclui vogais maiúsculas, minúsculas e acentuadas.
        String vogais = "aeiouAESystem.outUáàâãéêíóôõúüÁÀÂÃÉÊÍÓÔÕÚÜ";
        int quantidadeDeVogais = 0;

        // Examina cada caractere do nome.
        for (char letra : letras) {

            // Um resultado diferente de -1 indica que o caractere é uma vogal.
            if (vogais.indexOf(letra) != -1) {
                quantidadeDeVogais++;
            }
        }

        // Exibe o total encontrado.
        System.out.println("Quantidade de vogais: " + quantidadeDeVogais);


        // Fecha o leitor após concluir todas as entradas de dados
        scanner.close();
    }
}