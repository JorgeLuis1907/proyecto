class recursion{
	public static void main(String[]args){
		fibonachi(20);
	}
	public static void fibonachi(int i){
		int inicio=0;
		int siguiente=1;
		System.out.print(inicio+", ");
		while(siguiente<i){
			System.out.print(siguiente+", ");
			if(siguiente>0){
				siguiente=inicio+siguiente;
				inicio=siguiente-inicio;
			}else
				inicio++;
		}
	}
}
