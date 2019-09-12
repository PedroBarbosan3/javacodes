package school;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Questão_1 {
	public static void main(String[] args) throws IOException {
		Calculadora cal = new Calculadora();
		Scanner input= new Scanner(System.in);
		System.out.printf("informe o primeiro número: ");
		cal.number1 = input.nextInt();
		System.out.printf("informe o segundo número: ");
		cal.number2 = input.nextInt();
		System.out.printf("informe qual operação será: \n");
	
	 System.out.printf("digite + para somar \n");
	 System.out.printf("digite * paramultiplicar \n"); 
	 System.out.printf("digite - para subtrair \n");
	 System.out.printf("digite / para dividir \n"); 
	 System.out.printf("digite ^ para exponencial \n");

		cal.op = (char)System.in.read();
	 if(cal.op == '+') {
		cal.somar();
		
	 } 
	 if(cal.op  == '*') { 
		cal.multiplicar();

	 } 
	 if(cal.op  == '-') {
	  cal.subtrair();
	 
	 } 
	 if(cal.op  == '/') {
	  cal.dividir();
	 
	 } 
	 if(cal.op  == '^') {
		cal.evelarAPotencia();
		
	 }
 
}
}
