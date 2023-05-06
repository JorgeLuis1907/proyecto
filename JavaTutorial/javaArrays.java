import java.util.Scanner;
class arrays{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		String [] listaNombres=new String [10];
		for(int i=0;i<10;i++){
			listaNombres[i]="Soldado"+i;
		}
		System.out.println("Lista de soldados");
		for(String i:listaNombres){
			System.out.println(i);
		}

		System.out.println("MATRIZ 5x5");
		int [][] matriz=new int [5][5];
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.println("Ingrese el numero de la posicion: "+i+" "+j);
				matriz[i][j]=sc.nextInt();
			}

		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matriz[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
