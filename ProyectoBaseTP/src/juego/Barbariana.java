package juego;

import java.awt.Color;
import java.awt.Image;

import entorno.Entorno;
import entorno.Herramientas;

public class Barbariana {
	private double x;
	private double y;
	private double ancho;
	private double alto;
	private double angulo;
	private Color color;
	private static Image img1;
	private int rayo;
	
	
	public Barbariana(Entorno entorno, double x, double y, double ancho, double alto, double angulo, Color color, int rayo) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.angulo = angulo;
		this.color = color;
		this.dibujarImagen(entorno);
		this.rayo = rayo;
	
	}
	
	public static void dibujarse(Entorno entorno) {
		entorno.dibujarImagen(img1, 50, 50, 0.3);
	}

	public void moverDerecha() {
		this.x += 1;
		
	}

	public void moverIzquierda() {
		// TODO Auto-generated method stub
		this.x -= 1;
	}
	
	public void moverArriba() {
		this.y -= 1;
	}
	
	public void moverAbajo() {
		this.y += 1;
	}
	
	public void MoverAdelante() {
		
		this.x += Math.cos(this.angulo)*2;
		
		if(this.x > 850) {
			this.x=-50;
		}
		
		if(this.x < -50) {
			this.x=850;
		}
		
		this.y += Math.cos(this.angulo) *2;
		
		if(this.y > 650) {
			this.y=-50;
		}
		
		if(this.y<-50) {
			this.y=650;
		}
	}
	
	public int getRayo() {
		return rayo;
	}
	public void setRayo(int rayo) {
		this.rayo = rayo;
	}
	public void dibujarImagen(Entorno entorno) {
		this.x=450;
		this.y=250;
		this.ancho = 30;
		this.alto = 30;
		this.angulo=0;

		Image im = Herramientas.cargarImagen("C:\\Users\\Usuario\\Pictures\\juegoBarbariana\\Barbariana.png");
	 	entorno.dibujarImagen(im, this.x, this.y, this.angulo, 0.05);
	}

	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public double getAngulo() {
		return angulo;
	}
	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	public Color getColor() {
		return color;
	}

	public Image getImg1() {
		return img1;
	}
	public void setImg1(Image img1) {
		Barbariana.img1 = img1;
	}

	public Rayo dispararRayo() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean barbarianaTocoCastilloPedido(Castillo pisos, Entorno entorno) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean TieneComputadora() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setColor(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
}
