public class program3 {

    public static int prodct(int a,int b) {

        int product =  a*b;
        return product;

        
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int pro =prodct(a, b);
        
        System.out.println("a*b="+pro);
        pro=prodct(40,4);
        System.out.println("a*b="+pro);



        //System.out.println("product="+prodct(a, b));
        //System.out.println("product="+prodct(30,40));
    }
}
