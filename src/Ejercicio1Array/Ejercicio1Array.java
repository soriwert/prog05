package Ejercicio1Array;
import java.util.*;

class Array{
	private int valorIni=10;
	private int valorFin=-10;
	private int []vector;
	private int media=0;


public Array (){
	this.valorIni=valorIni;
	this.valorFin=valorFin;
	
}


public void estableceVector(){
	Random Aleatorio = new Random();
	vector = new int [20];

	for(int i=0; i<vector.length; i++){
		vector[i]=Aleatorio.nextInt(valorFin-valorIni+1)+valorIni;
		System.out.println(vector[i]);
	}
}
public void calculaMedia(){
	int suma=0;
	for(int i=0; i<vector.length; i++){
		suma=vector.length+suma;
		
		
	}
}




}



public class Ejercicio1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array miArray = new Array();
		
		miArray.estableceVector();
		
	/*	System.out.println("");
		miArray.estableceVector();*/
	
		

	}

}
