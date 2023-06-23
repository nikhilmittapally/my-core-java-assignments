public class DivisibleNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;

        System.out.println("First 5 numbers divisible by 2, 3, and 5:");

        while (count < 5) {
            if (number % 2 == 0 && number % 3 == 0 && number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
