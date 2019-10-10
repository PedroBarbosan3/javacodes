package school.cesar.q4.domain;
import java.util.Scanner;
import java.util.ArrayList;

public class Data {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> dat1 = new ArrayList();
    ArrayList<Integer> dat2 = new ArrayList();
    int dia;
    int mes;
    int ano;
    int diaSemana;
    public void entrada(int dia,int mes,int ano,int diaSemana){
        System.out.print("digite o dia: ");
        this.dia = input.nextInt();
        System.out.print("digite o mes: ");
        this.mes = input.nextInt();
        System.out.print("digite o ano: ");
        this.ano = input.nextInt();
        System.out.print("digite o dia da semana: ");
        this.diaSemana = input.nextInt();
    }
    enum semana{
        SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7), DOMINGO(1);
        private int valor;
        private semana(int valor){
            this.valor = valor;
        }
        public int getValor(){
            return valor;
        }
    }
    public void check(int dia,int mes,int ano){
        if(this.mes > 12){
            this.mes = 12;
        }
        if(this.mes <= 0){
            this.mes = 1;
        }
        if(this.mes == 2){
            if(this.dia > 29){
                this.dia = 28;
            }
            if(this.dia < 1){
                this.dia = 1;
            }
        }
        if((this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11)){
            if(this.dia > 30) {
                this.dia = 30;
            }
            if(this.dia < 1){
                this.dia = 1;
            }
        }
        if((this.mes == 1 || this.mes == 3 || this.mes == 5 || this.mes == 7 || this.mes == 8 || this.mes == 10 || this.mes == 12)){
            if(this.dia > 31){
                this.dia = 31;
            }
            if(this.dia < 1){
                this.dia = 1;
            }
        }

    }
//    public void data1(){
//        dat1.add(this.dia);
//        dat1.add(this.mes);
//        dat1.add(this.ano);
//    }
//    public void data2(){
//        dat2.add(this.dia);
//        dat2.add(this.mes);
//        dat2.add(this.ano);
//    }
    public static void compare(ArrayList dat1,ArrayList dat2){
            if((int)dat1.get(2) < (int)dat2.get(2)){
//                System.out.println("data 1 menor q data 2 por causa do ano");
                System.out.println(dat1.toString());
            }
             if((int)dat1.get(2) > (int)dat2.get(2)){
//                System.out.println("data 2 menor q data 1 por causa do ano");
                 System.out.println(dat2.toString());
            }
            if((int)dat1.get(1) <(int) dat2.get(1) && (int)dat1.get(2) == (int)dat2.get(2)){
//                System.out.println("data 1 menor q data 2 por causa do mes");
                System.out.println(dat1.toString());
            }
            if((int)dat1.get(1) >(int) dat2.get(1) && (int)dat1.get(2) == (int)dat2.get(2)){
//                System.out.println("data 2 menor q data 1 por causa do mes");
                System.out.println(dat2.toString());
            }
            if((int)dat1.get(0) < (int)dat2.get(0) && ((int)dat1.get(1) == (int)dat2.get(1)) && ((int)dat1.get(2) ==(int) dat2.get(2))){
//                System.out.println("data 1 menor q data 2 por causa do dia");
                System.out.println(dat1.toString());
            }
            if((int)dat1.get(0) > (int)dat2.get(0) && ((int)dat1.get(1) == (int)dat2.get(1)) && ((int)dat1.get(2) ==(int) dat2.get(2))){
//                System.out.println("data 2 menor q data 1 por causa do dia");
                System.out.println(dat2.toString());
            }
    }
//    public void overCompare(int diaSemana,semana){
//
//    }

    public static void main(String[] args) {
        System.out.println("---data 1---");
        Data dt = new Data();
        dt.entrada(dt.dia,dt.mes,dt.ano,dt.diaSemana);
        dt.check(dt.dia,dt.mes,dt.ano);
        dt.dat1.add(dt.dia);
        dt.dat1.add(dt.mes);
        dt.dat1.add(dt.ano);
//        System.out.println(dt.dat1.toString());
        System.out.println("---after check---");
        System.out.printf("%d/%d/%d\n",dt.dia,dt.mes,dt.ano);
        System.out.println("---data 2---");
        Data dt2 = new Data();
        dt2.entrada(dt2.dia,dt2.mes,dt2.ano,dt2.diaSemana);
        dt2.check(dt2.dia,dt2.mes,dt2.ano);
        dt2.dat2.add(dt2.dia);
        dt2.dat2.add(dt2.mes);
        dt2.dat2.add(dt2.ano);
        System.out.println("---after check---");
        System.out.printf("%d/%d/%d\n",dt2.dia,dt2.mes,dt2.ano);
        System.out.println("---Menor data---");
        compare(dt.dat1,dt2.dat2);
    }
}
