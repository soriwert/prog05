package ejercicio3Array;
import java.util.*;

class Array3{
	private int[] vector1;
	private int almacenMayor=0, almacenMenor=0, posicionMenor=0, posicionMayor=0;
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
			if (vector1[i]>almacenMayor){
				almacenMayor=vector1[i];
				posicionMayor=(i+1);
			}
			else
			{
				if (vector1[i]<almacenMenor){
					almacenMenor=vector1[i];
					posicionMenor=(i+1);
				}
			} 
		}
		System.out.println();
	}
	
	public void ImprimeMayorYMenor(){
		System.out.println("El valor mayor es: "+almacenMayor+" y su posicion es: "+posicionMayor);
		System.out.println("El valor menor es: "+almacenMenor+" y su posicion es: "+posicionMenor);
	}
}

public class Ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 miArray = new Array3 ();
		
		// leyendo valores del vector.
		System.out.println("Vector 1: ");
		miArray.valoresVector();
		miArray.ImprimeMayorYMenor();
	}

}
