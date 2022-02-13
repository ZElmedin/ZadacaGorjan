public class Assignment5 {
    public static void main(String[] args) {
        int numberX = 3;
        int total = (numberX + numberX + 6) / 2 - numberX;
        System.out.println(total);
        if (total % 2 == 0) {
            System.out.println("The number is divisible by 2");
        }
    }
}
