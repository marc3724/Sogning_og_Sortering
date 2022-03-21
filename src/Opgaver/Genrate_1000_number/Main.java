package Opgaver.Genrate_1000_number;

import Opgaver.opgave1.QuickSort2;

public class Main {
    public static void main(String[] args) {

        //generates random RadomNumbers
        int[] ArrayofRandomNumbers = GenrateNumbers.GenrateNumber();
        int[] ArrayOfNumbersToBeSorted = ArrayofRandomNumbers;

        System.out.println("længde på array " + ArrayofRandomNumbers.length + "\n");
        for (int i = 0; i < ArrayofRandomNumbers.length ; i++) {
            System.out.println("array index [" + i + "] Array number (" + ArrayofRandomNumbers[i] + ") ");
        }
//--------------------------------------------------------------------------------------------------------------------

        int [] SortedNumbers = Sort.quickSort(ArrayOfNumbersToBeSorted);

        System.out.print("\nsorted RadomNumbers\n");
        for (int j = 0; j < SortedNumbers.length ; j++) {
            System.out.println("array index\b [" + j + "] Array number (" + SortedNumbers[j] + ") ");

        }
//---------------------------------------------------------------------------------------------------------------------
     //sout sorter

        for (int j = 0,i=0; j < SortedNumbers.length && i < ArrayOfNumbersToBeSorted.length ; j++,i++) {

            System.out.println("array index [" + j + "] \t  sorted Array number (" + SortedNumbers[j] + ") \t " +
                    "random Array number (" + ArrayOfNumbersToBeSorted[i] + ") ");
        }
//---------------------------------------------------------------------------------------------------------------------

        //TODO Selection Sort


    }
}
