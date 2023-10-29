package org.example.homework2;

public class CountEvens {
    public static int countEvens(int[] array) {
        int count = 0;
        for (int c : array) {
            if (c % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
