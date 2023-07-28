import java.util.Random;
import java.util.Scanner;

public class WhileIf {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um número de 0 a 100: ");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if (numeroGerado == numeroDigitado) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
                break;
            } else if (numeroGerado < numeroDigitado) {
                System.out.println("O número gerado é menor que o número digitado.");
            } else {
                System.out.println("O número gerado é maior que o número digitado.");
            }

            if (tentativas == 5) {
                System.out.println("Infelizmente você não conseguiu acertar o número gerado após 5 tentativas.");

            }
        }
    }
}
