package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {

		Juego21 juego = new Juego21();

		// Inicializamos el juego
		juego.inicializar();

		Jugador jugador = new Jugador();
		jugador.setNickName("Jugador1");

		juego.agregarJugador(jugador);

		// Repartimos una carta al jugador
		juego.repartirCarta(jugador);

		jugador.imprimir();

		System.out.println("Cartas del mazo: " + juego.getDealer().getNaipe().size());
	}

}