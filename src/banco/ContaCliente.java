package banco;

import java.util.Scanner;

public class ContaCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta("Luiz Gustavo", 'C', 1000.0);

        while (true) {
            System.out.println("********************");
            System.out.println("\n======= MENU =======");
            System.out.println("\nOperações");
            System.out.println("""
                    1- Consultar Saldos
                    2- Receber Valor
                    3- Transferir Valor
                    4- Sair
                    """);
            System.out.println("********************");

            int opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Saldo disponível: R$ ");
                    System.out.println(conta.getSaldo());
                    break;
                case 2:
                    System.out.println("\nInforme o valor a ser recebido: ");
                    conta.recebeSaldo(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("\nInforme o valor a ser transferido: ");
                    conta.transfereSaldo(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Programa encerrado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA.TENTE NOVAMENTE...");
                    break;
            }
        }



    }
}
