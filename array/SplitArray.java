import java.util.Arrays;
public class SplitArray {
    public static int[][] splitArray(int[] array) {
        int[][] newArray = new int[2][3];
   
      int even = 0;
      int odd = 0;     
        for (int count = 0; count < array.length; count++) {
            if (array[count] % 2 == 0) {
                newArray[0][even] = array[count];
                even++;
            }
            else {
                newArray[1][odd] = array[count];
                odd++;
            }
        }
        
        return newArray;
    }

}
