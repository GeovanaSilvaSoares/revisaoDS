import java.util.Scanner;
public class Negativo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		
		System.out.println("Insira um número inteiro:");
		n = in.nextInt();
		
		if(n<0) {
			System.out.println("Este número é negativo!");
			
		}else {
			System.out.println("Este número é positivo!");
		}
			
		
		in.close();
	}

}