package juego;

import java.awt.Color;

import entorno.Entorno;

public class Computadora {	
	private Double x;
	private Double y;
	private int ancho;
	private int alto;
	
	public Computadora(Double x, Double y, int ancho, int alto) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
	}
	
	public void dibujar(Entorno entorno) {
		// TODO Auto-generated method stub
		entorno.dibujarRectangulo(this.x, this.y, this.ancho, this.alto, 0, Color.RED);
	}
		
	public void moverseArriba()
	{
		this.y -= 2;
	}
	
	public void moverseIzquierda() {
		this.x -= 2;
	}
	
	public void moverseDerecha() {
		this.x += 2;
	}
	
	public void moverseAbajo() {
		this.y += 2;
	}
	
	 
	 public Double getX() {
		 return this.x;
	 }
	 
	 public Double getY() {
		 return this.y;
	
	 }
	 
	 public int getAlto() {
		 return this.alto;
	 }
	 
	 public int getAncho() {
		 return this.ancho;
		 
	 }

}