import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, j;
		double media;
		double vetor[] = new double[3];
		double matriz[][] = new double [3][4];
		
		for(j=0; j<3;j++) {
			
			media=0;
					
			for(i=0; i<3; i++) {
				System.out.println("Insira a " + (i+1) + "° nota do aluno " + (j+1) + ":");
				vetor[i] = in.nextDouble();
				media = media + vetor[i];
			}
	
			media = media/3;
			
			System.out.print("Aluno " + (j+1) + " Notas: ");
			
			for(i=0; i<3; i++) {
				System.out.print(vetor[i] + " ; ");	
			}
			
			System.out.printf("%.1f", media);
			System.out.println();
			System.out.println();

		}
		
	}
}
