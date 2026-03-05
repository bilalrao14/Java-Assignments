import java.util.Scanner;

public class magic_box {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = in.nextInt();

        if (rows != cols || rows % 2 == 0) {
            System.out.println("Magic box only works for odd square matrix.");
            return;
        }

        int n = rows;
        int[][] magic = new int[n][n];

        int i = 0;
        int j = n / 2;

        for (int num = 1; num <= n * n; num++) {

            magic[i][j] = num;

            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) {
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }
        }

        System.out.println("\nMagic Box Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(magic[i][j] + "\t");
            }
            System.out.println();
        }

        int forwardDiagonal = 0;
        int reverseDiagonal = 0;

        for (i = 0; i < n; i++) {
            forwardDiagonal += magic[i][i];
            reverseDiagonal += magic[i][n - 1 - i];
        }

        System.out.println("\nForward Diagonal Sum: " + forwardDiagonal);
        System.out.println("Reverse Diagonal Sum: " + reverseDiagonal);
    }
}