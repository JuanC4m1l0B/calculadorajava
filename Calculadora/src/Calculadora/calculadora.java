//Ejercicio Individual 15 Juan Barrientos

package Calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número");
		int numero1 = scanner.nextInt();
		
		System.out.println("Ingrese el segundo número");
		int numero2 = scanner.nextInt();
		
		System.out.print("Ingrese la operacion a realizar (+, -, x, :, /): ");
		String signo = scanner.next();
		
		int resultado = 0;

        if (signo.equals("+")) {
            resultado = numero1 + numero2;
        } 
        else if (signo.equals("-")) {
            resultado = numero1 - numero2;
        } 
        else if (signo.equals("x")) {
            resultado = numero1 * numero2;
        } 
        else if (signo.equals(":")) {
            resultado = numero1 / numero2;
        } 
        else if (signo.equals("/")) {
            resultado = numero1 % numero2;
        } 
        else {
            System.out.println("Operación inválida");
        }

        System.out.println("El resultado es: " + resultado);

        scanner.close();
	}

}
