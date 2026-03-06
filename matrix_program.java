import java.util.Scanner;

public class matrix_program {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Dimension of Matrix: ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];

        
        System.out.println("Enter Matrix Elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        
        System.out.println("\nSum of each Row:");
        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + " Sum = " + rowSum);
        }

        
        System.out.println("\nSum of each Column:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < n; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum = " + colSum);
        }

        
        int DiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            DiagonalSum += matrix[i][i];
        }
        System.out.println("\nDiagonal Sum = " + DiagonalSum);

        
        int reverseDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            reverseDiagonalSum += matrix[i][n - 1 - i];
        }
        System.out.println("Reverse Diagonal Sum = " + reverseDiagonalSum);

        in.close();
    }
}