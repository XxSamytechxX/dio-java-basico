import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("SEJA BEM VINDO! COM APENAS ALGUMAS INFORMAÇÕES CRIAREMOS SUA CONTA");
        System.out.println("------------------------------------------------------------------");
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o valor do depósito inicial para abertura da conta");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("------------------------------------------------------------------");
        System.out.println("Ola, " + nome);
        System.out.println("Obrigado por criar uma conta em nosso banco, seguem seus dados:");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Seu nome: " + nome);
        System.out.println("Saldo disponível para saque: " + "R$ " + saldo +"0");
        System.out.println("------------------------------------------------------------------");

        System.out.println("Obrigado pela preferência!");
        
    }
}
