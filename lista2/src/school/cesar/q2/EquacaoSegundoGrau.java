package school.cesar.q2;
import java.util.Scanner;

public class EquacaoSegundoGrau {
    double a;
    double b;
    double c;
    double Raizes;
    double x1; //valor positivo
    double x2; //valor negativo
    Scanner input = new Scanner(System.in);
    public void receber(double a,double b,double c){
        System.out.println("digite o valor de a:");
        this.a = input.nextDouble();
        System.out.println("digite o valor de b:");
        this.b = input.nextDouble();
        System.out.println("digite o valor de c:");
        this.c = input.nextDouble();
    }

    public double getRaizes() {
        return Raizes;
    }
    public void setRaizes(double x1,double x2){
        if(this.a == 0){
            System.out.println("VALOR DE A É 0");
        }else {
            double delta;
            delta = Math.pow(this.b, 2) - ((4 * this.a) * this.c);
            System.out.print("valor de delta: ");
            System.out.printf("%.0f\n", delta);
            if(delta>=0){
                this.x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
                this.x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
            }else{
                System.out.println("DELTA MENOR QUE 0");
            }
        }

    }

    public String toString() {
        return "a = " + this.a +", b = " + this.b +", c = " + this.c +", raiz1: " + this.x1 +", raiz2: " + this.x2;
    }

    public boolean equals(EquacaoSegundoGrau eq2) {
        if(eq2 == null){
            return false;
        }
        if(this.a == eq2.a && this.b == eq2.b && this.c ==eq2.c && this.x1 == eq2.x1 && this.x2 == eq2.x2){
            return true;
        }
        return false;
    }
    public int hashCode() {
        return 1000;
    }
    public static void main(String[] args) {
        EquacaoSegundoGrau eq1 = new EquacaoSegundoGrau();
        eq1.receber(eq1.a,eq1.b,eq1.c);
        eq1.setRaizes(eq1.x1,eq1.x2);
        eq1.getRaizes();
        System.out.println(eq1);
        System.out.print("\n");
        EquacaoSegundoGrau eq2 = new EquacaoSegundoGrau();
        eq2.receber(eq2.a,eq2.b,eq2.c);
        eq2.setRaizes(eq2.x1,eq2.x2);
        System.out.println(eq2);
        System.out.println(eq1.equals(eq2));
        System.out.println(eq1.hashCode());
        System.out.println(eq2.hashCode());

    }
}
