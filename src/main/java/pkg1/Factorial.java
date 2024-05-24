package pkg1;

public class Factorial {
	
	//imported from Rekha
	//this line is contributed by Shiva
	
public int fact(int num) {
		
		if(num<0) {
			
			throw new ArithmeticException();
			
		}
		
		
	int factorial = 1;	

	for (int i = 2; i <= num; i++) {

		factorial = factorial * i;
	}

    return factorial;
	
}

}
