package com.company.Greenlee;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int array[]; // Declaring int array

        array = new int[5]; // Allocates space in our array
        array[0] = 0;
        array[1] = 10;
        array[2] = 20;
        array[3] = 30;
        array[4] = 40; // Remember there is only an index of 4 but 5 elements.

        System.out.println(array[2]);

        int[] primes = {5, 7, 11, 17, 19, 23, 29, 31, 37}; // Index of 8 but 9 elements.
        System.out.println("Prime numbers:" + primes);
        System.out.println("Actual prime numbers: " + Arrays.toString(primes));
        System.out.println("The length is: " + primes.length);

        for (int i = 0; i < primes.length; i++) {
            System.out.println(primes[i]);
        }

        String[][] phones = {{"Apple", "iPhone"}, {"Samsung", "Galaxy"}, {"Sony", "Experia"}};
        System.out.println(Arrays.deepToString(phones));

        int randomInt = (int) (10 * Math.random() + 1);
        System.out.println(randomInt);*/


        Random numbers = new Random(); // creating Random object
        int[] randomNums = new int[10];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = numbers.nextInt(20);
            System.out.println(randomNums[i]);
        }
        System.out.println("Select a random number from the list: ");
        int userInput = input.nextInt();

        if (userInput == randomNums[i]) {
            System.out.println("This number is located in indexes: " + randomNums[i]);
        }
    }
}

