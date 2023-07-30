public class eight {

    public static void Substrings(String s1, int si, int ei) {

        for (si = 0; si < ei; si++) {
            System.out.print(s1.charAt(si));
        }

    }

    public static void main(String[] args) {
        String s1 = "RAKESHDHARNE";

        // System.out.println( s1.substring(0,6 ));
        Substrings(s1,0,6);
    }
}

