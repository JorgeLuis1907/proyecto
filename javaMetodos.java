import java.util.Scanner;
class methods{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int [] listaNotas = new int[4];
		for(int i=0;i<4;i++){
			System.out.println("Ingrese la nota "+(i+1));
			listaNotas[i]=sc.nextInt();
		}
		System.out.println("El promedio de estas 4 notas es: "+promedio(listaNotas));
	}
	public static double promedio(int [] a){
		return (a[0]+a[1]+a[2]+a[3])/4.0;
	}
}
