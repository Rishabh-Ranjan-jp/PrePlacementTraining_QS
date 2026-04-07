class dowhile1{
	public static void main(String[] args){
		int i = 0;
		System.out.println("Printing 5 starts: ");
		do{
			System.out.println("*");
			i++;
		}while(i<5);
		System.out.println("Printing number 1 through 5: ");
		i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i<6);
	}
}
