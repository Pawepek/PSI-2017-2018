/**
 * Created by elgha_000 on 22.10.2017.
 */
public class Main

{

    public static void main(String[] args)
    {
        Perceptron perceptron = new Perceptron();
        double inputs[][] = {{0, 0}, {0, 1}, {1, 0}, {1, 1}};

        int outputs[] = {0, 0, 0, 1};
        for (int i = 0; i < 5; i++)
        {
            perceptron.Learn(inputs, outputs, 0.3, 0.001, 1000);
        }
    }
}