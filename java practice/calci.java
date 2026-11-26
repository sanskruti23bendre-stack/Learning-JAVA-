//array
public class calci {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
        
            sum += arr[i];
           
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}