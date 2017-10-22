/**
 * Created by elgha_000 on 22.10.2017.
 */
import java.util.Random;


public class Perceptron

{
    int proby=0;

    double prog;
    double[] wagi;
    public int Output(double[] input)
    {
        double suma = 0;
        for(int i = 0; i < input.length; i++)

        {
            suma += wagi[i] * input[i];
        }

        if(suma > prog)
            return 1;
        else
            return 0;
    }
    
    public void Learn(double[][] inputs, int[] outputs, double prog, double learningRate, int numberOfIterations)

    {
        this.prog = prog;
        wagi = new double[inputs[0].length];
        Random random = new Random();


        for(int i=0;i<inputs[0].length;i++)
            wagi[i] = random.nextDouble();


        for(int i = 0; i < numberOfIterations; i++)
        {

            int Errorsuma = 0;
            for(int j = 0; j < outputs.length; j++)
            {

                int output = Output(inputs[j]);

                int error = outputs[j] - output;

                Errorsuma += error;

                for(int k = 0;k < inputs[0].length; k++)
                {

                    double delta = learningRate * inputs[j][k] * error;


                    wagi[k] += delta;
                }
            }
            
            if(Errorsuma == 0)
            
            
            {
                System.out.println("Loop ended after iterations : " + i);
                break;
            }
        }
    }

    
}
