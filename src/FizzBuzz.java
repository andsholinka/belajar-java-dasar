public class FizzBuzz {
    public static void main(String[] args) {

        int[] numbers = {1, 3,10,12,6,17,19,20,30,99};

        for(int number: numbers){

            if (!isNumberMultiplicationOf(3, number) && !isNumberMultiplicationOf(5, number)) {
                System.out.println(number);
            }
            if (isNumberMultiplicationOf(3, number) && !isNumberMultiplicationOf(5, number)) {
                System.out.println(number + " Fizz");
            }
            if (!isNumberMultiplicationOf(3, number) && isNumberMultiplicationOf(5, number)) {
                System.out.println(number + " Buzz");
            }
            if (isNumberMultiplicationOf(3, number) && isNumberMultiplicationOf(5, number)) {
                System.out.println(number + " FizzBuzz");
            }
        }
    }
    private static boolean isNumberMultiplicationOf(int divider, int number) {
        return number % divider == 0;
    }
}
