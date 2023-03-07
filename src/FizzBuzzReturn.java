public class FizzBuzzReturn {
    public static void main(String[] args) {

        int[] numbers = {1, 3,10,12,6,17,19,20,30,99};

        for(int number: numbers){
            System.out.println(fizzBuzz(number));
        }
    }
    private static String fizzBuzz(int number){
        if (number % 15 == 0) {
            return number + " FizzBuzz";
        }
        if (number % 5 == 0) {
            return number + " Buzz";
        }
        if (number % 3 == 0) {
            return number + " Fizz";
        }
        return String.valueOf(number);
    }
}
