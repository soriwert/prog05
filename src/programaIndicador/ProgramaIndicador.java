package programaIndicador;

import java.util.*;

class Indicador {

	private int velocidad, pantallaHora, posicionAguja;

	Indicador(){

		velocidad=0;

		pantallaHora=0;

	}

	public int getvelocidadInicial(){

		return velocidad;

	}

	public void setcambioVelocidad(int velocidad){

		this.velocidad=velocidad;

	}

}

public class ProgramaIndicador{

	public static void main (String[] args){

		Scanner teclado = new Scanner (System.in);

		Indicador estadoInicial = new Indicador();

		System.out.println("La velocidad inicial del indicador es: " +

		estadoInicial.getvelocidadInicial());

		Indicador estadoEnMarcha = new Indicador();

		int nuevaVelocidad;

		System.out.println("Escriba la nueva velocidad del indicador ");

		estadoEnMarcha.setcambioVelocidad(teclado.nextInt());

	}

}