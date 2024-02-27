import java.util.Scanner;
public class Vetor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int vetorA[], i;
		
		vetorA = new int[6];
		for (i=0; i<6; i++) {
			System.out.println("Entre com o " + (i+1) + "º valor do vetor:");
			vetorA[i] = in.nextInt();
		}
		
		for (i=0; i<6; i++) {
			System.out.println("Na posição " + i + " teremos o valor " + vetorA[i]);
		}
		
		in.close();
	}

}
