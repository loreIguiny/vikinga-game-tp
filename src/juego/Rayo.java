package juego;

import entorno.Entorno;
//import entorno.Herramientas;

	 import java.awt.*;

	 public class Rayo{
	     private double x;
	     private double y;
	     private String direccion ;
	  //   private final Image image;

	     public Rayo(double x, double y) {
	         this.x = x;
	         this.y = y;
	        // this.direccion=direccion;
	         //this.image = Herramientas.cargarImagen("Barbariana.png");
	     }

	     public void dibujar(Entorno entorno) {
	         //entorno.dibujarImagen(image,x,y,0,0.1);

	     }
	     public String getDireccion() {
	        return direccion;
	     }


	     public void setDireccion(String direccion) {
	     this.direccion = direccion;
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

	 }
	
