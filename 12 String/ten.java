public class ten {


    public static void subString(String str,int a,int b) {
        for (int i = a; i < b; i++) {
            System.out.print
            (str.charAt(i));
        }
        
    }
    public static void main(String[] args) {
        String str="hellow World";
        subString(str,0,7);
       //using function// System.out.println(str.substring(0, 7));
    }
}
