package UsoArrays;
import java.util.*;
public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		/*
		int [] miMatriz = new int [5];
		miMatriz[0]=10;
		miMatriz[1]=15;
		miMatriz[2]=20;
		miMatriz[3]=25;
		miMatriz[4]=30;

		
		System.out.println(miMatriz[0]);
		System.out.println(miMatriz[1]);
		System.out.println(miMatriz[2]);
		System.out.println(miMatriz[3]);
		System.out.println(miMatriz[4]);
		
		int [] miMatriz2 = {15, 25, 8, -7, 92};
		
		for (int i=0; i<5; i++){
			System.out.print("La posición: "+i+" Tiene el  numero: ");
			System.out.println(miMatriz[i]);
		}
			
		for (int i=0; i<5; i++){
			System.out.println(miMatriz[i]);
		}
		//Declaración de matriz
		String [] paises = new String [8];
		
		//Dar valores iniciales
		paises[0]="España";
		paises[1]="Mexico";
		paises[2]="Colombia";
		paises[3]="Peru";
		paises[4]="Chile";
		paises[5]="Argentina";
		paises[6]="Ecuador";
		paises[7]="Venezuela";
		
		//Declaración y dar valores a la matriz.
		String[] paises2 = {"España","Mexico", "Colombia","Peru","Chile","Argentina","Ecuador","Venezuela"};
		
		
		//Muestra los países de la matriz
		for (int i=0; i<paises.length;i++){
			System.out.println("País " + (i+1)+ " " + paises [i]);
		}
		//Bucle for each
		for (String elemento:paises){
			System.out.println("País: "+ elemento);
		}
		
		//Pide por teclado que rellene la matriz con países
		for (int i=0; i<paises2.length; i++){
			System.out.println("En la posición: "+(i+1)+" desea el país: ");
			paises2[i]=teclado.next();
			if (i+1==paises2.length){
				System.out.println(paises2[0]+""+paises2[1]+""+paises2[2]+""+paises2[3]+""+paises2[4]+""+paises2[5]+""+paises2[6]);
			}
		}
		*/
		
		/*Comprobamos la función de Math.random() para utilizarla en la matriz
		// al ser double... tenemos que convertirla en int.
		//Se multiplica por 100 porque si no, el resultado serían 0 y 1
		Ya que la función nos da valores double com 0,57...
		
		int x=0;
		double y=0.0;
		y=Math.random();
		x=(int)(Math.random()*100);
		System.out.println(""+x+" and "+y);
		*/
		
		/*
		//Crea una matriz de 150 números aleatorios.
		int [] matrizAleatorios= new int[150];
		for (int i=0;i<matrizAleatorios.length;i++){
			matrizAleatorios[i]=(int)(Math.random()*100);
		}
		for (int i=0; i<matrizAleatorios.length;i++){
			System.out.println("Posición: "+(i+1)+" Numero: "+matrizAleatorios[i]);
		}
		*/
		
		//int [][] matrix = new int [4][5];
		
		/*
		matrix [0][0]=10;
		matrix [0][1]=11;
		matrix [0][2]=12;
		matrix [0][3]=13;
		matrix [0][4]=14;
		
		matrix [1][0]=15;
		matrix [1][1]=16;
		matrix [1][2]=17;
		matrix [1][3]=18;
		matrix [1][4]=19;
		
		matrix [2][0]=20;
		matrix [2][1]=21;
		matrix [2][2]=22;
		matrix [2][3]=23;
		matrix [2][4]=24;
		
		matrix [3][0]=25;
		matrix [3][1]=1;
		matrix [3][2]=2;
		matrix [3][3]=3;
		matrix [3][4]=4;
		*/
		/*
		//Pide al usuario manualmente los valores de la posición.
		System.out.println("Introduce un valor: ");
		int valor=teclado.nextInt();
		System.out.println("Introduce un valor: ");
		int valor2=teclado.nextInt();
		System.out.println("El valor de la posición ["+valor+"] y ["+valor2+"] es: "+matrix[valor][valor2]);
		
		//extrae los valores del array bidimensional en forma de tabla.
		for (int i=0; i<4;i++){
			System.out.println();
			for (int j=0; j<5; j++){
				System.out.print(matrix[i][j]+" ");
			}
		}
		*/
		
		int matrix [][]={
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20}
				};
		for (int i=0; i<4;i++){
			System.out.println();
			for (int j=0; j<5; j++){
				System.out.print(matrix[i][j]+" ");
			}
		}
		for (int[]fila:matrix){
			System.out.println();
			for(int z:fila){
				System.out.print(z+" ");
			}
		}
		

	}

}