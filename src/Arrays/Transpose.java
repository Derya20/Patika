package Arrays;

import java.util.Scanner;

public class Transpose {

    public static void main(String[] args) {


        int col, row;
        Scanner scan=new Scanner(System.in);
        System.out.println("Let's create an array");
        System.out.println("Please enter number for column and row ");
        System.out.print("Column: ");
        col=scan.nextInt();
        System.out.print("Row: ");
         row=scan.nextInt();

        int [][] array = new int[10][10];



        System.out.println("Enter the elements of the matrices: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               array[i][j]=scan.nextInt();
            }

        }

        System.out.println("Matrices: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print( array[i][j] +" ");
            }

            System.out.println();
        }

        int [] [] trans= new int[10][10];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
               trans[j][i]=array[i][j];
            }

        }

        System.out.println("Transpose of the matrices: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print( trans[i][j] +" ");
            }

            System.out.println();
        }









    }
}
