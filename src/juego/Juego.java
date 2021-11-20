package juego;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;

	// Variables y métodos propios de cada grupo
	Barbariana barbariana;
	Computadora computadora;

	Piso[] pisos;
	Velociraptor[] velociraptors;

	Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Barbariana Vikinga - Grupo 5-Maciel,Aibar;Iguiny... - v1", 800, 600);

		// Inicializar lo que haga falta para el juego
		barbariana = new Barbariana(400, 550, 50, 20, "abajo");
		this.computadora = new Computadora(200, 60, 50, 50);

		this.pisos = new Piso[] { new Piso(600, 200, 500, 10), new Piso(100, 300, 650, 10), new Piso(300, 500, 600, 10),
				new Piso(500, 400, 700, 10), new Piso(100, 100, 680, 10) };

		this.velociraptors = new Velociraptor[] { new Velociraptor(400, 180, 50, 20),
				new Velociraptor(100, 300, 50, 20) };

		// Inicia el juego!
		this.entorno.iniciar();
	}

	@SuppressWarnings("unused")
	public static void main(final String[] args) {
		Juego juego = new Juego();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y por lo
	 * tanto es el método más importante de esta clase. Aquí se debe actualizar el
	 * estado interno del juego para simular el paso del tiempo (ver el enunciado
	 * del TP para mayor detalle).
	 */
	@Override
	public void tick() {
		// Procesamiento de un instante de tiempo
		dibujarElementos();

		// MOVER BARBARIANA
		moverPersonaje();

	}

	private void moverPersonaje() {


		if (this.entorno.estaPresionada(this.entorno.TECLA_IZQUIERDA) && this.barbariana.getX() > 15) {
			this.barbariana.setDireccion("izquierda");
			barbariana.moverIzquierda();
		}
		if (this.entorno.estaPresionada(this.entorno.TECLA_DERECHA) && this.barbariana.getX() < 800 - 15) {
			this.barbariana.setDireccion("derecha");
			barbariana.moverDerecha();
		}
		if (this.entorno.estaPresionada(this.entorno.TECLA_ABAJO) && this.barbariana.getY() < 600) {
			this.barbariana.setDireccion("abajo");
			barbariana.moverAbajo();
		}

		if(!this.barbariana.colisiona(pisos) && this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA)){
			this.barbariana.setDireccion("arriba");
			barbariana.moverArriba();
		}
		else if(this.barbariana.getY() < 600){
			this.barbariana.setDireccion("abajo");
			barbariana.caer();
		}


	}

	private void dibujarElementos() {
		// dibujo la barbariana
		barbariana.dibujarse(entorno);

		// dibujo los pisos
		for (int p = 0; p < pisos.length; p++) {
			pisos[p].dibujarse(entorno);
		}

		// dibujo los velociraptors
		for (int v = 0; v < velociraptors.length; v++) {
			velociraptors[v].dibujar(entorno);
		}

		// dibujo la computadora
		this.computadora.dibujar(entorno);

	}

}