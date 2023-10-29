package org.example.homework2;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {2, 1, 2, 3, 4};
        int arr2[] = {2, 2, 0};
        int arr3[] = {1, 3, 5};
        int arr4[] = {1, 6, 4, 0, 5, 0, 3, 9};
        int arr5[] = {4, 3, 6, 0, 0, 8, 0, 5};

        // Задача 1
        System.out.println("Количество чётных элементов в массиве");
        System.out.println(CountEvens.countEvens(arr1));
        System.out.println(CountEvens.countEvens(arr2));
        System.out.println(CountEvens.countEvens(arr3));

        // Задача 2
        System.out.println("Разница между самым большим и самым " +
                "маленьким элементом массива");
        System.out.println(
                FindMinMaxInArray.findMaxInArray(arr1) -
                        FindMinMaxInArray.findMinInArray(arr1));
        System.out.println(
                FindMinMaxInArray.findMaxInArray(arr2) -
                        FindMinMaxInArray.findMinInArray(arr2));
        System.out.println(
                FindMinMaxInArray.findMaxInArray(arr3) -
                        FindMinMaxInArray.findMinInArray(arr3));

        // Задача 3
        System.out.println("Если ли в переданном массиве " +
                "два соседних элемента, с нулевым значением");
        System.out.println(FindZeroElements.findZeroElements(arr4));
        System.out.println(FindZeroElements.findZeroElements(arr5));
    }
}
