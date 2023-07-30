import java.util.Scanner;

public class read_and_code_exercise {

    public static double  diagonal(int s) {
        double dia=Math.sqrt(2)*s;
        return dia;
        
    }
    public static double  minimum(int a,int b,int c) {
        double min =Math.min(a,Math.min(b,c));
        return min;

        
    }
    public static double  cuberoot(int s) {
        double dia=Math.cbrt(s);
        return dia;
        
    }
    public static double hypotaneous(int a,int b) {
        int hyp=a*a+b*b;
        return (Math.sqrt(hyp));
        
    }
    public static double   average(double  a,double  b,double c) {
        double avg=(a+b+c)/3;
        return (Math.round(avg));
        
    }

     
    public static void main(String[] args) {
        System.out.println(average(34, 76, 43));
        System.out.println(hypotaneous(6, 8));
         Scanner sc = new Scanner(System.in );
         System.out.println(cuberoot(126));
         System.out.println("enter the lenght of side of square=");
         int s=sc.nextInt();
         System.out.println(diagonal(s));
         System.out.println("minimum value="+minimum(10,30,40));

         

    }
    
}
 