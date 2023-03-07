public class TipeDataNumber {

    public static void main(String[] args) {

        //short iniShort = 1000;
        //System.out.println("InShort " + iniShort);

        //float iniFloat = 10.12F;
        //double iniDouble = 10.10;
        //System.out.println("IniFloat " + iniFloat);

        int amount = 1_000_000_000;
        System.out.println(amount);

        //widening casting (otomatis): byte -> short -> int -> long -> float -> double
        //narrowing casting (manual): double -> float -> long -> int -> char -> shot -> byte

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;

    }
}
