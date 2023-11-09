package org.briese.viktoria.task2;

import java.util.List;

public class MaxElementFinder {
    public static <T extends Comparable<? super T>> T findMaxElementInRange(List<T> list, int begin, int end) {
        if (begin < 0 || end > list.size()) {
            throw new IndexOutOfBoundsException("Неверный диапазон");
        }
        // Границы параметра метода должны быть целочисленными значениями (например, начало и конец интервала).
        // Эти границы должны быть такими, чтобы выбранный диапазон был в пределах индексов элементов списка.
        // Для этого, границы должны быть неотрицательными и меньше количества элементов в списке.
        // Если границы выходят за допустимый диапазон, выбрасывается исключение IndexOutOfBoundsException.

        T maxElement = list.get(begin);
        for (int i = begin + 1; i < end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }
}
