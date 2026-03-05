import java.util.Scanner;

public class Cp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] population = new int[100]; 
        int count = 0;
        int total = 0;

        System.out.println("Enter Population Values :");

        while (true) {
            int value = in.nextInt();

            if (value < 0) {
                break;
            }

            population[count] = value;
            total = total + value;
            count = count + 1;
        }

        System.out.println("Total Population: " + total);
        double average = (double) total / count;
        System.out.println("Average Population: " + average);
        System.out.println("Populations above average:");

        for (int i = 0; i < count; i = i + 1) {
            if (population[i] > average) {
                System.out.println(population[i]);
            }
        }
    }
}
