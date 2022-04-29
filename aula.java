import java.util.Locale;
import java.util.Scanner;
public class aula {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");
		
		 int  x = 10;
		 int y = 12;
		System.out.println("A soma foi"+ Somar(x, y));
		
		Mensagem();
	
	leia.close();
	
	}
	static int Somar(int a, int b) {
	return a + b;
	}
		static void Mensagem() {
		System.out.println("Imprima isso aqui");
	System.out.println(Somar (2, 4));
	}
}    
