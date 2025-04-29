import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seja bem vindo ao Banco Java. Por favor digite seu nome: ");
        String nome = scanner.next();
        System.out.printf("Muito bem, %s. Agora informe a sua agência:\n", nome);
        String agencia = scanner.next();
        System.out.printf("Excelente, %s. Agora informe o número da sua conta:\n", nome);
        int numero = scanner.nextInt();
        System.out.printf("Ótimo, %s. Agora informe o saldo da sua conta:\n", nome);
        Double saldo = scanner.nextDouble();
        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s e já está disponível para saque.\n", nome, agencia, numero, saldo);
        scanner.close();
    }
}
