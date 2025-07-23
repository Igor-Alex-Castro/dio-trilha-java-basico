import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		Locale.setDefault(Locale.US);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da conta !");
		numero = scanner.nextInt();
		 scanner.nextLine();
		 
		System.out.println("Por favor, digite o nome da Agência !");
		agencia = scanner.nextLine();
		
		System.out.println("Por favor, digite o nome do(a) Cliente !");
		nomeCliente = scanner.nextLine();
		
		System.out.println("Por favor, digite o saldo da conta !");
		saldo = scanner.nextDouble();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,"
				+ " sua agência é %s, conta %s e seu saldo %s"
				+ " já está disponível para saque", nomeCliente, agencia, numero, saldo);

	}

}
