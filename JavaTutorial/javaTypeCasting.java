class typeCasting{
	public static void main(String []args){
		int numeroInt=10;
		double numeroDouble=numeroInt;
		//Aqui se convirtio el numero entero en un double
		System.out.println(numeroDouble);
		double d2=15.9d;
		int i2=(int)d2;
		//Aqui se convirtio el numero double a uno entero, solo toma la parte entera
		System.out.println(i2);
	}
}
