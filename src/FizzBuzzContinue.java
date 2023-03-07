public class FizzBuzzContinue {
    public static void main(String[] args) {

        int[] numbers = {1, 3,10,12,6,17,19,20,30,99};

        for(int number: numbers){

            if (isNumberMultiplicationOf(15, number)) {
                System.out.println(number + " FizzBuzz");
                continue;
            }
            if (isNumberMultiplicationOf(3, number)) {
                System.out.println(number + " Fizz");
                continue;
            }
            if (isNumberMultiplicationOf(5, number)) {
                System.out.println(number + " Buzz");
                continue;
            }
            System.out.println(number);
        }
    }
    private static boolean isNumberMultiplicationOf(int divider, int number) {
        return number % divider == 0;
    }
}
