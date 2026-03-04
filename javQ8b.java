import java.util.Scanner;
public class javQ8b {
    public static void main(String[] args)
     {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int limit = in.nextInt();

        int a = 1;
        int b = 0;

        while (a <= limit) {
            System.out.print(a + " ");
            a = a + b;
            b = b + 1;
        }

        in.close();

    }
    
}
