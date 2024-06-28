package Application;

import Entities.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o número da agência com dígito: ");
        String agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente: ");
        String nome_cliente = sc.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = sc.nextDouble();

        ContaBanco conta = new ContaBanco(numero,agencia,nome_cliente,saldo);

        System.out.println(conta);

    }
}
