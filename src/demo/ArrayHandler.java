package demo;

import java.util.Arrays;

public class ArrayHandler {

    public int[] getAllAfterFour(int[] arr) {
        int index4 = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                index4 = i;
            }
        }
        if (index4 == -1) {
            throw new RuntimeException();
        } else return Arrays.copyOfRange(arr, index4 + 1, arr.length);
    }

    public boolean isHasOnlyOneAndFour(int[] arr) {
        boolean has4 = false;
        boolean has1 = false;
        boolean hasOther = false;

        for (int i : arr) {
            if (i == 4) {
                has4 = true;
            } else if (i == 1) {
                has1 = true;
            } else hasOther = true;
        }
        return (has1 && has4 && !hasOther);
    }
}
