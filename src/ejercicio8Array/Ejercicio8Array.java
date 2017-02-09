package ejercicio8Array;

import java.util.*;

class Asignatura{
	private int [][]aluasi;
	private int [] notas;
	private int rangoP, rangoN, almacen, opcion, opcion2, media;
	
	
	public Asignatura(){
		aluasi=new int [10][10];
		rangoP=10;
		rangoN=1;
		almacen=0;
		opcion=0;
		opcion2=0;
	}
	
	public void generaMatriz(){
		Random aleatorio=new Random ();
		for (int i=0; i<aluasi.length;i++){
			System.out.println("Alumno "+(i+1));
			for (int j=0;j<aluasi.length;j++){
				aluasi[i][j]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
				System.out.println("Asignatura "+(j+1)+" --> "+aluasi[i][j] +" ");
			}
			System.out.println();
		}
	}

	public void calculaMedia(int opcion, int opcion2){
		this.opcion=opcion;
		this.opcion2=opcion2;
		if (opcion==1){
			for (int i=opcion2; i==opcion2;i++){
				for (int j=0;j<aluasi.length;j++){
					almacen+=aluasi[i][j];
				}
				media=almacen/aluasi.length;
			}
			System.out.println(media);
		}
		else if (opcion==2){
			for (int j=opcion2;j==opcion2;j++){
				for (int i=0; i<aluasi.length;i++){

					almacen+=aluasi[j][i];
				}
				media=almacen/aluasi.length;
			}
			System.out.println(media);
		}


	}
}

public class Ejercicio8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Asignatura miArray=new Asignatura();
		int opcion;
		int opcion2;
		String tipo1="Asignatura";
		String tipo2="Alumno";
		int numero;
		
		miArray.generaMatriz();
		System.out.println("¿De qué desea calcular la media?\n1. Asignatura\n2. Alumno");
		opcion=teclado.nextInt();
		if (opcion==1){
			System.out.println("¿que numero de "+tipo1+" desea calcular");
			numero=teclado.nextInt();
			miArray.calculaMedia(opcion, numero);
		}
		else if (opcion==2){
			System.out.println("¿que numero de "+tipo2+" desea calcular");
			numero=teclado.nextInt();
			miArray.calculaMedia(opcion, numero);
		}
		
		
	}

}
