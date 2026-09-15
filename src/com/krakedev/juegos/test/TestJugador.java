package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;
import com.krakedev.juegos.entidades.Jugador;

public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador = new Jugador();
		
		jugador.setNickName("Jugador 1");
		
		Carta carta = new Carta();
		carta.setValor("A");
		carta.setPalo("T");
		
		// Entregamos una carta al jugador
		jugador.recibirCarta(carta);
		
		jugador.imprimir();
	}

}
