public class Array {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];

        arrayString[0] = "satu";
        arrayString[1] = "dua";
        arrayString[2] = "tiga";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[2] = "new tiga";

        System.out.println(arrayString[2]);

        String[] arraySting2 = new String[3];

        String[] namaNama = {
                "satu", "dua", "tiga"
        };

        namaNama[0] = null;

        System.out.println(namaNama[1]);

        int[] arrayInt = new int[] {
                1,2,3,4,5
        };

        System.out.println(arrayInt[4]);

        long[] arrayLong = {
                10L,20L,30L
        };

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong.length);

        String[][] members = {
                {"eko", "kurniawan", "kenedy"},
                {"budi", "sudarsono"},
                {"maman", "abdurahman"}
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][1]);
    }
}
