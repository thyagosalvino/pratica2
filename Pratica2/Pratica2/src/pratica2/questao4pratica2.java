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
			

			System.out.print ("Selecione uma das 3 o��es abaixo:\n 1- Cadastrar passageiro \n 2- Check IN \n 3- Cancelar Voo \n 4- Sair");
			opcao = ler.nextInt();
		
			switch(opcao){   
		
			//Declara��es case   
			case 1: 
        	
        	System.out.print ("Voc� Escolheu a op��o 1- Cadastrar Passageiro \n");
    		System.out.print ("Cadastro de passageiro\n");
    		System.out.print ("Op��o 1 (Exerc�cio)\n");
    		System.out.print ("Nome: ");
    		nome = ler.nextLine();
    		System.out.print ("CPF: (Informe apenas os n�meros)");
    		CPF = entrada.nextLong();
    		System.out.print ("N�mero do VOO");
    		data = ler.nextLine();
            System.out.print ("\nCadastro efetuado com sucesso:\n");
           break;   
           
			case 2: 
        
        System.out.print ("Voc� Escolheu a op��o 2- Fazer Check-in \n");
		System.out.print ("CPF: (Informe apenas os n�meros)");
		CPF = entrada.nextLong();
		System.out.print ("Informe o N�mero do VOO\n");
		voo = ler.nextInt();
		System.out.print ("Informe o N�mero do da poltrona desejada");
		poltrona = ler.nextInt();
		
			while ( tab[poltrona] != 0 ) {
				System.out.print ("Informe o N�mero do da poltrona desejada");
				poltrona = ler.nextInt();
			}
			
				if (tab[poltrona] == 0) {
					
					tab[poltrona] =1;
					System.out.print ("Check In efetuado com sucesso");
				}
			
           break;   
           
        case 3: 
        
        System.out.print ("Voc� Escolheu a op��o 3- Cancelar VOO \n");
		System.out.print ("CPF: (Informe apenas os n�meros)");
		CPF = entrada.nextLong();
		System.out.print ("Informe o N�mero do VOO\n");
		voo = ler.nextInt();
		System.out.print ("Informe o N�mero do da poltrona reservada");
		poltrona = ler.nextInt();
        
		tab[poltrona] = 0;
				
		System.out.print ("�Voo<n�mero>\r\n" +voo+ "cancelado para o CPF " +CPF);
		poltrona = ler.nextInt();
		
           break;   
          
         //Declara��o default case  
           
        case 4: System.out.println("SAIR");   
           break;  
  
        
         default:System.out.println("Op��o Escolhida N�o Existe");   
		}
    }   
		
	}

}