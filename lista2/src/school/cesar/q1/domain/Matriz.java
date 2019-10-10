package school.cesar.q1.domain;
import java.util.Scanner;
import  school.cesar.q1.utils.Matrizes;

public class Matriz {
    Scanner input = new Scanner(System.in);
    int a;
    int b,c;
    int vector[][];
    int diagonal[];
    private void once(int a) {
        System.out.print("digite um número: ");
        this.a = input.nextInt();
    }
    private void matrizar1() {
        int i,j = 0;
        vector = new int[a][a];
        for(i = 0;i < this.a;i++) {
            for(j = 0;j < this.a;j++) {
                vector[i][j] = (int)(Math.random()*100);
            }
        }
        for(i = 0;i < this.a;i++) {
            for(j = 0;j < this.a;j++) {
                System.out.printf("%d ",vector[i][j]);
            }
            System.out.print("\n");
        }
    }
    public void twice(int b,int c) {
        System.out.print("digite o número de linhas: ");
        this.b = input.nextInt();
        System.out.print("digite o número de colunas: ");
        this.c = input.nextInt();
    }
    public void matrizar2() {
        int i,j;
        vector = new int[b][c];
        for(i = 0;i < this.b;i++) {
            for(j = 0;j < this.c;j++) {
                vector[i][j] = (int)(Math.random()*100);
            }
        }
        for(i = 0;i < this.b;i++) {
            for(j = 0;j < this.c;j++) {
                System.out.printf("%d ",vector[i][j]);
            }
            System.out.print("\n");
        }
    }
    public void checkD0nce() {
        int i, j;
        int check = this.a % 4;
        diagonal = new int[a];
        if (check == 0) {
            for (i = 0; i < this.a; i++) {
                for (j = 0; j < this.a; j++) {
                    if (i == j) {
                        diagonal[i] = vector[i][j];
                        System.out.printf("%d ", diagonal[i]);
                    }
                }
            }
        }
        else{
            System.out.println("Erro,matriz não quadrada");
            for(i = 0;i < this.a;i++){
                diagonal[i]=0;
                System.out.printf("%d ",diagonal[i]);
            }
        }
    }
    public void checkDTwice() {
        int i, j;
        int check1 = this.b % 4;
        int check2 = this.c % 4;
        diagonal = new int[b];
        if (check1 == 0 && check2 == 0) {
            for (i = 0; i < this.b; i++) {
                for (j = 0; j < this.b; j++) {
                    if (i == j) {
                        diagonal[i] = vector[i][j];
                        System.out.printf("%d ", diagonal[i]);
                    }
                }
            }
        }
        else{
            System.out.println("Erro,matriz não quadrada");
            for(i = 0;i < this.b;i++){
                diagonal[i]=0;
                System.out.printf("%d ",diagonal[i]);
            }
        }
    }
    public static void main(String[] args) {
        int i,j;
        Matriz ma1 = new Matriz();
        Matrizes mat = new Matrizes();
        ma1.once(ma1.a);
        System.out.println("Sua primeira matriz é:");
        ma1.matrizar1();
        System.out.println("a diagonal da primeira matriz é:");
        ma1.checkD0nce();
        mat.vector1 = new int[ma1.a][ma1.a];
        mat.a=ma1.a;
        for (i = 0; i < ma1.a;i++) {
            for (j = 0; j < ma1.a; j++) {
                mat.vector1[i][j] = ma1.vector[i][j];
            }}
        System.out.print("\n");
        Matriz ma2 = new Matriz();
        ma2.twice(ma2.b, ma2.c);
        System.out.println("Sua segunda matriz é:");
        ma2.matrizar2();
        System.out.println("a diagonal da segunda matriz é:");
        ma2.checkDTwice();
        mat.vector2 = new int[ma2.b][ma2.c];
        mat.b = ma2.b;
        mat.c = ma2.c;
        for (i = 0; i < ma2.b;i++) {
            for (j = 0; j < ma2.c; j++) {
                mat.vector2[i][j] = ma2.vector[i][j];
            }}
        System.out.print("\n");
        System.out.println("a multiplicação das duas matrizes é:");
        mat.multiplicar(mat.vector1,mat.vector2,mat.a,mat.b,mat.c);
    }
}
