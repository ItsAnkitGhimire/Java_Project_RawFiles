
import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] matrixSum = new int[3][3];
        System.out.println("Enter the value of first matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the value of second matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixSum[i][j] + "\t");
            }
            System.out.println(" ");
        }
        in.close();
    }
}

