package individualassinment;

import java.util.Scanner;

public class FylodaTriangle {
    public static void main(String[] args) {

        int numberOfRows;
        System.out.print("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        numberOfRows = sc.nextInt();

        int number = 1;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}