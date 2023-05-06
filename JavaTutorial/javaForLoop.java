class forLoop{
	public static void main(String []args){
		int suma=0;
		for(int i=0;i<10;i++){
			suma+=i;
		}	
		System.out.println("La suma de 0-9 es: "+suma);
		
		int [] distancias={100,10,345,678,123,345,123};
			int contador=0;
			for(int i:distancias){
				contador++;
				System.out.println("La distancia "+contador+" es: "+ i);}
	}

}
