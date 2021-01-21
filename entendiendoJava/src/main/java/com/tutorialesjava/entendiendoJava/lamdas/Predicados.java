package com.tutorialesjava.entendiendoJava.lamdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

public class Predicados {
	public static void main(String[] args) {
		List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("Números pares:");
		evaluar(listaNumeros, (n) -> n % 2 == 0);

		System.out.println("Números impares:");
		evaluar(listaNumeros, (n) -> n % 2 == 1);

		System.out.println("Números mayores a 5:");
		evaluar(listaNumeros, (n) -> n > 5);

		Function<String, Integer> tamanioCadena = str -> str.length();
		String cadena = "Lambdas tipo funciones";
		System.out.println("Número de caracteres es : " + tamanioCadena.apply(cadena));

		Supplier<String> cadena1 = () -> "Ejemplo de Proveedor";
		System.out.println(cadena1.get());

		Supplier<Persona> supplier = Predicados::llenarPersona;
		// obtiene desde el proveedor la persona y la asigna a per
		Persona per = supplier.get();
		// imprime el nombre
		System.out.println(per.getNombre());

		Consumer<Persona> persona = (p) -> System.out.println("Hola, " + p.getNombre());
		persona.accept(new Persona("Jorge", "Valladares", "Quito"));
	}

	public static void evaluar(List<Integer> listaNumeros, Predicate<Integer> predicado) {
		for (Integer n : listaNumeros) {
			if (predicado.test(n)) {
				System.out.print(n + " ");
			}
		}
		System.out.println();
	}

	// asigna los nombres y dirección a la persona
	public static Persona llenarPersona() {
		return new Persona("Pablo", "Andrade", "Loja");
	}
}
