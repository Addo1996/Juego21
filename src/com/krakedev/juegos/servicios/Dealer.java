package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;

public class Dealer {

	private ArrayList<Carta> naipe;

	public Dealer() {
		naipe = new ArrayList<Carta>();
		// Generamos el mazo al crear el Dealer
		generarNaipe();
	}

	public ArrayList<Carta> getNaipe() {
		return naipe;
	}

	public void setNaipe(ArrayList<Carta> naipe) {
		this.naipe = naipe;
	}

	// Genera las 52 cartas del mazo
	public void generarNaipe() {

		// Valores posibles de una carta
		String[] valores = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		// Palos del mazo
		String[] palos = { "T", "CN", "CR", "D" };

		for (int i = 0; i < valores.length; i++) {

			for (int j = 0; j < palos.length; j++) {

				Carta carta = new Carta();

				carta.setValor(valores[i]);
				carta.setPalo(palos[j]);

				naipe.add(carta);
			}
		}

	}

	// Imprime todas las cartas del mazo
	public void imprimirNaipe() {

		for (Carta carta : naipe) {
			carta.imprimir();
		}

	}

}