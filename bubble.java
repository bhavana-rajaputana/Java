
import java.util.Arrays;

import static com.bhavana.inputArray.arrinput;

public class bubble {

    public static void main(String[] args) {

        int[] intArray=arrinput();



        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }


                System.out.println(Arrays.toString(intArray));
            }
        }


        System.out.println(Arrays.toString(intArray));

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
