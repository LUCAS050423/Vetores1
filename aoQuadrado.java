
import java.util.Scanner;
public class aoQuadrado {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10; 
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("o "+(i+1)+" valor de A");
			a[i]= in.nextInt();
	
		b[i] = a[i] * a[i];
		}
		
		
		
		System.out.print("\nb = ");

		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		} 
		in.close();

	}

}