package entity;

public class Neural {
    private double[] weights;
    private double bias;

    public Neural (double[] weights, double bias){
        this.bias = bias;
        this.weights = weights;
    }

    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getBias() {
        return bias;
    }

    public void setBias(double bias) {
        this.bias = bias;
    }

    public double leakyReLu(double x){
        final double alpha = 0.01;
        if (x > 0) return x;
        else return alpha * x;
    }

    /*
    * if we have:
    * input = {5, 30}
    * weights = {0.8, 0.2}
    *
    * the loop make:
    *
    * (first interaction): 5 * 0.8 = 4
    * sum = 4
    *
    * (second interaction): 30 * 0.2 = 6
    * sum = 4 + 6 = 10
    * */
    public double calcular (double[] inputs){
        double sum = 0;
        for (int i = 0; i< inputs.length; i++){
            sum += weights[i] * inputs[i];
        }
        sum += bias;
        return leakyReLu(sum);
    }

    public void treinar (double[] inputs, double waited, double learningRate){
        double preview = calcular(inputs);
        double error = waited - preview;

        for (int i = 0; i<weights.length; i++){
            weights[i] += error * learningRate * inputs[i];
        }
        bias += error * learningRate;
    }
}
