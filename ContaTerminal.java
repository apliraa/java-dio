
import java.util.Scanner;

public class ContaTerminal
{
	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número da sua conta: ");
		int numeroConta = scanner.nextInt();
        scanner.nextLine();
		
		System.out.print("Digite o número da sua agência: ");
		String numeroAgencia = scanner.nextLine();
		
		System.out.print("Digite seu nome completo: ");
		String nomeCliente = scanner.nextLine();
		
		System.out.print("Digite o saldo da sua conta: ");
		float saldoConta = scanner.nextFloat();
		scanner.nextLine();

        scanner.close();

		System.out.print("Olá, " +nomeCliente + ", obrigado por criar uma conta no nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque."); 
		
	}
}