package matriz5x5;
import java.util.*;

class Matriz{
	private int tamaño,tamaño2;
	private int [][]matrix;
	
	public Matriz(){
		matrix=new int [5][5];
	}
	public void generaMatriz(){
	Random Aleatorio = new Random ();
	
	tamaño=Aleatorio.nextInt();
	tamaño2=Aleatorio.nextInt();
	System.out.println(matrix[tamaño][tamaño2]);
	
		
	}
		
		
	
	
}






public class Matriz5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz miMatriz = new Matriz ();
		
		miMatriz.generaMatriz();
		
		
	}

}
