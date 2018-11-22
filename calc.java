import java.util.Scanner;
class calc{
	public static void main(String[] args)
	{
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner key = new Scanner(System.in);

		System.out.println("a");
		int one = a.nextInt();
		System.out.println("b");
		int two = b.nextInt();
		System.out.println("p - плюс / m - минус / d - деление / ml - умножение \n");
		String pmdm = key.nextLine();
	 	
		switch(pmdm){
			case "p": 
				one+=two;
				break;
			case "m": 
				one-=two;
				break;
			case "d": 
				one/=two;
				break;
			case "ml":
				one*=two;
				break;
			default: 
				return; 
		}
	
		System.out.printf("\nUr answr is %d\n",one);
	
	}
}
