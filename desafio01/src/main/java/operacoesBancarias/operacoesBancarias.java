package operacoesBancarias;

import java.util.Scanner;

public class operacoesBancarias {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        while (true) {
            System.out.println("Escolha uma opção");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar Saldo");
            System.out.println("0 - Encerrar");

             opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo Atual:"+ saldo);
                    break;

                case 2:
                    System.out.println("Digite o valor a ser sacado:");
                    double sacar = scanner.nextDouble();
                    if (sacar <= saldo) {
                        saldo -= sacar;
                        System.out.println("Saque realizado com sucesso");
                        System.out.println("Saldo Atual:" + saldo);

                    } else {
                        System.out.println("Saldo insuficiente");

                    }
                    break;

                case 3:
                    System.out.println("Saldo:" + saldo);
                    break;

                case 0:
                    System.out.println("Encerrando programa");
                    scanner.close();
                    return;
            }
        }
    }
}