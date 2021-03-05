package com.company;

public class Main {

    public static char[] rightShift(char[] array){
        char[] shiftedArray = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if(i == 0){
                shiftedArray[0]=array[array.length-1];
            }else{
             shiftedArray[i]=array[i-1];
            }
        }
        return shiftedArray;//(A B C D E = E A B C D)
    }

    public static void exportArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D', 'E'};
        char[] arr2=rightShift(array);
        exportArray(arr2);
    }
}
