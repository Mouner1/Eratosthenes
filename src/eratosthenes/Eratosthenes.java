/*
 * Mouner Dabjan 
 * 3/3/2020
 * The purpose of this program is to use eratosthenes sieve to find the prime numbers between 1 and 1000
 */
package eratosthenes;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
            // declaring the array with 
            boolean numbers[] = new boolean[1001];
            // the array now will take only true values
            Arrays.fill(numbers, true);

            // Setting numbers 0 and 1 to false
            numbers[0] = false;
            numbers[1]=false; 
             // eliminating all the multiples of the numbers and setting them to false 
            for (int i = 2; i <= 1000; i++) {
                if (numbers[i]) {
                    for (int multiple = i * i; multiple < numbers.length; multiple += i) {
                        numbers[multiple] = false;
                    }
                }
            }

            // the output started
            System.out.print("The prime numbers from 1 - 1000 are:\n");

            // setting the start value 
            int start = 1;
            //checking if the number and the start value's modulus is equal to 0 or not- 
            // if both numbers have a modulus of 0 when divided by 10 the number is prime
            // and if both of them don't then they are prime as well 
            for (int i = 2; i < numbers.length; i++) {
                if (numbers[i] && start % 10 != 0) {
                    System.out.print(i + " ");
                    start++;
                } else if (numbers[i] && start % 10 == 0) {
                    System.out.print(i + "\n");
                    start++;
                }
            }

        }

    }
}
