package ejercicio8Array;

import java.util.*;

class Asignatura{
	Scanner teclado = new Scanner (System.in);
	private int [][]aluasi;
	private int rangoP, rangoN, opcion, opcion2;
	private float media, almacen;
	private String asignatura;
	private String alumno;
	
	
	public Asignatura(){
		aluasi=new int [10][10];
		rangoP=10;
		rangoN=1;
		almacen=0F;
		opcion=0;
		opcion2=0;
		asignatura="Asignatura";
		alumno="Alumno";
		media=0F;
	}
	
	public void generaMatriz(int opcion){
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
		System.out.println("¿De qué desea calcular la media?\n1. Asignatura\n2. Alumno");
		opcion=teclado.nextInt();
		if (opcion==1){
			System.out.println("¿que numero de "+asignatura+" desea calcular?");
			opcion2=teclado.nextInt();
			for (int i=opcion2-1; i==opcion2-1;i++){
				System.out.println("numeros: ");
				for (int j=0;j<aluasi.length;j++){
					System.out.print(aluasi[i][j]+" ");
					almacen+=aluasi[i][j];
					System.out.println(almacen);
				}
				System.out.println();
				media=almacen/aluasi.length;
			}
			System.out.println("la media es: "+media);
		}
		else if (opcion==2){

			System.out.println("¿que numero de "+alumno+" desea calcular?");
			opcion2=teclado.nextInt();
			for (int j=opcion2-1;j==opcion2-1;j++){
				System.out.println("numeros: ");
				for (int i=0; i<aluasi.length;i++){
					System.out.print(aluasi[j][i]+" ");
					almacen+=aluasi[j][i];
				}
				System.out.println();
				media=almacen/aluasi.length;
			}
			System.out.println("la media es: "+media);
		}
		
		else 
			System.out.println("Error de parametros introducidos");
			return;


	}
	
}

public class Ejercicio8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		Asignatura miArray=new Asignatura();
		int opcion=0;
		int numero=0;
		
		miArray.generaMatriz(numero);
		miArray.calculaMedia(numero, opcion);
		
	}

}
