package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {

//		Juego21 juego = new Juego21();
//
//		// Inicializamos el juego
//		juego.inicializar();
//
//		Jugador jugador = new Jugador();
//		jugador.setNickName("Jugador1");
//
//		juego.agregarJugador(jugador);
//
//		// Repartimos una carta al jugador
//		juego.repartirCarta(jugador);
//
//		jugador.imprimir();
//
//		System.out.println("Cartas del mazo: " + juego.getDealer().getNaipe().size());
		
		
		Juego21 juego = new Juego21();

		// Inicializamos el juego
		juego.inicializar();

		Jugador jugador1 = new Jugador();
		jugador1.setNickName("Jugador1");

		Jugador jugador2 = new Jugador();
		jugador2.setNickName("Jugador2");

		Jugador jugador3 = new Jugador();
		jugador3.setNickName("Jugador3");

		juego.agregarJugador(jugador1);
		juego.agregarJugador(jugador2);
		juego.agregarJugador(jugador3);

		// Repartimos una carta a cada jugador
		juego.repartirRonda();
		
		// Repartimos una segunda carta
		juego.repartirRonda();

		jugador1.imprimir();
		jugador2.imprimir();
		jugador3.imprimir();

		System.out.println("Cartas restantes: " + juego.getDealer().getNaipe().size());
	}

}