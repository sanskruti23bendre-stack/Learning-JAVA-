public class typeconversion {
    public static void main(String[] args) {
        
        int num1 = 10;
        double num2 = num1; // int to double
        System.out.println("Implicit Type Conversion: " + num2);

    
        double num3 = 9999.788;
        int num4 = (int) num3; // double to int
        System.out.println("Explicit Type Conversion: " + num4);

         char ch ='A';
        int num = ch;
        System.out.println(num);

        int  num5 = (byte) num3; 
        System.out.println( num5);

    }
}   


    