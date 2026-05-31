public class PerfectSquare{

    public static int[] perfectSquare(int[] array){
    
        int add = 0;
    
        for(int count = 0; count < array.length; count++){
        
            int root = (int) Math.sqrt(array[count]);
            
            if(root * root == array[count]){
            
            add++;
                
        }
        
        int[] number = new int[add];
        
        int hot = 0;
        for(int count = 0; count < array.length; count++){
        
            int root = (int) Math.sqrt(array[count]);
            
            if(root * root == array[count]){
            
            number[hot] = array[count];
            hot++;
                
        }        
        
        
    }
    
    
    
     
            
        
        }
} 
