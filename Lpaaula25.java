package LPAlore;
import java.util.Scanner;
public class Lpaaula25 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		System.out.println("Mostre o valor da repetição: ");
		int in = ler.nextInt();
		
		for(int i=0; i<=in; i++) {
			if(i%2!=0) {
				System.out.println("Os números ímpares são: "+i);
			}
		}
		ler.close();
	}
}
