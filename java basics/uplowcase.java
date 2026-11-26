class uplowcase{
    public static void main(String[] args) {
        String str = "Sanskruti Here learn Java";

        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());

        if (str.contains("Java"))
            System.out.println("Contains Java");
        else
            System.out.println("Does not contain Java");
    }
}S