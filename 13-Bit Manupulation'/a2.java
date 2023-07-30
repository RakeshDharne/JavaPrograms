import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class a2 {

    public static int getIthBit(int n,int i)
    {
        int bitmask=(1<<i);
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;

        }


    }



    public static int setIthBit(int n,int i){
        int bitmask=1<<i;

        return(n|bitmask);
    }

    public static int  clearTillLastIthBit(int n,int i){


        int bitmask=~(1)<<i;
        return (n&bitmask);
    }



    public static int updateIthBit(int n, int i,int newbit){
        // int bitmask=1<<i;
        // if(getIthBit(n,i)==newbit){
        //     return n;
        // }
        // else{

        //     if((n&bitmask)==0){
               
        //     }

        // }


        if(newbit==0){
            return clearIthBit(n,i);
        }
        else{
            return setIthBit(n,i);
        }
        
    }

    public static int  clearIthBit(int n,int i){
 
        int bitmask=~(1<<i);
        return (n&bitmask);
    }






    public static void main(String[] args) {
        //get ith bit
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number=");
        int n= sc.nextInt();
        System.out.println("enter position no");
        int pos= sc.nextInt();
        
        //setIthBit(n,pos);
       // clearIthBit(n,pos);



    }
}
