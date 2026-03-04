import java.util.Scanner;
public class javQ8a {
    public static void main(String[] args)
     {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();

        int a = 1;
        int b = 0;

        for (int i = 1; i <= n; i=i+1) {
            System.out.print(a + " ");
            a = a + b;
            b = b + 1;
        }

        in.close();
    }
    
}
