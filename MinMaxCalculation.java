public class MinMaxCalculation {
    public static void main(String[] args) {
        
    }

    public static double min(double ... numbers) {
        double min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }


    public static double max(double ... numbers) {
        double max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
