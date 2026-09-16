package com.krakedev.juegos.test;

import java.util.ArrayList;

import com.krakedev.juegos.entidades.Jugador;
import com.krakedev.juegos.servicios.Juego21;

public class TestJuego21 {

	public static void main(String[] args) {

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

		// Repartimos la primera carta
		juego.repartirRonda();

		// Repartimos la segunda carta
		juego.repartirRonda();

		jugador1.imprimir();
		jugador2.imprimir();
		jugador3.imprimir();

		System.out.println("Cartas restantes: " + juego.getDealer().getNaipe().size());

		// Asignamos puntajes para probar el ganador
		jugador1.setPuntajeCartas(21);
		jugador2.setPuntajeCartas(15);
		jugador3.setPuntajeCartas(21);

		ArrayList<Jugador> ganadores = juego.validarGanador();

		System.out.println("Cantidad de ganadores: " + ganadores.size());

		for (Jugador ganador : ganadores) {
			System.out.println("Ganador: " + ganador.getNickName());
		}
		
		System.out.println("\n--- PRUEBA JUGAR ---");

		Juego21 juego2 = new Juego21();

		juego2.inicializar();

		Jugador jugador4 = new Jugador();
		jugador4.setNickName("Jugador1");

		Jugador jugador5 = new Jugador();
		jugador5.setNickName("Jugador2");

		Jugador jugador6 = new Jugador();
		jugador6.setNickName("Jugador3");

		juego2.agregarJugador(jugador4);
		juego2.agregarJugador(jugador5);
		juego2.agregarJugador(jugador6);

		ArrayList<Jugador> ganadoresJuego = juego2.jugar();

		System.out.println("Cantidad de ganadores: " + ganadoresJuego.size());

		for (Jugador ganador : ganadoresJuego) {
			System.out.println("Ganador: " + ganador.getNickName());
		}
		
	}
	
	

}