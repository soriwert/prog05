package matriz5x5;
import java.util.*;

class Matriz{
	private int positivo,negativo, tamaño, mayor, posMayorj,posMayori, menor, posMenori, posMenorj;
	private int [][]matrix;

	public Matriz(){
		positivo=100;
		negativo=-100;
		tamaño=5;
		mayor=0;
		posMayorj=0;
		posMayori=0;
		menor=0;
		posMenorj=0;
		posMenori=0;
		matrix=new int [tamaño][tamaño];
	}
	public void generaMatriz(){
		Random Aleatorio = new Random ();
		for (int i=0; i<matrix.length;i++){
			for (int j=0; j<matrix.length;j++){
				matrix[i][j]=Aleatorio.nextInt(positivo-negativo+1)+negativo;
				System.out.print(matrix[i][j] +" ");
				if (menor>matrix[i][j]){
					menor=matrix[i][j];
					posMenorj=(j+1);
					posMenori=(i+1);
				}
				else
				{
					if (mayor<matrix[i][j]){
						mayor=matrix[i][j];
						posMayorj=(j+1);
						posMayori=(i+1);
					}
				}
			}
			System.out.println();
		}
	}
	
	public void imprimeMatrix(){
		System.out.println("El valor mayor es: "+mayor+" y su posicion (i,j) es: ("+posMayori+","+posMayorj+")");
		System.out.println("El valor menor es: "+menor+" y su posicion (i,j) es: ("+posMenori+","+posMenorj+")");
	}
}


public class Matriz5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz miMatriz = new Matriz ();
		
		miMatriz.generaMatriz();
		miMatriz.imprimeMatrix();
		
	}

}
