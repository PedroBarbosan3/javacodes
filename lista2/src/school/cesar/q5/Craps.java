package school.cesar.q5;
import java.util.Scanner;
import java.util.ArrayList;

public class Craps {
    int dado1[] = new int[30];
    int dado2[] = new int[30];
    int i = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> aux = new ArrayList();
        Craps cp = new Craps();
        aux.add(0);
        aux.add(0);
        aux.add(0);
        aux.add(0);
        int con;
        int plus;
        int pont = 0;
        int g = 0;
        while (cp.i <= 30) {
            if (cp.i == 30) {
//              System.out.print("seu número de jogadas: ");
//              System.out.printf("%d",cp.i);
//              System.out.print("\n");
                System.out.println("-- dado 1 --");
                for (int j = 0; j < cp.i; j++) {
                    System.out.printf("%d ", cp.dado1[j]);
                }
                System.out.print("\n");
                System.out.println("-- dado 2 --");
                for (int j = 0; j < cp.i; j++) {
                    System.out.printf("%d ", cp.dado2[j]);
                }
                break;
            }
//            System.out.println("-- digite 1 para jogar os dados --");
//            con = input.nextInt();
            System.out.println("--- jogada número " + (cp.i + 1));
            System.out.println("-- dado 1 --");
            cp.dado1[cp.i] = 1 + (int) (Math.random() * 6);
            System.out.printf("%d ", cp.dado1[cp.i]);
            System.out.print("\n");
            System.out.println("-- dado 2 --");
            cp.dado2[cp.i] = 1 + (int) (Math.random() * 6);
            System.out.printf("%d ", cp.dado2[cp.i]);
            System.out.print("\n");
            plus = cp.dado1[cp.i] + cp.dado2[cp.i];
            if (cp.i == 0 && (plus == 7 || plus == 11)) {
                System.out.println("-- soma dos dois dados --");
                System.out.printf("%d\n", plus);
                System.out.print("VENCENDOR\n");
            }
            if (cp.i != 0 && plus == 7) {
                System.out.println("-- soma dos dois dados --");
                System.out.printf("%d\n", plus);
                System.out.print("PERDEU\n");
            }
            if (cp.i == 0 && (plus == 2 || plus == 3 || plus == 12)) {
                System.out.println("-- soma dos dois dados --");
                System.out.printf("%d\n", plus);
                System.out.print("BANCA VENCEDORA\n");
            }
            if (plus == 4 || plus == 5 || plus == 6 || plus == 8 || plus == 9 || plus == 10) {
                aux.set(g, plus);
                    System.out.println("---jogadas acumuladas---");
                    System.out.println(aux.toString());
                    pont = (int) aux.get(0);
                    System.out.printf("essa é a pontuação da vez: %d\n", pont);
                    if ((int) aux.get(1) == pont || (int) aux.get(2) == pont || (int) aux.get(3) == pont) {
                        System.out.println("-- soma dos dois dados --");
                        System.out.printf("%d\n", plus);
                        System.out.println("VENCENDOR PELAS JOGADAS ACUMULADAS ");
                    }
                    g++;
                    if(g == 4){
                        g = g - 4;
                    }
            }
            else{
                System.out.println("-- soma dos dois dados --");
                System.out.printf("%d ", plus);
                System.out.print("\n");
                }
                cp.i++;
        }
    }
}

