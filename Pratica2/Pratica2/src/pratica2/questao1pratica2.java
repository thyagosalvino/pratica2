package pratica2;
import java.util.Scanner;
public class questao1pratica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	float total, totalvista, parcelado2, parcelado3, parcelado4,parcelado5,parcelado6, p3, p4, p5, p6; //declarando as variavéis de números não inteiros
	int pag1, pag2, pag3, pag, opcao3, pg3, pg4, pg5, pg6;
		
	Scanner entrada = new Scanner(System.in); //recebendo a entrada de valor
	System.out.println ("Informe o valor total da compra: ");
	
	total = entrada.nextFloat();
	while (total != -1) {
	
		
	System.out.println ("\nEscolha uma opção de pagamento:");
	System.out.println ("1. À vista com 10% de desconto");
	System.out.println ("2. Parcelado 2 vezes");
	System.out.println ("3. Parcelado de 3 a 6 vezes com 3% de acrescimo em cada mês");
	

	pag = entrada.nextInt();
				
	totalvista =(float) ((total)-(total*0.10));
	parcelado2 = ((float)(total/2));
	parcelado3 = ((float)(total/3));
	p3 = ((float)((float)(parcelado3)+(parcelado3 * 0.03)));
	parcelado4 = ((float)(total/4));
	p4 = ((float)((float)(parcelado4)+(parcelado4 * 0.03)));
	parcelado5 = ((float)(total/5));
	p5 = ((float)((float)(parcelado5)+(parcelado5 * 0.03)));
	parcelado6 = ((float)(total/6));
	p6 = ((float)((float)(parcelado6)+(parcelado6 * 0.03)));
	
		
	if (pag == 1)
		System.out.println ("O valor com desconsto de pagamento a vista é R$ " +totalvista);
		else if (pag == 2)
		System.out.println ("O valor da compra ficou em R$ " + parcelado2 + " em duas vezes.");
		else if (pag == 3 & (total >= 500) )
		System.out.println ("Informe em quantas parcelas deseja: ");
			else if (pag == 3 & (total >= 500))
			System.out.println ("Escolha nova forma de pagamento!");
		opcao3 = entrada.nextInt();
			if (opcao3 == 3 )
				System.out.println ("O valor da compra ficou em R$ " + p3 + " em 3 vezes. Total de R$ "+p3*3);
			else if (opcao3 == 4 )
				System.out.println ("O valor da compra ficou em R$ " + p4 + " em 4 vezes. Total de R$ "+p4*4);
			else if (opcao3 == 5 )
				System.out.println ("O valor da compra ficou em R$ " + p5 + " em 5 vezes. Total de R$ "+p5*5);
			else if (opcao3 == 6 )
				System.out.println ("O valor da compra ficou em R$ " + p6 + " em 6 vezes. Total de R$ "+p6*6);
	
	
			System.out.println ("Informe o valor total da compra: ");
			
			total = entrada.nextFloat();
	}
	}

}
