package pratica2;
import java.util.Scanner;
import java.util.Arrays;
public class questao3pratica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int [] numeros = new int [10];
		int aux;
							
		Scanner entrada = new Scanner(System.in); //recebendo a entrada de valor
		for(int i=0;i<10;i++) {
			System.out.printf("\nInforme dez números: ",i+1);
			numeros[i]=entrada.nextInt();
		}
		
		Arrays.sort(numeros);
		for (int numero : numeros) {
			System.out.print(numero +"\t");
	     //System.out.print();
				
		}

		
	}

}
