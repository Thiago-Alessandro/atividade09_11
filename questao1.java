package atividade09_11;

import java.util.ArrayList;
import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		double salario =0, valorReajuste, contadorSalarios = 0;
		
		ArrayList<Double> salarios = new ArrayList<Double>();
		ArrayList<Double> salariosReajustados = new ArrayList<Double>();
		
		
		Scanner teclado = new Scanner(System.in);
			
		for (;salario != -1;salario=salario) {
		
			System.out.print("Insira um salário (para encerrar a entrada insira -1):");
			salario = teclado.nextDouble();
			
			if (salario != -1) {
				salarios.add(salario);
				contadorSalarios++;
			}
		}
		
		System.out.println("Insira o valor do reajuste (em %): ");
		valorReajuste = teclado.nextDouble();
		
		for(int contador = 0;contador < contadorSalarios;contador++) {
			
			salario = salarios.get(contador);
			salario = salario + salario*valorReajuste/100;
			salariosReajustados.add(salario);
		}
			System.out.println(salariosReajustados.toString());
	}

}
