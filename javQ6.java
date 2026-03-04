import java.util.Scanner;
public class javQ6
 {
    public static void main(String[] args)
     {
        System.err.println("Enter Number of Rows");
         Scanner in =new Scanner(System.in);
        int rows= in.nextInt();
            for(int i =rows;i>=1; i=i-1)
            {
                for(int j = 1;j<=i;j=j+1)
                {
                    System.out.print("*");

                }
                System.out.println();
            }
    }
}