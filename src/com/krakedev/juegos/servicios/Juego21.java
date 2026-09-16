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

	// Reparte una carta a cada jugador
	public void repartirRonda() {

		for (Jugador jugador : jugadores) {
			repartirCarta(jugador);
		}
		calcularTotal();
	}

	// Calcula el puntaje de cada jugador
	public void calcularTotal() {

		for (Jugador jugador : jugadores) {

			int total = 0;

			for (Carta carta : jugador.getCartas()) {
				total = total + carta.getValorJuego();
			}

			jugador.setPuntajeCartas(total);
		}

	}
	
	// Busca jugadores con puntaje de 21
	public ArrayList<Jugador> validarGanador() {

		ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

		for (Jugador jugador : jugadores) {

			if (jugador.getPuntajeCartas() == 21) {
				ganadores.add(jugador);
			}
		}

		return ganadores;
	}
	
	// Ejecuta las rondas del juego
	public ArrayList<Jugador> jugar() {

		ArrayList<Jugador> ganadores = new ArrayList<Jugador>();

		for (int i = 0; i < 3; i++) {

			repartirRonda();

			ganadores = validarGanador();

			if (ganadores.size() > 0) {
				break;
			}
		}

		return ganadores;
	}

}
