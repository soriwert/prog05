package ejercicio5Array;
import java.util.*;

class Array{
	private int rangoP, rangoN, almacen, contador;
	private int []vector5;
	private int []vector6;
	
	public Array(){
		vector5=new int [10];
		vector6=new int [10];
		rangoN=1;
		rangoP=5;
		almacen=0;
		contador=0;
	}
	
	public void imprimeVector(){
		Random aleatorio = new Random();
		for (int i=0; i<vector5.length;i++){
			vector5[i]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
			System.out.print(vector5[i]+" ");
		}
		System.out.println();
		for (int j=0; j<vector6.length;j++){
			vector6[j]=aleatorio.nextInt(rangoP-rangoN+1)+rangoN;
			System.out.print(vector6[j]+" ");
		}
		System.out.println();
		
	}
	
	public void compruebaVector(){
		

			for (int i=0; i<vector5.length;i++){
				
				for (int j=0; j<vector6.length;j++){
					
					if(vector5[i]==vector6[j]){
							contador++;
					}

				}
				System.out.println("Elemento "+(i+1)+" : " + contador + " veces");
				contador=0;
			}

			
		}

	}





public class Ejercicio5Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array miArray = new Array();
		
		miArray.imprimeVector();
		miArray.compruebaVector();
		
		
	}

}
