package juego;

import java.awt.Color;
//import java.awt.Image;
import entorno.Entorno;
//import entorno.Herramientas;

	public class Computadora  {
	  private double x;
	  private double y;
	  private double alto;
	  private double ancho;
	 // private Image imagen;

	  public Computadora (double x, double y, double alto, double ancho) 
	  {
	    this.x = x;
	    this.y = y;
	    this.alto = alto;
	    this.ancho = ancho;
	    //this.imagen = Herramientas.cargarImagen("");
	  }

	  public void dibujar(Entorno entorno) 
	  {
	    
	    entorno.dibujarRectangulo(this.x, this.y, this.alto, this.ancho,0, Color.blue);
	  }

	  public void mover() 
	  {
	    this.x -= 2.5;
	  }

	  public double getY() 
	  {
	    return y;
	  }

	  public void setX(int i) 
	  {
	    this.x = i;
	  }

	  public double getX() 
	  {
	    return x;
	  }

	  public double getAlto() 
	  {
	    return this.alto;
	  }

	  public double getAncho() 
	  {
	    return this.ancho;
	  }
	}

