import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o Nome!");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o Saldo!");
        double saldo = sc.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!\n");
    }
}
