package com.bridgelabz.algorithmprograms;

public class InsertionSort {
    /*
     * Declaring Main method
     * To Sort Array into InsertionSort
     * @param args
     */
    public static void main(String[] args) {
        String[] myArray = {"Akshay", "Suraj", "Vaibhav", "Nitin", "Ganesh"};
        int a = myArray.length;
        String sortedArray[] = insertionSort(myArray, myArray.length);//Calling Insertion Sort Method And Stored In StoredArray
        print(sortedArray);
    }

    /**
     * Declaring Insertion Sort Method
     * To Sorting Elements Into Insertion Sort
     *
     * @param myArray
     * @param n
     * @return
     */
    public static String[] insertionSort(String myArray[], int n) {
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Checking If condition If Both are Equal MyArray Sorted in temp
                if (myArray[i].compareToIgnoreCase(myArray[j]) > 0) {
                    //Swapping of MyArray[i] and MyArray[j]
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }

    public static void print(String[] sortedArray) {
        System.out.println("After Sorting MyArray is : ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}
