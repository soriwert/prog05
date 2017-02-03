package Ejercicio1Array;
import java.util.*;

class Array{
	private int valorIni, valorFin, media, numSup, numInf, numIgu;
	private int []vector;
	
	

	public Array (){
		this.valorIni=-10;
		this.valorFin=10;
		this.media=0;
		this.numSup=0;
		this.numInf=0;
		this.numIgu=0;

	}


	public void estableceVector(){
		Random Aleatorio = new Random();
		vector = new int [20];

		for(int i=0; i<vector.length; i++){
			vector[i]=Aleatorio.nextInt(valorFin-valorIni+1)+valorIni;
			media+=vector[i];
			System.out.print(vector[i]+" ");
		}
	}
	public int dimeMedia(){

		return media;
	}
	
	public void numeros(){
		for(int i=0; i<vector.length; i++){
			
		
			if (vector[i]<media)
				numInf++;
			else if (vector[i]==media)
				numIgu++;
			else
				numSup++;
		}
	}
	
	public int NumSup(){
		return numSup;
	}
	public int NumInf(){
		return numInf;
	}
	public int NumIgu(){
		return numIgu;
	}




}



public class Ejercicio1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array miArray = new Array();
		
		System.out.println("El vector es: ");
		miArray.estableceVector();
		System.out.println("media: "+miArray.dimeMedia());
		miArray.numeros();
		System.out.println("Números superiores a la media: "+miArray.NumSup());
		System.out.println("Números iguales a la media: "+miArray.NumIgu());
		System.out.println("Números inferiores a la media: "+miArray.NumInf());
		



	}

}
