package contaterminal;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero;
		String agencia, nomecliente;
		double saldo;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Olá!\n" + "Seja bem vindo ao banco da DIO.");
		System.out.println("Por favor, digite o seu nome");
		nomecliente = scanner.next();
		System.out.println("Por favor, digite o número da agência");
		agencia = scanner.next();
		System.out.println("Por favor, digite o número da conta");
		numero = scanner.nextInt();
		System.out.println("Por favor, digite o seu saldo");
		saldo = scanner.nextDouble();
		System.out.println("Olá, "+nomecliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de "+saldo+" já está disponível para saque");
	}
}
