package questao4;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		
		int segundos;
		int resto, minutos, segundoscalc;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite um valor em segundos");
		segundos = ler.nextInt();
		
		
		
		resto = segundos % 3600;
		minutos = resto/60;
		segundoscalc = resto/60;
		
		System.out.println(segundos/3600 + "h" + minutos + "m" + segundoscalc + "s");
		

	}

}
