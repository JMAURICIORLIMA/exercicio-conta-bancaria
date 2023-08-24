import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("|-----------------------------|\n" +
                        " -------- Bem vindo(a) -------");
        System.out.print("Informe o nome do cliente: ");
        String nomeUsuario = sc.nextLine();

        System.out.print("Informe o número da agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.print("Informe o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.print("Informe o saldo em conta: ");
        double saldo = sc.nextDouble();

        System.out.println("");

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d" +
                " e seu saldo R$ %.2f, já está disponível para saque.", nomeUsuario, numeroAgencia, numeroConta, saldo);

    }
}
