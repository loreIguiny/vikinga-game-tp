package juego;

import java.awt.Image;
import java.awt.Rectangle;

import entorno.Entorno;
import entorno.Herramientas;

public class Rayo{
    private double x;
    private double y;
    private double velocidad = 5.9;
    private final Image image;

    public Rayo(double x, double y) {
        this.x = x;
        this.y = y;
        this.image = Herramientas.cargarImagen("C:\\Users\\Usuario\\Pictures\\juegoBarbariana\\rayo.png");
    }

    public void dibujar(Entorno entorno) {
        entorno.dibujarImagen(image,x,y,0,0.1);

    }

    public void avanzar(){
        this.x = this.x + velocidad;
    }

    public boolean colision(Rectangle objeto) {
        return objeto.intersects(getBordes());
    }
    public Rectangle getBordes() {
        return new Rectangle((int)x,(int)y,10,20);
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

	public int getAncho() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void moverseDerecha() {
		// TODO Auto-generated method stub
		this.x+=5;
	}

	public void moverseArriba() {
		// TODO Auto-generated method stub
		this.y+=5;
	}

	public void moverseAbajo() {
		// TODO Auto-generated method stub
		this.y-=5;
	}

	public void moverseIzquierda() {
		// TODO Auto-generated method stub
		this.x-=5;
	}



	

}

