import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Hello again, World!");
        System.out.println("Digite uma placa de carro que possua: \n" +
                "7 caracteres no máximo;\n" +
                "3 primeiros caracteres precisam ser letras;\n" +
                "4 últimos caracteres precisam ser números.");
        String entrada = in.nextLine();

        if (!validaEntrada(entrada)) {
            System.out.println("Por favor, digite o número corretamente.");

        } else {
            System.out.println("A placa digitada é válida!");
        }
    }

    public static boolean validaEntrada(String entrada) {

        entrada = entrada.replaceAll("[^a-zA-Z0-9]", "");

        if (entrada.length() != 7) {
            return false;
        }
        if (!entrada.substring(0, 3).matches("[A-Z]*")) {
            return false;
        }
        return entrada.substring(3).matches("[0-9]*");

    }
}
