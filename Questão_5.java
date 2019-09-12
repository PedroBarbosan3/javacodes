package school;
import java.util.Scanner;

public class Questão_5 {
	public static void main(String[] args) {
		ComparadorDeStrings cds = new ComparadorDeStrings();
		Scanner input= new Scanner(System.in);
		System.out.printf("digite a primeira string: ");
		cds.a = input.nextLine();
		System.out.printf("digite a segunda string: ");
		cds.b = input.nextLine();
		cds.verificar();
	
	
	
	}
}
