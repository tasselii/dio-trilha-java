import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Menu:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Transferir");
            System.out.println("3 - Sacar");
            System.out.println("4 - Imprimir Extrato");
            System.out.println("5 - Sair");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Depositar: ");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    int deposito = scanner.nextInt();
                    scanner.nextLine();

                    switch (deposito) {
                        case 1:
                            System.out.println("Informe o valor do seu depósito: ");
                            double saldo = scanner.nextDouble();
                            cc.depositar(saldo);
                            break;
                        case 2:
                            System.out.println("Informe o valor do seu depósito: ");
                            double saldo2 = scanner.nextDouble();
                            poupanca.depositar(saldo2);
                            break;
                        default:
                            System.out.println("Opção de depósito inválida!");
                    }
                    break;
                case 2:
                    System.out.println("Tranferencia: ");
                    System.out.println("1 - Conta Corrente -> Conta Poupança");
                    System.out.println("2 - Conta Poupança -> Conta Corrente");
                    int transferencia = scanner.nextInt();
                    scanner.nextLine();

                    switch (transferencia) {
                        case 1:
                            System.out.println("Informe o valor da transferencia: ");
                            double transferencia1 = scanner.nextDouble();
                            cc.transferir(transferencia1, poupanca);
                            break;
                        case 2:
                            System.out.println("Informe o valor da transferencia: ");
                            double transferencia2 = scanner.nextDouble();
                            poupanca.transferir(transferencia2, cc);
                            break;
                        default:
                            System.out.println("Opção de depósito inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Saque: ");
                    System.out.println("1 - Conta Corrente");
                    System.out.println("2 - Conta Poupança");
                    int saque = scanner.nextInt();
                    scanner.nextLine();

                    switch (saque) {
                        case 1:
                            System.out.println("Informe o valor do seu Saque: ");
                            double saque1 = scanner.nextDouble();
                            cc.sacar(saque1);
                            break;
                        case 2:
                            System.out.println("Informe o valor do seu Saque: ");
                            double saldo2 = scanner.nextDouble();
                            poupanca.sacar(saldo2);
                            break;
                        default:
                            System.out.println("Opção de depósito inválida!");
                    }
                    break;
                case 4:
                    cc.imprimirExtrato();
                    poupanca.imprimirExtrato();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Operação Finalizada.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}