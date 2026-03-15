import entity.Neural;

public class Main {

    public static void main(String[] args) {

        double[] weights = {0.5, 1.0};
        double bias = 0.5;

        Neural neural = new Neural(weights, bias);

        double[][] inputs = {
                {2, 1},
                {3, 1},
                {4, 1},
                {5, 1}
        };

        double[] outputs = {
                4,
                6,
                8,
                10
        };

        double learningRate = 0.001;

        for (int epoch = 0; epoch < 10000; epoch++) {

            for (int i = 0; i < inputs.length; i++) {
                neural.treinar(inputs[i], outputs[i], learningRate);
            }
        }

        double[] testInput = {6, 1};

        double resultado = neural.calcular(testInput);

        System.out.println("Resultado após treino: " + resultado);

    }
}