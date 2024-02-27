import java.util.Scanner;
public class Senha {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int senha;
		
		System.out.println("Insira a senha:");
		senha = in.nextInt();
	
		if (senha == 2002 ) {
			System.out.println("Acesso Permitido");
		}
		
		while (senha != 2002) {
			
			System.out.println("Senha Inválida. Insira a senha novamente:");
			senha = in.nextInt();
			
			if (senha == 2002 ) {
				System.out.println("Acesso Permitido");
			}
		}
		
		in.close();
	}
}
