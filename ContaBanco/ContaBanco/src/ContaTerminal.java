import java.util.Scanner;
import entity.Conta;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta account = new Conta();

        System.out.print("Olá, Digite seu nome:");
        account.nomeCliente = sc.nextLine();

        System.out.print("informe o Número da sua conta: ");
        account.numero = sc.nextInt();

        System.out.print("Digite a Agência: ");
        account.agencia = sc.next();

        System.out.print("Saldo: ");
        account.saldo = sc.nextDouble();

        System.out.println("Olá " + account.nomeCliente +
                ", obrigado por criar uma conta em nosso banco, \nsua agência é " +
                account.agencia + ", número da sua conta: " + account.numero + " e seu saldo de " + account.saldo +
                " já está disponível para saque");
    }
}
