package ejercicio3Array;
import java.util.*;

class Array3{
	private int[] vector1;
	private int almacenMayor, almacenMenor, posicionMenor, posicionMayor;
	private int a,b;
	

	public Array3(){
		vector1=new int [20];
		a=100;
		b=-100;
		
	}

	public void valoresVector(){
		Random aleatorio = new Random ();

		for(int i=0; i<vector1.length;i++){
			vector1[i]=aleatorio.nextInt(a-b+1)+b;
			System.out.print(vector1[i]+" ");
		}
	}

	public void buscaMayor(){
		for (int i=0; i<vector1.length;i++){
			for (int j=0; j<vector1.length;j++){
				if(vector1[i]>vector1[j]){
					almacenMayor=vector1[i];
					posicionMayor=(i+1);
				}
			}
		} System.out.println("El número mayor es: "+almacenMayor+" y está en la posición: "+posicionMayor);
	}
	public void buscaMenor(){
		for (int i=0; i<vector1.length;i++){
			for (int j=0; j<vector1.length;j++){
				if(vector1[i]<vector1[j]){
					almacenMenor=vector1[i];
					posicionMenor=(i+1);
				}
			}
		} System.out.println("El número menor es: "+almacenMenor+" y está en la posición: "+posicionMenor);
	}

}

public class Ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 miArray = new Array3 ();
		
		// leyendo valores del vector.
		System.out.println("Vector 1: ");
		miArray.valoresVector();
		miArray.buscaMayor();
		miArray.buscaMenor();
		
	}

}
