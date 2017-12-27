import java.util.Random;

public class Main {

    static int[][] DaneWejsciowe;
    static int[] DaneWyjsciowe;
    static double[] wagi;
    static double bias;
    public static void main(String[] args) {
        int[][] a = {

                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},

                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},

                {0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1},

                {1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1},

                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0},

                {0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0},

                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
        };
        Main.DaneWejsciowe = a;
        int[] b = {1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0};
        Main.DaneWyjsciowe = b;
        double[] c = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        Main.wagi = c;        printLetters(DaneWejsciowe,5,7);
        learn2(DaneWejsciowe, DaneWyjsciowe);
        int[][] in = {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0 },
                { 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1 },
                { 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0 },

        };
        int alpha = 17;
        int[] in_x = new int[35];
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 35; j++) {
                System.out.print(in[i][j] + " ");
                in_x[j] = in[i][j];
            }
            System.out.println("out: " + getOutput(alpha, wagi, bias, in_x));
        }
    }



    static void learn(int[][] DaneWejsciowe, int[] DaneWyjsciowe){

        int numberOfLetters = 20;
        int inputLength = 35;
        Random random = new Random();
        int max_i = 2000;
        double learing_rate = 0.2;
        int alpha = 17;
        int iter = 0;
        double cost;
        double glob_cost = 1;
        double output;

        System.out.println("Przed nauczaniem: ");

        for (int i = 0; i < inputLength; i++){
            wagi[i] = random.nextDouble();
            System.out.println("Waga nr: " + i + " : " + wagi[i]);
        }
        bias = random.nextDouble();
        System.out.println("bias: " + bias);

        while (glob_cost != 0 && iter<max_i){
            iter++;
            glob_cost = 0;
            int[] inputX = new int[inputLength];
            for (int i = 0; i < numberOfLetters; i++){
                for (int j = 0; j < inputLength; j++){
                    inputX[j] = DaneWejsciowe[i][j];
                }
                output = getOutput(alpha, wagi, bias, inputX);
                int o_1 = DaneWyjsciowe[i];
                cost = o_1 - output;

                for (int k = 0; k < numberOfLetters; k++){
                    wagi[k] += learing_rate*cost*inputX[k];
                }
                bias += learing_rate*cost;
                glob_cost = glob_cost + (cost * cost);
            }
        }
        System.out.println("Po nauczaniu: ");
        for (int i = 0; i < inputLength; i++)
            System.out.println("Waga nr: "+i+" : "  + wagi[i]);

        System.out.println("iteracje: " + iter);
        System.out.println("Wspolczynnik nauczania: " + learing_rate);
    }

    static void learn2(int[][] DaneWejsciowe, int[] DaneWyjsciowe){
        double[] deltaArray = new double[35];
        int numberOfLetters = 20;
        Random random = new Random();
        int inputLength = 35;
        int max_i = 200000;
        double learing_rate = 0.01;
        double momentum = 0.3;
        int alpha = 17;
        int iter = 0;
        double cost;
        double glob_cost = 1;
        double output;
        for (int i = 0; i < 35; i++)
            deltaArray[i] = 0;
        System.out.println("Przed uczeniem: ");

        for (int i = 0; i < inputLength; i++){
            wagi[i] = random.nextDouble();
            System.out.println("Waga nr: " + i + " : " + wagi[i]);
        }
        bias = random.nextDouble();
        System.out.println("bias: " + bias);

        while (glob_cost != 0 && iter<max_i){
            iter++;
            glob_cost = 0;
            int[] inputX = new int[inputLength];
            for (int i = 0; i < numberOfLetters; i++){
                for (int j = 0; j < inputLength; j++)
                    inputX[j] = DaneWejsciowe[i][j];
                output = getOutput(alpha, wagi, bias, inputX);
                int o_1 = DaneWyjsciowe[i];
                cost = o_1 - output;
                for (int k = 0; k < numberOfLetters; k++){
                    wagi[k] += learing_rate*cost*inputX[k] + momentum*deltaArray[i];
                    deltaArray[i]= learing_rate*cost*inputX[k] + momentum*deltaArray[i];
                }
                bias += learing_rate*cost;
                glob_cost = glob_cost + (cost * cost);
            }
        }
        System.out.println("Po nauczeniu: ");
        for (int i = 0; i < inputLength; i++)
            System.out.println("Waga nr: : "+i+" : "  + wagi[i]);
        System.out.println("iteracje: " + iter);
        System.out.println("Wspolczynnik uczenia: " + learing_rate);
        System.out.println("momentum : " + momentum);
    }

    public static void printLetters(int DaneWejsciowe[][], int letterWidth, int letterHeight){
        for (int i = 0; i < letterHeight; i++) {
            for (int j = 0; j < DaneWejsciowe.length; j++) {
                for (int k = 0; k < 5; k++)
                    System.out.print(DaneWejsciowe[j][((i*letterWidth) + k)]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static int getOutput(double alpha, double[] wagi, double bias, int[]  inputX){
        double o = bias;
        for (int i = 0; i < 35; i++)
            o += wagi[i] * inputX[i];
        if(o >= alpha)
            return 1;
        else
            return 0;
    }



}