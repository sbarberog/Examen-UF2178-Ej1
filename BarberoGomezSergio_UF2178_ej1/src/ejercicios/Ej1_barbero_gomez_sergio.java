package ejercicios;

import java.util.Scanner;

public class Ej1_barbero_gomez_sergio {

	public static void main(String[] args) {
		// Calcula el índice de masa corporal e indica su diagnóstico.
		
		double peso,altura;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("***Cálculo del IMC***");
		System.out.println("Introduce el peso (en kilogramos): ");
		peso=teclado.nextDouble();
		while (peso<0) {
			System.err.println("Peso incorrecto, debe ser > 0.");
			System.out.println("Introduce el peso (en kilogramos): ");
			peso=teclado.nextDouble();
		}
		
		System.out.println("Introduce la altura (en metros): ");
		altura=teclado.nextDouble();
		while (altura<0) {
			System.err.println("Altura incorrecta, debe ser > 0.");
			System.out.println("Introduce la altura (en metros): ");
			altura=teclado.nextDouble();
		}
		
		double imc=peso/Math.pow(altura, 2);
		
		if (imc<18.5) {
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f"
					+ " y tiene un diagnóstico de: Bajo peso",peso,altura,imc);
		} else if (imc>=18.5 && imc<25) {
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f"
					+ " y tiene un diagnóstico de: Peso normal (saludable)",peso,altura,imc);
		} else if (imc>=25 && imc<30) {
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f"
					+ " y tiene un diagnóstico de: Sobrepeso",peso,altura,imc);
		} else if (imc>=30 && imc<=40) {
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f"
					+ " y tiene un diagnóstico de: Obesidad premórbida",peso,altura,imc);
		} else {
			System.out.printf("El paciente de %.2f kg y %.2f m de altura tiene un IMC de %.2f"
					+ " y tiene un diagnóstico de: Obesidad mórbida",peso,altura,imc);
		}
		
		teclado.close();
	}

}
