package juego;

import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Velociraptor {  
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private Image imagen;
	
	public Velociraptor(int x, int y, int ancho, int alto) {  //constructor	
		this.x= x;
		this.y= y;
		this.ancho= ancho;
		this.alto= alto;
		this.imagen = Herramientas.cargarImagen("C:\\Users\\Usuario\\Pictures\\juegoBarbariana\\velociraptor.png");
		}
	

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


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}

	
//METODO DIBUJARSE
	public void dibujarse(Entorno entorno) 
	{  
		entorno.dibujarImagen (imagen, this.x, this.y, 0,0.2);
		}
	
	
	
// METODOS MOVER
	public void moverIzquierda() {
		this.x= this.x-2;
	}
	
	public void moverDerecha() {
		this.x= this.x+2;
	}
	public void moverArriba() {
		this.y= this.y-2;
	}
	
	public void moverAbajo() {
		this.y= this.y+2;
	}


	public void dibujarse1(Entorno entorno) 
	{  
		entorno.dibujarImagen (imagen, this.x, this.y, 0,0.2);
		
		
	}


	public void caminaSube() {
		// TODO Auto-generated method stub
		
	}


	public void caminaBaja() {
		// TODO Auto-generated method stub
		
	}


	public void caminaAtras() {
		// TODO Auto-generated method stub
		
	}



		
	

}
