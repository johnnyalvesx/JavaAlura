import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nomeCliente = "Fulano";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double valor;
        String extrato;
        String menu;
        int opcao = 0;

        extrato = (String.format("""
                ****************************************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                ****************************************
                """, nomeCliente, tipoConta, saldo));
        menu = """
                ** Digite sua opção **
                                
                1 - Consultar saldo
                2 - Transferir saldo
                3 - Receber valor
                4 - Sair
                """;

        System.out.println(extrato);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = in.nextInt();
            switch (opcao) {
                case 1 -> System.out.printf("Seu saldo atual é de R$ %.2f \n\n", saldo);
                case 2 -> {
                    System.out.println("Valor a ser transferido: ");
                    valor = in.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente. \n");
                    } else {
                        saldo -= valor;
                        System.out.printf("Saldo atual: R$ %.2f \n\n", saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Valor do depósito: ");
                    valor = in.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Não há saldo suficiente. \n");
                    } else {
                        saldo += valor;
                        System.out.printf("Saldo atual: R$ %.2f \n\n", saldo);
                    }
                }
                case 4 -> System.out.println("Obrigado por usar nossos serviços!");
                default -> System.out.println("Opção inválida, digite novamente.");
            }
        }
    }
}
