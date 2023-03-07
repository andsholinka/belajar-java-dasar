public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "E";

        switch (nilai){
            case "A":
                System.out.println("Wow, Anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
                break;
        }

        //switch lambda on versi 14
//        switch (nilai){
//            case "A" -> System.out.println("anda lulus");
//        }
    }
}
