package school.cesar.q3;
import java.util.Scanner;
import java.util.ArrayList;

public class SomaDupla {
    ArrayList<Integer> valores = new ArrayList();
    int alvo;
    int i;
    public static void receber(ArrayList valores,int alvo) {
        int valor1;
        int valor2;
        int somar;
        int tam = (int) valores.size();
        for (int h = 0; h <tam; h++) {
            valor1 = (int) valores.get(h);
            valor2 = (int) valores.get(h + 1);
            somar = valor1 + valor2;
            if (somar == alvo) {
                System.out.print("indice 1: ");
                System.out.println(valores.indexOf(valor1));
                System.out.print("indice 2: ");
                System.out.println(valores.indexOf(valor2));
                break;
            }
            else {
                System.out.println("Índices indeterminados");
                break;
            }
        }
    }
    public static void main(String[] args) {
        SomaDupla sd = new SomaDupla();
        Scanner input = new Scanner(System.in);
        int a;
        String stop;
        while(sd.i < 100000){
            System.out.print("digite um numero a ser adicionado na lista: ");
            a =input.nextInt();
            sd.valores.add(a);
            System.out.print("deseja parar,digite --parar-- se não --n--: ");
            stop = input.next();
            if(stop.equals("parar")){
                System.out.print("digite o valor do alvo: ");
                sd.alvo = input.nextInt();
                System.out.println(sd.valores.toString());
                break;
            }
            sd.i++;
        }
        receber(sd.valores,sd.alvo);
    }
}

