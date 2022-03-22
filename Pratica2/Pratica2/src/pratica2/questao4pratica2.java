package pratica2;


import java.util.Random;
import java.util.Scanner;


public class questao4pratica2 {

		
		public class system {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}
		public class Ramdom {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}

		}
		public class string {
				
			public static void main(String[] args) {
				// TODO Auto-generated method stub

			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		int opcao = 0, poltrona,i;
		long CPF,CPF2,nVoo,CPF3,nVoo3;
		String nome;
		String data;
		int voo;
		String horario;
		
		int[] tab = new int[100];
		
		for(i=0;i<100;i++) {
			
			tab[i]=0;
		}
		
	while ( opcao!=4) {
			

			System.out.print ("Selecione uma das 3 oções abaixo:\n 1- Cadastrar passageiro \n 2- Check IN \n 3- Cancelar Voo \n 4- Sair");
			opcao = ler.nextInt();
		
			switch(opcao){   
		
			//Declarações case   
			case 1: 
        	
        	System.out.print ("Você Escolheu a opção 1- Cadastrar Passageiro \n");
    		System.out.print ("Cadastro de passageiro\n");
    		System.out.print ("Opção 1 (Exercício)\n");
    		System.out.print ("Nome: ");
    		nome = ler.nextLine();
    		System.out.print ("CPF: (Informe apenas os números)");
    		CPF = entrada.nextLong();
    		System.out.print ("Número do VOO");
    		data = ler.nextLine();
            System.out.print ("\nCadastro efetuado com sucesso:\n");
           break;   
           
			case 2: 
        
        System.out.print ("Você Escolheu a opção 2- Fazer Check-in \n");
		System.out.print ("CPF: (Informe apenas os números)");
		CPF = entrada.nextLong();
		System.out.print ("Informe o Número do VOO\n");
		voo = ler.nextInt();
		System.out.print ("Informe o Número do da poltrona desejada");
		poltrona = ler.nextInt();
		
			while ( tab[poltrona] != 0 ) {
				System.out.print ("Informe o Número do da poltrona desejada");
				poltrona = ler.nextInt();
			}
			
				if (tab[poltrona] == 0) {
					
					tab[poltrona] =1;
					System.out.print ("Check In efetuado com sucesso");
				}
			
           break;   
           
        case 3: 
        
        System.out.print ("Você Escolheu a opção 3- Cancelar VOO \n");
		System.out.print ("CPF: (Informe apenas os números)");
		CPF = entrada.nextLong();
		System.out.print ("Informe o Número do VOO\n");
		voo = ler.nextInt();
		System.out.print ("Informe o Número do da poltrona reservada");
		poltrona = ler.nextInt();
        
		tab[poltrona] = 0;
				
		System.out.print ("“Voo<número>\r\n" +voo+ "cancelado para o CPF " +CPF);
		poltrona = ler.nextInt();
		
           break;   
          
         //Declaração default case  
           
        case 4: System.out.println("SAIR");   
           break;  
  
        
         default:System.out.println("Opção Escolhida Não Existe");   
		}
    }   
		
	}

}