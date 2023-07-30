
import java.util.*;

public class fourth {


    public static void main(String[] args) {
        
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);
        int maxsum=0;
        for (int i = 0; i < B.length; i++) {
            maxsum=maxsum+(int)Math.abs(A[i]-B[i]);

        }
        System.out.println(maxsum);

    }
}
