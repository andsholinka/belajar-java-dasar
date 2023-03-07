public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //augmented assignments

        a += 10;
        System.out.println(a);

        a -= 10;
        System.out.println(a);

        //unary operator
        a++;
        System.out.println(a);
        System.out.println(-a);
    }
}
