package ejercicio8Array;

import java.util.Random;

class Asignatura{
	private int [][]aluasi;
	private int [] notas;
	private int rangoP, rangoN, almacen;
	
	
	public Asignatura(){
		aluasi=new int [10][10];
		notas=new int [10];
		rangoP=10;
		rangoN=1;
		almacen=0;
	}
	
	public void generaMatriz(){
		Random aleatorio=new Random ();
		for (int i=0; i<aluasi.length;i++){
			for (int j=0;j<aluasi.length;j++){
				aluasi[i][j]=(i+1);
				notas[j]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
				almacen+=notas[j];
			}
		}
	}
}

public class Ejercicio8Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asignatura miArray=new Asignatura();
		
		miArray.generaMatriz();
	}

}
