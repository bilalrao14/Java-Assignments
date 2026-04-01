import java.util.Scanner;
public class Binary_program {

    // Part (b) 
    public static int[] binaryArray(int num) {

        String binary = Integer.toBinaryString(num);
        int[] arr = new int[binary.length()];

        for (int i = 0; i < binary.length(); i++) {
            arr[i] = binary.charAt(i) - '0';
        }

        return arr;
    }

    // Part (c)
    public static String binaryString(int num) {
        return Integer.toBinaryString(num);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // Part (a)
        System.out.println("Binary Number: " + Integer.toBinaryString(num));

        // Part (b)
        int[] result = binaryArray(num);
        System.out.print("Binary Array: ");
        for(int i : result) {
            System.out.print(i + " ");
        }

        // Part (c)
        System.out.println("\nBinary String: " + binaryString(num));
    }

    

}


