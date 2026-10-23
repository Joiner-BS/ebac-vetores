import java.util.Scanner;

public class TransformacaoVetor {

    // Ponto de entrada do programa.
    public static void main(String[] args) {

        // Prepara a leitura dos dados pelo teclado.
        Scanner scanner = new Scanner(System.in);

        // Recebe a quantidade de posições do vetor.
        System.out.println("Quantos números deseja informar?");
        int n = scanner.nextInt();

        // Cria o vetor com o tamanho informado.
        int[] numeros = new int[n];

        // Preenche cada posição com um número inteiro.
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            numeros[i] = scanner.nextInt();
        }

        // Fecha o leitor após a última entrada de dados.
        scanner.close();

        // Exibe os valores antes da transformação.
        System.out.println("Vetor informado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();

        // Transforma o valor armazenado em cada posição do vetor.
        for (int i = 0; i < numeros.length; i++) {

            // Duplica os números pares.
            if (numeros[i] % 2 == 0) {
                numeros[i] *= 2;
            } else {
                // Eleva os números ímpares ao quadrado.
                numeros[i] = (int) Math.pow(numeros[i], 2);
            }
        }

        // Exibe os valores depois da transformação.
        System.out.println("Vetor modificado:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println();
    }
}