class Percentage {
    public static void main(String[] args) {

     int sub1 = 85;
      int sub2 = 90;
        int sub3 = 80;
        int sub4 = 75;
        int sub5 = 95;
      int sub6 = 85;

        int total = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        double percentage = (total / 600.0) * 100;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
    }
}