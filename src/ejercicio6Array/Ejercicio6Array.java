package ejercicio6Array;
import java.util.*;

class matriz10x10 {
	private int rangoP, rangoN, almacen;
	private int [][]matrix2;

	public matriz10x10(){
		rangoP=5;
		rangoN=-5;
		matrix2=new int[10][10];
		almacen=0;
	}

		public void generaMatriz(){
			Random aleatorio = new Random();
			for (int i=0; i<matrix2.length;i++){
				for (int j=0; j<matrix2.length;j++){
				matrix2[i][j]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
				System.out.print(matrix2[i][j]+" ");
				almacen+=matrix2[i][j];
				}
				System.out.println(" suma fila "+(i+1)+": "+almacen+" ");
			}
		}
}



public class Ejercicio6Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		matriz10x10 miArray = new matriz10x10();
		
		miArray.generaMatriz();
	}

}
