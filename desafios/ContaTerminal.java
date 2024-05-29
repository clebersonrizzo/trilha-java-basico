import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        // Solicitação e leitura do número da agência
        System.out.println("Por favor, digite o número da Agência:");
        scanner.nextLine(); // Consumir a nova linha pendente
        String agencia = scanner.nextLine();

        // Solicitação e leitura do nome do cliente
        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        // Solicitação e leitura do saldo
        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com os dados fornecidos pelo usuário
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                          ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);

        // Fechar o scanner
        scanner.close();
    }
}
