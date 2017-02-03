package ejercicio2Array;
import java.util.*;

class Array{
	
	private int []vector1;
	private int []vector2;
	private int []vector3;
	private int almacen;
	
	
	public Array(){
		this.vector1=vector1=new int[10];
		this.vector2=vector2=new int[10];
		this.vector3=vector3=new int[10];
		this.almacen=almacen;
	}
	
	public void dimeVector1(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Vector1: ");
		for (int i=0; i<vector1.length;i++){
			System.out.println("Establece valor a la posición: "+(i+1));
			vector1[i]=teclado.nextInt();
		}
	}
	
	public void dimeVector2(){
		Scanner teclado= new Scanner(System.in);
		System.out.println("Vector2: ");
		for (int i=0; i<vector2.length;i++){
			System.out.println("Establece valor a la posición: "+(i+1));
			vector2[i]=teclado.nextInt();
		}
	}
	
	public void sumaVectores(){
		for (int i=0; i<vector1.length;i++){
			vector3[i]=vector1[i]+vector2[i];
		}
		for (int i=0;i<vector3.length;i++){
		System.out.print(vector3[i]+" ");
		}
		System.out.println();
	}
	
	public void ordenaVector3(){
		for (int i=0;i<vector3.length;i++){
			for (int j=i;j<vector3.length;j++){
				if(vector3[j]>vector3[i]){
					almacen=vector3[i];
					vector3[i]=vector3[j];
					vector3[j]=almacen;
				}
			}
		}
	}
	
	public void vectorOrdenado(){
		for (int i=0;i<vector3.length;i++){
			System.out.print(vector3[i]+" ");
		}
		System.out.println();
	}
	

	
}


public class Ejercicio2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Array miArray = new Array ();
		
		miArray.dimeVector1();
		miArray.dimeVector2();
		System.out.println("La suma de vectores es: ");
		miArray.sumaVectores();
		System.out.println("El vector 3 ordenado es: ");
		miArray.ordenaVector3();
		miArray.vectorOrdenado();
		
	}

}
