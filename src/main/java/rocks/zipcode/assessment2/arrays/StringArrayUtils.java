package rocks.zipcode.assessment2.arrays;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    private static final Logger LOGGER = Logger.getLogger(IntegerArrayUtils.class.getName());

    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @param endingIndex      - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {

        if (startingIndex < 0) {
            throw new IllegalArgumentException();
        }
        if (startingIndex > arrayToBeSpliced.length) {
            throw new IndexOutOfBoundsException();
        }

        String[] subArray = new String[endingIndex - startingIndex];
        for (int i = 0; i < endingIndex - startingIndex; i++) {
            subArray[i] = arrayToBeSpliced[startingIndex + i];

//            LOGGER.log(Level.INFO, "value is: " + subArray);
        }
        return subArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex    - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {

        if (startingIndex < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (startingIndex > arrayToBeSpliced.length) {
            throw new IllegalArgumentException();
        }

        String[] solution = new String[arrayToBeSpliced.length - startingIndex];
        for (int i = 0; i < solution.length; i++) {
            solution[i] = arrayToBeSpliced[startingIndex + i];
            //startingIndex++;
        }
        return solution;
    }
}
