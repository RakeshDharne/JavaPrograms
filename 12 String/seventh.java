public class seventh {
 public static void main(String[] args) {
    String s1="Tony";
    String s2="Tony";
    String s3=new String("Tony");
    if(s1==s2){
        System.out.println("strings are equal");

    }else{

        System.out.println("strings are not equal");

    }

    if (s1==s3) {
        System.out.println("strings are equal");
    } else {
        System.out.println("strings are  not equal");
        
    }

    ////but s2 is pointing to string s1 thats why it is comparable
    ///but if want to compare string value then use [string namse.equals(string name);] because of new keyword another tony is created

    if(s1.equals(s3)){
        System.out.println("strings are equal");
    }
    else{
        System.out.println("strings are not equal");
    }
 }   
}
