import java.util.*;
public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price of pencil");
        float pen=sc.nextFloat();
        System.out.println("ENTER price of pen");
        float penc=sc.nextFloat();
        System.out.println("enter price of eareser");
        float ear=sc.nextFloat();
        float bill= pen+penc+ear;
        System.out.println("bill "+bill);
        double gstb=bill+(bill*0.18);
        System.out.println("bill after gst tax="+gstb);
    }
}
