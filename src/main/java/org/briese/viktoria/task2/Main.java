package org.briese.viktoria.task2;
// Напишите параметризированный метод для нахождения максимального элемента в диапазоне [begin, end) среди элементов List.
// Какую границу должен иметь параметр такого метода?

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 2, 8, 5);
        int max = MaxElementFinder.findMaxElementInRange(numbers, 0, numbers.size());
        System.out.println("Максимальный элемент в диапазоне: " + max);
    }
}
