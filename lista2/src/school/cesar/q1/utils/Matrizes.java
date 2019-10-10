package school.cesar.q1.utils;
public class Matrizes {
    public int vector1[][];
    public int vector2[][];
    public int a;
    public int b;
    public int c;
    public static void multiplicar(int vector1[][],int vector2[][],int a,int b,int c) {
        int i, j;
        if(a != b || a != c){
            System.out.print("null");
        }
        else{
            int vectorm[][] = new int[a][a];
            for(i = 0;i < a;i++) {
                for(j = 0;j < a;j++) {
                    vectorm[i][j] = vector1[i][j]*vector2[i][j];
                }
            }
            for(i = 0;i < a;i++) {
                for(j = 0;j < a;j++) {
                System.out.printf("%d ",vectorm[i][j]);
            }
            System.out.print("\n");
        }
    }
    }
}

