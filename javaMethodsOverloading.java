import java.util.Scanner;
class methodsOverloading{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese double ");
		double a=sc.nextDouble();
		System.out.println("Ingrese double");
		double b=sc.nextDouble();
		double r1=retorno(a,b);
		System.out.println(r1);
		System.out.println("Ingrese dos numeros para multiplicar");
		int numero1=sc.nextInt();
		int numero2=sc.nextInt();
		int r2=retorno(numero1,numero2);
		System.out.println(r2);
	}
	static double retorno(double a, double b){
		return a/b;
	}
	static int retorno(int a, int b){
		return a*b;
	}
}
