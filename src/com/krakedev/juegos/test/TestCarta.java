package com.krakedev.juegos.test;

import com.krakedev.juegos.entidades.Carta;

public class TestCarta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carta carta = new Carta();
		
		carta.setValor("A");
		carta.setPalo("T");
		carta.setValorJuego(11);
		
		carta.imprimir();

	}

}
