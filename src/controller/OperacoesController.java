package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public void Concatena100(){
//		criando vetor
		int vet1 [] = new int [100];
		
		int soma = 0;
		// coletando o tempo inicial do sistema 
		double tempoInicial = System.nanoTime();
		
		for(int i=0; i<100; i++){
			
			vet1[i]= 1; //1+(int)(Math.random()*9);
			soma += vet1[i];
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal/= Math.pow(10, 9);
		
		System.out.println("Tempo de calculo do vetor de 100 : " + tempoTotal +"s");
	}
	
	public void Concatena1000(){
//		criando vetor
		int vet1 [] = new int [1000];
		
		int soma = 0;
		// coletando o tempo inicial do sistema 
		double tempoInicial = System.nanoTime();
		
		for(int i=0; i<1000; i++){
			
			vet1[i]= 1; //1+(int)(Math.random()*9);
			soma += vet1[i];
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal/= Math.pow(10, 9);
		
		System.out.println("Tempo de calculo do vetor de 1000 levou: " + tempoTotal +"s");
	}
	
	public void Concatena10000(){
//		criando vetor
		int vet1 [] = new int [10000];
		
		int soma = 0;
		// coletando o tempo inicial do sistema 
		double tempoInicial = System.nanoTime();
		
		for(int i=0; i<10000; i++){
			
			vet1[i]= 1; //1+(int)(Math.random()*9);
			soma += vet1[i];
		}
		double tempoFinal = System.nanoTime();
		
		double tempoTotal = tempoFinal - tempoInicial;
		
		tempoTotal/= Math.pow(10, 9);
		
		System.out.println("Tempo de calculo do vetor de 10000 levou: " + tempoTotal +"s");
	}
}
