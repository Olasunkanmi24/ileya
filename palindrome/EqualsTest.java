import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class EqualsTest{
    
    @Test
        public void checkThatpalindromeExist(){
          int[] array = {45,0,8,0,48};
          Equals.palindrome(array);
                
        }
    @Test
        public void testThatEqualsRetureTrue() {
        int[] array = {45,0,8,0,45};
        int[] expected = true;
        int[] actual = Equals.palindrome(array);
        assertArrayEquals(actual, expected);
        
        
        }
        
    
        
    }
