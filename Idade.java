import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int anoNasc, anoAtual, idade;
		String resp; 
		
		do {
			
			System.out.println("Qual o ano do nascimento?");
			anoNasc = in.nextInt();
			
			System.out.println("Qual o ano atual?");
			anoAtual = in.nextInt();
			
			idade = anoAtual - anoNasc;
			
			if(idade>17) {
				System.out.println(idade + " anos. Maior de idade.");
				
			}else{
				System.out.println(idade + " anos. Menor de idade.");
			}
				
			System.out.println("Deseja calcular a idade de mais uma pessoa?");
			resp = in.next();
			
		} while(resp.equalsIgnoreCase("sim"));
			
	}
}
