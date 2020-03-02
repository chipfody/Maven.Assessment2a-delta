package rocks.zipcode.assessment2.arrays;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    private static final Logger LOGGER = Logger.getLogger(IntegerArrayUtils.class.getName());
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] newArray = new String[endingIndex - startingIndex];
        for (int i = startingIndex; i < (endingIndex - startingIndex); i++) {
            newArray[i] = arrayToBeSpliced[i];
            LOGGER.log(Level.INFO, "value is: " + newArray);
        }
        return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] newArray = new String[arrayToBeSpliced.length - startingIndex];
        for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            newArray[i] = arrayToBeSpliced[i];
        }
        return null;
    }
}
