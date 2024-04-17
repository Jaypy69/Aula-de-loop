package LPAlore;

import java.util.Scanner;

public class Lpaaula23 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String n;
		
		for(int i=0;i <=5; i++) {
			System.out.println("Qual é seu nome?");
			n = ler.next();
			System.out.println("Seu nome é "+ n);
		}
		ler.close();
	}

}
