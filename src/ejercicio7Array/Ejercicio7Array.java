package ejercicio7Array;
import java.util.*;


class Matrix5x5b{
	Scanner teclado=new Scanner(System.in);
	private int [][]matrix;
	private int rangoP, rangoN, numero1, numero2;
	private boolean correcto;
	
	public Matrix5x5b(){
		
		matrix=new int [5][5];
		rangoP=10;
		rangoN=-10;
		correcto=true;
		
	}
	
	
	public void generaMatriz(){
		Random aleatorio = new Random ();
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix.length; j++){
				matrix[i][j]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
				System.out.print(matrix[i][j]+" ");
			} 
			System.out.println();
		}
	}

	public void dimeFila(){
		do{
			System.out.print("Numero 1: ");
			numero1=teclado.nextInt();
			System.out.print ("numero 2: ");
			numero2=teclado.nextInt();
		if (numero1<1 || numero1>5 || numero2<1 || numero2>5){
			System.out.println("Error Introduzca de nuevo los números");
			correcto = false;
		}
			correcto=true;
		}while(correcto == false);
	}
	
	public void intercambiarFilas(){
		int i=numero1-1;
		int k=numero2-1;
		int l=0;
		int almacen;
		for (int j=0; j<matrix.length;j++,l++){
			almacen=matrix[i][j];
			matrix[i][j]=matrix[k][l];
			matrix[k][l]=almacen;
			
			}
		}
	
	public void imprimeCambio(){
		for (int i=0; i<matrix.length; i++){
			for (int j=0; j<matrix.length; j++){
				System.out.print(matrix[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	
}


public class Ejercicio7Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix5x5b miArray = new Matrix5x5b ();
		
		miArray.generaMatriz();
		miArray.dimeFila();
		miArray.intercambiarFilas();
		miArray.imprimeCambio();
	}

}
