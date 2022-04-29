import java.util.Scanner;

public class somaargumentospositivonegativo {

	public static void main(String[] args) {
	       Scanner leia = new Scanner(System.in);
	
	   int numero = -20;
	   
			   
    System.out.println(POuN(numero));
	
	leia.close();

	}
     static char POuN(int x) {
    	if(x > 0) {
    		return 'P';
    	}else {
    		return 'N';
    	}
     }
}
