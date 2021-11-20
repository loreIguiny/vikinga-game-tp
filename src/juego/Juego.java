package juego;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego {
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;

	// Variables y métodos propios de cada grupo
	Barbariana barbariana;
	Piso piso1;
	Piso piso2;
	Piso piso3;
	Piso piso4;
	Piso piso5;
	Piso[] pisos = new Piso[5];
	Computadora computadora;
	Velociraptor velociraptor;

	Juego() {
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "Barbariana Vikinga - Grupo 5-Maciel,Aibar;Iguiny... - v1", 800, 600);

		// Inicializar lo que haga falta para el juego
		barbariana = new Barbariana(400, 550, 50, 20, "abajo");

		// Inicia el juego!
		this.entorno.iniciar();

		{
			this.piso1 = new Piso(600, 200, 500, 10);
			this.piso2 = new Piso(100, 300, 650, 10);
			this.piso3 = new Piso(300, 500, 600, 10);
			this.piso4 = new Piso(500, 400, 700, 10);
			this.piso5 = new Piso(100, 100, 680, 10);

			pisos[0] = piso1;
			pisos[1] = piso2;
			pisos[2] = piso3;
			pisos[3] = piso4;
			pisos[4] = piso5;

			this.computadora = new Computadora(200, 60, 50, 50);
			this.velociraptor = new Velociraptor(400, 180, 50, 20);
		}
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
		if (this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA) && this.barbariana.getX() > 15) {
			this.barbariana.setDireccion("arriba");
			barbariana.moverArriba();
		}
		if (this.entorno.estaPresionada(this.entorno.TECLA_ABAJO) && this.barbariana.getY() < 600) {
			this.barbariana.setDireccion("abajo");
			barbariana.moverAbajo();
		}
		if (!this.entorno.estaPresionada(this.entorno.TECLA_ARRIBA) && this.barbariana.getY() < 550
				&& !this.barbariana.colisiona(pisos)) {

			barbariana.caer();
		}
	}

	private void dibujarElementos() {
		barbariana.dibujarse(entorno);

		this.piso1.dibujarse(entorno);
		this.piso2.dibujarse(entorno);
		this.piso3.dibujarse(entorno);
		this.piso4.dibujarse(entorno);
		this.piso5.dibujarse(entorno);

		this.computadora.dibujar(entorno);

		this.velociraptor.dibujar(entorno);
	}


}