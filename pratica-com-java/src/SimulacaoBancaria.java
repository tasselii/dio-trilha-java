import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("1.Depositar");
            System.out.println("2.Sacar");
            System.out.println("3.Consultar Saldo");
            System.out.println("4.Encerrar");


            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.println("Qual o valor a ser depositado ?");
                saldo = scanner.nextDouble();
                System.out.println("Saldo atual: " + saldo);
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                System.out.println("Qual será o valor do saque?");
                float saldoSaque = scanner.nextFloat();
                if (saldoSaque <= saldo) {
                     saldo = saldo - saldoSaque;
                     System.out.println("Saldo atual: " + saldo);
                }
                else {
                    System.out.println("Saldo insuficiente.");
                }
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                System.out.println("Saldo atual: " + saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}