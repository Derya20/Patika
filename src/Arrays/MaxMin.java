package Arrays;
import java.util.Arrays;

import java.util.Scanner;

/*
Finding closer minimum and closer maximum value with a given input

 */
public class MaxMin {
    /*
            int[] arr = { -5, 4, 78, 96, 25, 36, 12, 20, 32, 45, 12, 65, 98, 63, 56, 95, 15, 72, 256 -56, 0, -32};
            int min= arr[0]; // temporary
            int max= arr[0]; //temporary

            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }

            System.out.println("Minimum değer: "+min);
            System.out.println("Maximum değer: "+max);

     */
    /*
        int[] arr = { 4, 3, 2, 1,0,-5,78 };

        // Outer loop
        for (int i = 0; i < arr.length; i++) {

            // Inner nested loop pointing 1 index ahead
            for (int j = i + 1; j < arr.length; j++) {

                // Checking elements
                int temp = 0;
                if (arr[j] < arr[i]) {

                    // Swapping
                    temp = arr[i];
                    arr[i] = arr[j];

                    arr[j] = temp;

                }


            }

            // Printing sorted array elements
            System.out.print(arr[i] + " ");
        }

 */

    public static void main(String[] args) {


        int[] arr = {15,12,788,1,-1,-778,2,0};
        int n = arr.length;
        int index = 0;
        int[] newArr = new int[n+1];
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sorgulamak İstediğiniz Değeri Giriniz:");
        int number = input.nextInt();

        for(int i = 0; i<newArr.length; i++) {
            if(i==index) {
                newArr[i] = number;
            }else {
                newArr[i] = arr[j];
                j++;
            }
        }
        Arrays.sort(newArr);
        System.out.println("Değerinizin listeye eklenmiş ve sıralanmış hali : "+Arrays.toString(newArr));

        for (int a = 0 ; a < newArr.length ; a++){
            if (newArr[a] == number) {
                System.out.println("Sayınızdan küçük en büçük değer :" + newArr[a-1]);
                System.out.println("Sayınızdan büyük en küçük değer : " + newArr[a+1]);
            }

        }


    }
    }
