import java.util.Scanner;
public class ParesImpares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Insira um número inteiro:");
		n = in.nextInt();
		
		if (n%2 == 0) {
			System.out.println("Este número é par!");
		} else {
			System.out.println("Este número é ímpar!");
		}
		
		in.close();
	}
}