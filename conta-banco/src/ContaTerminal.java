import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Dados da conta
        int numero = 1021;
        String agencia = "1234-5";
        String nomeCliente = "MATHEUS FREITAS";
        double saldo = 5000.0;

        // Exibindo as mensagens para inserção de dados
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Definindo o uso do ponto como separador decimal

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        saldo = scanner.nextDouble();

        // Exibindo as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
