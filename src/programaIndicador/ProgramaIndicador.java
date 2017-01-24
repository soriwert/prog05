package programaIndicador;
import java.util.Scanner;

class MiIndicador{

	private int nivel, nivelIncre, nivelDecre;

	public MiIndicador (){
		nivel=10;
		nivelIncre+=nivel;
		nivelDecre-=nivel;
	}


	public int upNivel(int nivelIncre){
		
		this.nivelIncre=nivelIncre;
		nivelIncre+=nivel;
		return nivelIncre;
	}
	public int downNivel(int nivelDecre){
		this.nivelDecre=nivelDecre;
		nivelDecre=nivel-nivelDecre;
		return nivelDecre;
	}
	
	public void setNivel (int valor){
		this.nivel=valor;
	}
	public int dameNivel (){
		return nivel;
	}

	public int dameNivelIncre(int nivelIncre){
		this.nivelIncre=nivelIncre;
		return nivelIncre;
	}

}

public class ProgramaIndicador {

	public static void main(String[] args) {
		// Crearemos el menú opcion;
		Scanner teclado = new Scanner (System.in);

		MiIndicador indicador = new MiIndicador();

		int opcion,acumular=0,velocidadNueva=0, nulo=0,acumularDecre=0;
		
		System.out.println("El valor inicial del indicador es: "+
				indicador.dameNivel());

		do{
			System.out.println("          MENU          ");
			System.out.println("1. Establecer nivel");
			System.out.println("2. Incrementar");
			System.out.println("3. Decrementar");
			System.out.println("4. Ver Nivel actual");
			System.out.println("0. SALIR");
			System.out.println("Elija una opcion: ");
			opcion=teclado.nextInt();

			switch (opcion){
			case 1:
				System.out.println("Escriba la nueva velocidad");
				indicador.setNivel(velocidadNueva=teclado.nextInt());
				break;
			case 2:
				System.out.println("Cuanto desea incrementar? ");
				int incremento;
				indicador.upNivel(incremento=teclado.nextInt());
				acumular+=incremento;
				if (acumular<220){
				System.out.println("El marcador esta en: "+indicador.upNivel(acumular));
				}
				else
					System.out.println("PELIGRO ESTAS EXCEDIENDO LA VELOCIDAD DE 220: "+
				"El marcador esta en: "+ indicador.upNivel(acumular));
				break;
			case 3:
				System.out.println("Cuanto desea decrementar? ");
				int decremento;
				indicador.downNivel(decremento=teclado.nextInt());
				acumularDecre+=decremento;
				nulo=acumular+indicador.dameNivel()-acumularDecre;
				if (nulo<0){
					System.out.println("Lo maximo a decrementar es 0. No existen valores negativos");
					System.out.println("Su nuevo valor para el marcador comienza en "+indicador.dameNivel()+" (predeterminado) de nuevo.");
					acumular=0;
					acumularDecre=0;
					decremento=0;
				}
				else {
					System.out.println(nulo);
				}
				break;
				
			case 4:
				System.out.println("Su valor es: ");
				System.out.println(indicador.dameNivel()+velocidadNueva+acumular-acumularDecre);
				
				break;



			}

		} while (opcion!=0);



	}
}