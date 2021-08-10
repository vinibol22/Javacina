package br.com.generation.javacina;

import java.util.Scanner;



		public class Javacina extends ComplicacoesVacina {

	

		public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int idade,comorbidade,sexo,complicav=0,laudo;
		String nome,simounao="";
			
			Calendario calend=new Calendario(); 
			Comorbidade comor=new Comorbidade();
			ComplicacoesVacina complica=new ComplicacoesVacina();
			
			
			
			
			System.out.println("Por favor insira seu nome");
			nome=entrada.next();
			while(nome.length()<=2) {
			System.out.println("Nome incorreto , digite novamente");
			nome=entrada.next();
			
			}
			
			System.out.println("Digite sua idade : ");
			idade=entrada.nextInt();
			while(idade<0 ||idade>130) {
				System.out.println("idade incorreta , digite-a novamente");
				idade=entrada.nextInt();
			}
				if(idade>=80) {
					
					calend.setIdade(idade);
					return ;
				}
				if(idade<18) {
					calend.setIdade(idade);
					return;
				}
				
				/*
				System.out.println("Digite seu sexo ");
				System.out.println("1-Para Masculino ");
				System.out.println("2-Para Feminino ");
				System.out.println("3-Para outro");
				sexo=entrada.nextInt();
				while(sexo<1 || sexo>3) {
					System.out.println("Sexo inválido, digite-o novamente");
					sexo=entrada.nextInt();
				}*/
			
				
				System.out.println("Digite o número caso tenha alguma dessas comorbidades : ");
				System.out.println();
				System.out.println("1-Obesidade grau 3"+"\n"+"2-Diabetes"+"\n"+"3-Doença do coração "+"\n"+"4-Doença respiratória "+"\n"+"5-Caso tenha nehuma dessa opções");
				comorbidade=entrada.nextInt();
			
				if(comorbidade==1||comorbidade==2||comorbidade==3||comorbidade==4) {
					comor.setComorbidade(comorbidade);
				
					return;
				
					}	
				while(comorbidade<1 ||comorbidade>5) {
						System.out.println("Comorbidade inválida ,digite-o novamente");
						comorbidade=entrada.nextInt();
				}
				
				System.out.println("Digite o número respectivo de sua complicação médica");
				System.out.println();
				System.out.println("1-Voce toma algum remédio anticoagulante "+"\n"+"2-Voce tem alergia a algum componente da vacina"+"\n"+"3-nehuma das opções ");
				complicav=entrada.nextInt();
				
				if(complicav== 3) {
					calend.setIdade(idade);
					return;
				};
				
				complica.setComplicavacia(complicav);
				laudo=entrada.nextInt();
				while(laudo>2 ||laudo<1) {
					complica.setComplicavacia(complicav);
					laudo=entrada.nextInt();
				}
				
				
				if(laudo==1) {
					calend.setIdade(idade);
					return;
				}
			
				if(laudo==2) {
					System.out.println("Infelizmente voce não pode tomar a vacina");
				}
				
				
			//complica.setComplicavacia(complicav);
			//laudo=entrada.next();
			
			//complica.setLaudo(laudo);
		
	
		
				
		
		
		
		
		
		
		
		
			
		}
		
		
	}


