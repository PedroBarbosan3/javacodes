package school;
import java.util.Scanner;


public class ComparadorDeStrings {
	String a;
	String b;
	String reversea="";
	void verificar() {
	for(int i = a.length()-1;i >= 0;i--) {
		reversea = reversea + a.charAt(i);
	}
	System.out.println(b.equalsIgnoreCase(reversea));
}
}
