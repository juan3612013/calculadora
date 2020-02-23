/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author Juan Antonio
 * @version 1.0 20/02/2020
 * 
 */
import java.util.Scanner;

/**
 *
 * @author juann
 */
public class Calculadora1{

    /**
     *
     * @param args
     */
    public static void main(String[] args){
            /**
            * Metodo que a partir de If genera una calculadora simple
            * @param suma: Suma los dos números
            * @return: Devuelve la suma los dos números.
            * @param resta: Resta los dos números
            * @return: Devuelve la resta de los dos números.
            * @param multiplicacion: Multiplica los dos números
            * @return: Devuelve la multiplicacion los dos números.
            * @param division: Division los dos números
            * @return: Devuelve la division los dos números
            */

		Scanner input = new Scanner(System.in);

		System.out.println("Calculadora v.1.1\n-----------------------");

		System.out.println("Introduce el primer número: ");
		double num1= input.nextDouble(); //Entrada del primer número

		System.out.println("Introduce el segundo número:");
		double num2= input.nextDouble(); //Entrada del segundo número

		System.out.println("\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n0. Salir");
		int op=input.nextInt();
		
		double suma=num1+num2; //Realiza la suma
		double resta=num1-num2; //Realiza la resta
		double multiplicacion=num1*num2; //Realiza la multiplicacion
		double division=num1/num2; //Realiza la division

			if (op==0){
				System.out.println("Vuelva pronto.");
			}
			if (op==1){
				System.out.println("El resultado es: "+suma);
			}
			if (op==2){
				System.out.println("El resultado es: "+resta);
			}
			if (op==3){
				System.out.println("El resultado es: "+multiplicacion);
			}
			if (op==4){
				if (num2==0){
					System.out.println("El resultado es: infinito (Cualquier número entre 0 es infinito)");
				}
				else{
					System.out.println("El resultado es: "+division);
				}
			}

	}
}
