package ejercicio3Array;
import java.util.*;

class Array3{
	private int[] vector1;
	private int mayor, menor, posMenor, posMayor, tamaño, rangoP, rangoN;
//	private int mitad;


	public Array3(){
		mayor=0;
		menor=0;
		posMenor=0;
		posMayor=0;
		tamaño=0;
//		mitad=tamaño;

	}
	
	public void dimeTamaño(int tamaño){
		vector1 = new int[tamaño];
		this.tamaño=tamaño;
//		mitad=tamaño;
	}
	
	public void dimeRango (int rangoN, int rangoP){
		this.rangoP=rangoP;
		this.rangoN=rangoN;
	}

	public void imprimeVector(){
		Random aleatorio = new Random ();
		for(int i=0; i<vector1.length;i++){
			vector1[i]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
			System.out.print(vector1[i]+" ");
//			if ((i+1)==(mitad/2)){
//				System.out.println();
//			}
			if (vector1[i]>mayor){
				mayor=vector1[i];
				posMayor=(i+1);
			}
			else
			{
				if (vector1[i]<menor){
					menor=vector1[i];
					posMenor=(i+1);
				}
			} 
		}
		System.out.println();
	}
	
	public void ImprimeMayorYMenor(){
		System.out.println("El valor mayor es: "+mayor+" y su posicion es: "+posMayor);
		System.out.println("El valor menor es: "+menor+" y su posicion es: "+posMenor);
	}
}

public class Ejercicio3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array3 miArray = new Array3 ();
		Scanner teclado = new Scanner (System.in);
		
		
		// leyendo valores del vector.
		System.out.println("Establece el tamaño del vector: ");
		miArray.dimeTamaño(teclado.nextInt());
		System.out.println("Establece el rango NEGATIVO y POSITIVO");
		miArray.dimeRango(teclado.nextInt(),teclado.nextInt());
		System.out.println("Vector 1: ");
		miArray.imprimeVector();
		miArray.ImprimeMayorYMenor();
	}

}
