public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {90,70,60};
        sayCongrats("Andrey", values);
        sayCongratsNew("Andrey", 80,70,75);
    }

    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name+ " Anda lulus");
        } else {
            System.out.println("maaf " +name+ " Anda tidak lulus");
        }
    }

    //variable argument
    static void sayCongratsNew(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75){
            System.out.println("Selamat " +name+ " Anda lulus");
        } else {
            System.out.println("maaf " +name+ " Anda tidak lulus");
        }
    }
}
