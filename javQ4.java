import java.util.Scanner;
public class javQ4
{
    public static void main(String[] args) {
        System.out.println("Enter Number Of Rows");
        Scanner in=new Scanner(System.in);
        int rows= in.nextInt();
            for(int i =1;i<=rows; i=i+1)
            {
                
                for(int j = 1; j<i;j=j+1)
                {
                    System.out.print("*");

                }
                System.out.println();
                

            }
     in.close();
    }
}