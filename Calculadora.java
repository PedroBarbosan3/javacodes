package school;
import java.lang.Math;



public class Calculadora {
	
	int number1;
	int number2;
	char op;
	
	void somar() {
		System.out.printf("%d",number1 + number2); 
	} 
	void subtrair() { 
		System.out.printf("%d",number1 - number2);
	} 
	void multiplicar() { 
		System.out.printf("%d",number1*number2);
	} 
	public void dividir() { 
		System.out.printf("%d",number1/number2);
	} 
	public void evelarAPotencia() { 
		System.out.printf("%.1f\n",Math.pow(number1,number2));
	}

}