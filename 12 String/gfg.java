public class gfg {
       String modify ( String S )
    {
        for (int i = 0; i < S.length(); i++) {
            
            if(S.CharAt(i)==" "){
                char temp=S.CharAt(i)
                S.CharAt(i)=S.CharAt(i+1);
                S.CharAt(i+1)=temp;

                
            }
         
            
            
        }

            

            
            
            
        

        
        
    }
}
