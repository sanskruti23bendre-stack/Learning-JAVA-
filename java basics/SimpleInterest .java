public class SimpleInterest {
    public static void main(String[] args) {

        int principal = 1000;
        int rate = 5;
        int time = 2;

        double si = (principal * rate * time) / 100.0;

        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate);
        System.out.println("Time = " + time);
        System.out.println("Simple Interest = " + si);
    }
}