public class stringcompression {

    public static String compress(String str) {
        StringBuilder sb =new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            
            Integer count=1;
            while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)) {
                
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count); 
            }
        }
        return sb.toString();

        
    }
    



    public static String usingstring(String str) {

        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count=1;
            while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){

                count++;


                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count;
            }
            
        }
        return newstr;
        
    }




    public static void main(String[] args) {
        String str="aaabbcccdd";
        
        System.out.println(compress(str));
        System.out.println(usingstring( str));
    }
}
