import java.util.Scanner;
public class vetorMedia {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner ler=new Scanner(System.in);
			final int TAM=10;
			int i;
			double soma = 0,media,a[];
			a=new double[TAM];
			
			
			for(i=0;i<TAM;i++) {
				System.out.println("digite o "+(i+1)+" valor :");
				a[i]=ler.nextDouble();
				soma+=a[i];
			}
			
			
			media=soma/TAM;
			System.out.println("a média é "+media);
			
		}
	 
	}
