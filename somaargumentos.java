import java.util.Scanner;

public class somaargumentos {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
          int x = 6;
          int y = 12;
          int z = 24;
		
          System.out.println("A soma é"+ Somar(x, y, z));
		
		Mensagem();
		
		
		leia.close();
     
 
	}
     static int Somar( int x, int y, int z) {
    	 return x + y + z;
     }
     static void Mensagem() {
    	 System.out.println("Imprima isso aqui");
     }
}
