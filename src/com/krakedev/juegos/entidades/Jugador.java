package com.krakedev.juegos.entidades;

import java.util.ArrayList;

public class Jugador {

	private String nickName;
	private ArrayList<Carta> cartas = new ArrayList<Carta>();
	private int puntajeCartas;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	// Agrega una carta a las cartas del jugador
	public void recibirCarta(Carta carta) {

		cartas.add(carta);
	}

	// Muestra el jugador y sus cartas
	public void imprimir() {

		System.out.println("Jugador: " + nickName);

		for (Carta carta : cartas) {
			carta.imprimir();
		}
		// Muestra el puntaje acumulado
		System.out.println("Puntaje: " + puntajeCartas);

	}

	public int getPuntajeCartas() {
		return puntajeCartas;
	}

	public void setPuntajeCartas(int puntajeCartas) {
		this.puntajeCartas = puntajeCartas;
	}

}
