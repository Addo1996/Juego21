package com.krakedev.juegos.test;

import com.krakedev.juegos.servicios.Dealer;

public class TestAleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dealer dealer = new Dealer();

		int maximo = 10;
		boolean encontroCero = false;
		boolean encontroMaximo = false;

		for (int i = 0; i < 100; i++) {

			int numero = dealer.generarAleatoreo(maximo);
			System.out.println(numero);

			if (numero == 0) {
				encontroCero = true;
			}

			if (numero == maximo) {
				encontroMaximo = true;
			}

			if (numero > maximo) {
				System.out.println("ERROR: El número supera el máximo");
			}

		}
		
		System.out.println("Salió 0: " + encontroCero);
		System.out.println("Salió " + maximo + ": " + encontroMaximo);

	}
}
