package matriz5x5;
import java.util.*;

class Matriz{
	private int tama�o,tama�o2;
	private int [][]matrix;
	
	public Matriz(){
		matrix=new int [5][5];
	}
	public void generaMatriz(){
	Random Aleatorio = new Random ();
	
	tama�o=Aleatorio.nextInt();
	tama�o2=Aleatorio.nextInt();
	System.out.println(matrix[tama�o][tama�o2]);
	
		
	}
		
		
	
	
}






public class Matriz5x5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matriz miMatriz = new Matriz ();
		
		miMatriz.generaMatriz();
		
		
	}

}
