package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length <= 1) {
            return;
        }

        int lastElement = array[array.length - 1];

        // Shift elements to the right
        System.arraycopy(array, 0, array, 1, array.length - 1);

        // Set the first element to the original last element
        array[0] = lastElement;
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length <= 1) {
            return;
        }

        shift %= array.length;  // Ensure the shift is within array length

        if (shift == 0) {
            return;  // No need to shift
        }

        int[] temp = new int[shift];

        // Copy the last 'shift' elements to the temporary array
        System.arraycopy(array, array.length - shift, temp, 0, shift);

        // Shift elements to the right by 'shift' positions
        System.arraycopy(array, 0, array, shift, array.length - shift);

        // Copy the elements from the temporary array to the beginning of the array
        System.arraycopy(temp, 0, array, 0, shift);
    }
}
