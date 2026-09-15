package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.servicios.Dealer;

public class TestEntregarCarta {

	public static void main(String[] args) {

		Dealer dealer = new Dealer();

		System.out.println("Cartas antes: " + dealer.getNaipe().size());

		Carta carta = dealer.entregarCarta();

		// Mostramos la carta entregada
		carta.imprimir();

		System.out.println("Cartas despues: " + dealer.getNaipe().size());
	}

}