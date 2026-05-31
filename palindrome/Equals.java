public class Equals{

    public static boolean palindrome(int[] array){
    
        boolean deji = true;
        
            int[] newArray = new int[array.length];
        
            for(int count = 0; count < array.length; count++){
            
            newArray[count] = array[array.length - 1 -count];
            
         
            }
            
            for(int counter = 0; counter < array.length; counter++)
            
            
            if(array[counter] != newArray[counter]) {
            
                deji = false;
                
               
                
            }
            
            return deji;
    }
    
    public static void main(String[] args){
    
        int[] arrays = {1,2,2,1};
    
        System.out.println("palindrome is: " + palindrome(arrays));
    }
   
}  
