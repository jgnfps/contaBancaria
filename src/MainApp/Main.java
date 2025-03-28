package MainApp;

import ContaBancaria.ContaBancaria;
import ContaBancaria.ContaImplements;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor inicial da conta?");
        double valorInicial = sc.nextDouble();
        sc.nextLine(); // Consumir a quebra de linha residual após nextDouble()

        ContaBancaria conta = new ContaImplements(valorInicial);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consultar Cheque Especial");
            System.out.println("3. Depositar");
            System.out.println("4. Sacar");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            String opcao = sc.nextLine();

            if (opcao.equals("1")) {
                conta.consultarSaldo();
            } else if (opcao.equals("2")) {
                conta.consultarChequeEspecial();
            } else if (opcao.equals("3")) {
                System.out.println("Qual o valor que você deseja depositar?");
                double valorDepositar = sc.nextDouble();
                sc.nextLine(); // Consumir a quebra de linha residual
                conta.depositar(valorDepositar);
            } else if (opcao.equals("4")) {
                System.out.println("Qual o valor do saque?");
                double valorSaque = sc.nextDouble();
                sc.nextLine(); // Consumir a quebra de linha residual
                conta.sacar(valorSaque);
            } else if (opcao.equals("5")) {
                System.out.println("Qual o valor do boleto?");
                double valorBoleto = sc.nextDouble();
                sc.nextLine(); // Consumir a quebra de linha residual
                conta.pagarBoleto(valorBoleto);
            } else if (opcao.equals("6")) {
                System.out.println("Saindo... Obrigado por usar o sistema.");
                continuar = false;
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }
        }

        sc.close(); // Fechar o scanner após o uso
    }
}

