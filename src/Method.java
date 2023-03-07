public class Method {
    public static void main(String[] args) {
//        sayHelloWorld("Andrey", "Sholinka");

//        System.out.println(isGanjil(8));

//        System.out.println(hitung(100, "+", 50));

        System.out.println(letThemCrash(100000));
    }

    static int letThemCrash(int value) {
        int result = 0;
        if (value == 0) {
//            System.out.println("Selesai");
            result = 0;
        } else {
//            System.out.println("Loop " + value);
            result += value;
            letThemCrash(value - 1);
        }
        return result;
    }

    //nama method diawali dengan huruf kecil (camelcase)
    //method = function
    static void sayHelloWorld(String firstName, String lastName){
        System.out.println("Hello "+ firstName +" "+ lastName);
    }

    static String isGanjil(Integer angka){
        if(angka % 2 == 1){
            return "Ganjil";
        } else {
            var hasil = "Genap";
            return hasil;
        }
    }

    /**
     * Method untuk mendapatkan penjumlahan atau pengurangan
     * @param value1 angka pertama
     * @param operasi operasi + atau -
     * @param value2 angkat kedua
     * @return hasilnya
     */
    static int hitung(int value1, String operasi, int value2){
        switch (operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }
}
