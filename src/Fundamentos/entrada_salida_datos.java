package Fundamentos;

import java.util.Scanner;

public class entrada_salida_datos {
	private void psvm() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero para la obtenci�n de datos");
        Scanner scanner = new Scanner(System.in);
        float numero;
        numero = scanner.nextFloat();

        System.out.println("Digite un caracter");
        char caracter;
        caracter = scanner.next().charAt(0);

        System.out.println("El numero es : " + numero);
        System.out.println("La cadena en la pocis��n es : " + caracter);

	}
}
