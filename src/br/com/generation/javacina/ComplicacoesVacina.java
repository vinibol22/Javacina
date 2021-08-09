package br.com.generation.javacina;

public class ComplicacoesVacina  {
private int complicav;
private String laudo;

public String getLaudo() {
	return laudo;
}

public void setLaudo(String laudo) {
	this.laudo = laudo;
	
	if(laudo!="sim") {
		System.out.println("Infelizmente voce não pode tomar a vacina");
	}
	
}

public int getComplicavacia() {
	return complicav;
}



public void setComplicavacia(int complicav) {
this.complicav = complicav;
	
	if(complicav==1 || complicav==2) {
		System.out.println("Voce tem algum laudo medico confirmando a sua possibilidade de se vacinar?  ");
	}
	
	
}

}
