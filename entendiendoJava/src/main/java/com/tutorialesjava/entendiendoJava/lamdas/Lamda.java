package com.tutorialesjava.entendiendoJava.lamdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lamda {

	public static void main(String[] args) {
		
		for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {
			System.out.print(numero + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("imprimir de la forma tradcional");
		System.out.println();
		List<Integer> arreglo = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// imprimir una lista utilizando expresiones lambda en Java 8
		System.out.println("imprimir una lista utilizando expresiones lambda en Java 8");
	
		arreglo.forEach(n -> System.out.print(n + " "));
		System.out.println();
		// otra forma utilizando expresiones Lambdas
		System.out.println("otra forma utilizando expresiones Lambdas");
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(System.out::println);
		System.out.println();
		 ArrayList<Integer> menor= new ArrayList<>();
		// filtrar los número mayores que 5 y añadirlos en la lista menor
		for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {
			if (numero > 5) {
				menor.add(numero);
			}
		}
		
		// imprimir la lista con los números mayores que 5
		System.out.println("imprimir la lista con los números mayores que 5");
		for (Integer integer : menor) {
			System.out.println(integer);
		}
		System.out.println();
		System.out.println("otra forma utilizando expresiones Lambdas y stream");
		
		ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				// se crea el stream
				.stream()
				//filtro para obtener los números mayores a 5 y dentro se utiliza la expresión lambda (x -> x > 5)
				.filter(x -> x > 5)
				//pone los elementos que se filtró dentro de una nueva lista, dentro se utiliza una expresión lambda  
				.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));
 
		mayores.forEach(e -> System.out.println(e));
	}
}
