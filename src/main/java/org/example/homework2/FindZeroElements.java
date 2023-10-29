package org.example.homework2;

public class FindZeroElements {
    public static boolean findZeroElements(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
