package br.com.generation.javacina;



public class Calendario {

		private int idade;
		public String nome;

		public int getIdade() {
			return idade;
		}

		public int setIdade(int idade) {
			this.idade = idade;
			
			if(idade>=80) {
				System.out.println("Seu dia de vacinação será de amanhã e irá até o dia 20 deste mes");
				
			}
			
			if(idade>=70 && idade<80) {
				System.out.println("Seu dia de vacinação será do dia 21 até o dia 28 de agosto");	
				
			}
			if(idade>=60 && idade<70) {
				System.out.println("Seu dia de vacinação será do dia 29 de agosto até o dia 12 de setembro");	
				
			}
			if(idade>=50 && idade<60) {
				System.out.println("Seu dia de vacinação será do dia 13 de setembro até o dia 27");	
				
			}
			if(idade>=40 && idade<50) {
				System.out.println("Seu dia de vacinação será do dia 28 de setembro até o dia 12 de outubro");	
				
			}
			if(idade>=30 && idade<40) {
				System.out.println("Seu dia de vacinação será do dia 13 de outrubro até o dia 26");	
				
			}
			if(idade>=18 && idade<29) {
				System.out.println("Seu dia de vacinação será do dia 27 de outubro até o dia 10 de novembro");	
				
			}
			if(idade<18) {
				System.out.println("Ainda não chegou seu momento de se vacinar");
			}
			
			return idade;
		}

}
