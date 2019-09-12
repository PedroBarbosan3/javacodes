package school;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;


public class Comparador {
	int n1[] = new int[8];
	int maior1=0;
	int maior2=0;
	void numeros() {
		Scanner input = new Scanner(System.in);
		for(int i=0;i < 8;i++) {
			System.out.printf("digite o " + (i+1) + " numero: ");
			n1[i]=input.nextInt();
			if(maior1 < n1[i]) {
				maior1 = n1[i];
			}
			if((maior2 < n1[i]) && (n1[i] !=maior1)) {
				maior2 = n1[i];
			}
		}
		for(int i=0;i < 8;i++) {
		System.out.printf("%d ",n1[i]);}

System.out.printf("o maior é: %d e o segundo maior é: %d",maior1,maior2);
	}
}