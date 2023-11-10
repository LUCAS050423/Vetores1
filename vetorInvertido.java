import java.util.Scanner;
public class vetorInvertido {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		//laço para leitura do vetor A
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i]= in.nextInt();
			
		}
		b[9] = a[0];
		b[8] = a[1];
		b[7] = a[2];
		b[6] = a[3];
		b[5] = a[4];
		b[4] = a[5];
		b[3] = a[6];
		b[2] = a[7];
		b[1] = a[8];
		b[0] = a[9];
		
		System.out.print("\nB = ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
