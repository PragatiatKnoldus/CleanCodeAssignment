package com.knoldus;

public class ArrayFunctions {

    static class Numbers {

        int minValue;
        int maxValue;
    }

    static Numbers findMinMax(int numArray[], int arraySize) {
        Numbers num = new Numbers();
        int index;

        //Assigning initial value to the variables
        num.maxValue = numArray[0];
        num.minValue = numArray[0];

        // This loop provides full coverage to the program.
        for (index = 1; index < arraySize; index++) {
            if (numArray[index] > num.maxValue) {
                num.maxValue = numArray[index];
            } else if (numArray[index] < num.minValue) {
                num.minValue = numArray[index];
            }
        }
        return num;
    }

    public static void main(String args[]) {
        int numArray[] = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        Numbers num = findMinMax(numArray, size);
        System.out.printf("\nMinimum number in the sequence is %d", num.minValue);
        System.out.printf("\nMaximum number in the sequence is %d", num.maxValue);
    }
}
