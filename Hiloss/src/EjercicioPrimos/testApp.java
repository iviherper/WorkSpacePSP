package EjercicioPrimos;

import java.util.Scanner;

public class testApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el numero del hilo 1");
		int num1 = Integer.parseInt(in.nextLine());
		System.out.println("Introduce el numero del hilo 2");
		int num2 = Integer.parseInt(in.nextLine());
		System.out.println("Introduce el numero del hilo 3");
		int num3 = Integer.parseInt(in.nextLine());
		
		HiloPrimo hilo1 = new HiloPrimo(num1);
		HiloPrimo hilo2 = new HiloPrimo(num2);
		HiloPrimo hilo3 = new HiloPrimo(num3);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
	}
}
