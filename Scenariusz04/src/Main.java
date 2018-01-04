import java.util.Random;

public class Main{
    public static void main(String a[]){
        int input[][] =new int[][]{
                //X:
                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                //Y:
                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0},
                //D:
                {1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0},
                //E:
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                //F:
                {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                //G:
                {0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0},
                //H:
                {1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                //I:
                {0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 0},
                //J:
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0},
                //k:
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0},
                //l:
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0},
                //m:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
                //n:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1},
                //o:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                //b:
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                //r:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                //s:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                //t:
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1},
                //u:
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1}
        };
        Net net = new Net(35,input);
        net.training();
        int i=0;
            System.out.print("X" + ": ");
            net.testing(input[i]);


        i++;
        System.out.print("Y" + ": ");
        net.testing(input[i]);
        i++;

        System.out.print("D" + ": ");

        net.testing(input[i]);
        i++;

        System.out.print("E" + ": ");
        net.testing(input[i]);
        i++;

        System.out.print("F" + ": ");
        net.testing(input[i]);
        i++;

        System.out.print("G" + ": ");
        net.testing(input[i]);
        i++;

        System.out.print("H" + ": ");
        net.testing(input[i]);
i++;
        System.out.print("I" + ": ");
        net.testing(input[i]);
        i++;

        System.out.print("J" + ": ");
        net.testing(input[i]);


    }
}
class Net {

    double n=0.3;
    double decay = 0.5;
    int training[][] =new int[35][];
    Neuron neurons[]=new Neuron[35];

    public Net(int noOfNeurons,int trainingdata[][]){
        neurons=new Neuron[noOfNeurons];
        for(int j=0;j<neurons.length;j++){
            neurons[j]=new Neuron();
        }
        training=trainingdata;
    }

    public void training(){
        for(int i=0;i<training.length;i++){
            int inputs[]= training[i];
            double output=getNeuralNetOutput(neurons,inputs);
            for(int j=0;j<neurons.length;j++){
                neurons[j].updateWeight(neurons[j].getWeight() * (1 - decay) + output * n * inputs[j]);
            }
        }
    }

    public double getNeuralNetOutput(Neuron[] neurons,int inputs[]){
        double output=0;
        for(int j=0;j<neurons.length;j++){
            output+=neurons[j].getOutput(inputs[j]);
        }
        return output;
    }

    public void testing (int[] inputs){
        System.out.println(getNeuralNetOutput(neurons,inputs));
    }

    class Neuron{
    double w;

    public Neuron(){
        Random random = new Random();

        w = random.nextDouble();
    }

    public double getOutput(int x){
        return x*w;
    }

    public void updateWeight(double update){
        w=update;
    }
    public double getWeight(){
        return this.w;
    }
}
}