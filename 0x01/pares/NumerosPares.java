public class NumerosPares{
	public static void main(String [] args){
		for (int num = 0; num < 98; num++){
			if (num%2 == 0){
				System.out.print(num + ", ");
			}
			if (num == 96){
				System.out.println(num+2);
			}
		}

	}
}
