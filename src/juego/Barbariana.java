package juego;

import java.awt.Color;

import entorno.Entorno;

public class Barbariana {

	private int x;
	private int y;
	private int alto;
	private int ancho;
	private String direccion;
	// private Image imagen;

	// private boolean morir;

	public Barbariana(int x, int y, int alto, int ancho, String direccion) { // constructor
		this.x = x;
		this.y = y;
		this.alto = alto;
		this.ancho = ancho;
		this.direccion = direccion;
		// this.imagen = Herramientas.cargarImagen("Imagen//Barbariana.jpg");

	}

	// ******* METODOS ********//

	// DIBUJARSE
	public void dibujarse(Entorno entorno) { // parametro entorno
		entorno.dibujarCirculo(x, y, alto, Color.white);
		// entorno.dibujarImagen (imagen, this.x, this.y, 0,0.03);
	}

	// MOVERSE
	public void moverIzquierda() {
		this.x = this.x - 5;
	}

	public void moverDerecha() {
		this.x = this.x + 5;
	}

	public void moverArriba() {
		this.y = this.y - 5;
	}

	public void moverAbajo() {
		this.y = this.y + 5;
	}

	public void caer() {
		this.y = this.y + 5;
	}

	// DISPARAR RAYO
	// Rayo Lanzar() {
	// return new Rayo(this.x, this.y, 5,this.direccion);

	// }

	// getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean colisiona(Piso[] pisos) {

		for (int i = 0; i < pisos.length; i++) {
			if ((this.y + this.alto / 2 > pisos[i].getY() - pisos[i].getAlto() / 2)
					&& (this.x + this.ancho / 2 > pisos[i].getX() - pisos[i].getAncho() / 2)
					&& (this.y - this.alto / 2 < pisos[i].getY() + pisos[i].getAlto() / 2)
					&& (this.x - this.ancho / 2 < pisos[i].getX() + pisos[i].getAncho() / 2)) {
				return true;
			}

		}

		return false;
	}


	/*
	 * public Image getImagen() { return imagen; }
	 */

	/*
	 * public void setImagen(Image imagen) { this.imagen = imagen; }
	 */

}
