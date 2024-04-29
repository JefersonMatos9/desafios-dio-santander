package controleSimplesSaques;

import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o limite diario:");
        double limiteDiario = scanner.nextDouble();



        for (int i = 0; i <= limiteDiario; i++) {
            System.out.println("Valor do Saque:");
            double valorSaque = scanner.nextDouble();

            if (valorSaque <= 0){
                System.out.println("Transações encerradas");
                break;
            }else if (valorSaque > 0 && valorSaque <= limiteDiario){
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado. Limite restante:"+ limiteDiario + "\nTransações encerradas.");
            }else {
                System.out.println("Limite diario de saque atingido. Transações encerradas");
                break;
            }
        }
        scanner.close();
    }
}
