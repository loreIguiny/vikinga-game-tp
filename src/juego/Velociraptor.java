package juego;

import java.awt.Color;
	//import java.awt.Image;
	import entorno.Entorno;
	//import entorno.Herramientas;

	public final class Velociraptor {
	  private int x;
	  private int y;
	  private int alto;
	  private int ancho;
	  //private Image imagen;
	  private int velocidad;

	  public Velociraptor (int x, int y, int alto, int ancho) 
	  {
	    this.x = x;
	    this.y = y;
	    this.alto = alto;
	    this.ancho = ancho;
	    //this.imagen = Herramientas.cargarImagen("Imagenen//Velociraptor.png");
	    //this.velocidad = 0;
	  }

	  public void dibujar(Entorno entorno) 
	  {
	    entorno.dibujarCirculo(x, y, alto,Color.CYAN);
	  }

	  public void mover() 
	  {
	    this.x -= 2- velocidad;
	  }

	  public int getX() 
	  {
	    return x;
	  }

	  public int getY() 
	  {
	    return y;
	  }

	  public int getAlto() 
	  {
	    return alto;
	  }

	  public int getAncho() 
	  {
	    return ancho;
	  }

	  public void setX(int x) 
	  {
	    this.x = x;
	  }
	  
	  public void setV(int x) 
	  {
	    this.velocidad = x;
	  }

	}

