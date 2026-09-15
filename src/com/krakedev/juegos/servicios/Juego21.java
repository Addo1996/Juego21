package com.krakedev.juegos.servicios;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class Juego21 {

	private ArrayList<Jugador> jugadores;
	private Dealer dealer;

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	// Asigna el valor de juego a cada carta
	public void cargarValores() {

		for (Carta carta : dealer.getNaipe()) {

			String valor = carta.getValor();

			if (valor.equals("A")) {
				carta.setValorJuego(11);

			} else if (valor.equals("J") || valor.equals("Q") || valor.equals("K")) {
				carta.setValorJuego(10);

			} else {
				carta.setValorJuego(Integer.parseInt(valor));
			}
		}
	}

	// Inicializa el juego
	public void inicializar() {

		dealer = new Dealer();

		jugadores = new ArrayList<Jugador>();

		cargarValores();

	}
	
	// Agrega un jugador al juego
	public void agregarJugador(Jugador jugador) {

		jugadores.add(jugador);

	}
	
	// Entrega una carta del Dealer al jugador
	public void repartirCarta(Jugador jugador) {

		Carta carta = dealer.entregarCarta();

		jugador.recibirCarta(carta);

	}

}
