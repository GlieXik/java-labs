import java.util.Random;

public class App {
    public static void bubleSort(Double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Random random = new Random();
        Double[] cosValues = new Double[10];
        
        for (int i = 0; i < cosValues.length; i++) {
            double x = random.nextDouble();
            cosValues[i] = Math.cos(x);
        }

        bubleSort(cosValues);

        for (int i = cosValues.length - 1; i >= 0; i--) {
            System.out.println(cosValues[i]);
        }
    }
}