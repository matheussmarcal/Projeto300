package questao10;

import java.util.Scanner;

public class anos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int ano;
		
		System.out.println("Digite um ano que deseja consultar");
		ano = ler.nextInt();
		
		if (( ano%4==0 && ano%100!=0) || (ano%400 ==0))
			System.out.println("Esse ano � bissexto.");
		
		else
			System.out.println("Esse ano n�o � bissexto");
		

	}

}
