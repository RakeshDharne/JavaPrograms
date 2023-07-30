

public class nine {

    public static void compare(String str) {
            ////maximum length of string
            
        
    }
    public static void main(String[] args) {
        String fruits[]={"appghsfdlgjhlghsolghsle","manlgo","fdladghw"};
        String maxlenght=fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if(maxlenght.compareTo(fruits[i])<0){
                maxlenght=fruits[i];
            }
        }
        System.out.println(maxlenght);
    }
    
}


