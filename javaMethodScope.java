class methodScope{
	public static void main(String[]args){
		int x=10;
		System.out.println(x);
		x++;
		System.out.println(x);
		cambio(x);
		System.out.println(x);
		System.out.println(cambio(x));
	}
	public static int cambio(int x){
		return x*=10;
	}
}
