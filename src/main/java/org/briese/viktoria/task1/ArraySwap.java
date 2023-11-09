package org.briese.viktoria.task1;

public class ArraySwap {
    public static <T> void swapPositions(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        swapPositions(numbers, 1, 3);

        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] names = {"John", "Mary", "Alice", "Bob"};
        swapPositions(names, 0, 2);

        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
