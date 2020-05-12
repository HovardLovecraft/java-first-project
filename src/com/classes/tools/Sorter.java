package com.classes.tools;

import com.classes.people.Customer;

import java.util.Comparator;

public class Sorter {

    public Sorter() {
    }

    public static Comparator<Customer> customerNameComparator = new Comparator<Customer>() {

        public int compare(Customer c1, Customer c2) {
            String CustomerName1 = c1.getFirstName().toLowerCase();
            String CustomerName2 = c2.getFirstName().toLowerCase();
            return CustomerName1.compareTo(CustomerName2);
        }
    };

    public void bubbleSort(int[] array) {

        int temp;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < array.length -1; i++) {
                if(array[i] > array[i+1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public void insertionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j] < min){
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }

    }

//    public static String getReversedString(String s) {
//
//        char[] resultArr = new char[s.length()];
//        int j = 0;
//        for (int i = s.length() - 1; i >= 0; i--) {
//            //int j = s.length() - i - 1;
//            resultArr[j++] = s.charAt(i);
//        }
//
//        return new String(resultArr) ;
//    }

    // Не создавая временного массива чаров в пол цикла ревертнуть массив чаров

//    public static char[] getReversedString(char[] chars) {
//
//        int j = chars.length - 1;
//        for (int i = 0; i < chars.length; i++) {
//            if(i < j){
//                char temp = chars[i];
//                chars[i] = chars[j];
//                chars[j] = temp;
//            }
//            else break;
//            j--;
//        }
//
//        return chars;
//    }
    public static char[] getReversedString(char[] chars) {
        int i = 0;
        int j = chars.length - 1;
        while (i < j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }

        return chars;
    }

    public static void printMatrix(){
        int matrix[][] = new int[10][10];
        int newMatrix[][] = new int[10][10];
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter;
                newMatrix[i][j] = matrix[j][i];
                System.out.print(counter + " ");
                counter++;

            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = counter;
                counter = newMatrix[j][i];
                counter++;
                System.out.print(newMatrix[i][j] + " ");
            }
        }
    }
}


