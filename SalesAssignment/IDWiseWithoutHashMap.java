import java.io.File;
import java.util.Scanner;

class IDWiseWithoutHashMap {
    public static void main(String[] args) {
        File file = new File("SalesEVESession.txt");

        String ids[] = new String[50];
        double totals[] = new double[50];

        int count = 0;

        try {
            Scanner inp = new Scanner(file);

            String line = inp.nextLine();
            System.out.println(line);

            while (inp.hasNextLine()) {
                line = inp.nextLine();

                if (line.length() == 0) {
                    break;
                }

                System.out.println(line);

                String parts[] = line.split("\t");

                String repId = parts[5];
                double unitPrice = Double.parseDouble(parts[2]);
                double qty = Double.parseDouble(parts[3]);
                double amount = unitPrice * qty;

                int found = -1;

                for (int i = 0; i < count; i++) {
                    if (ids[i].equals(repId)) {
                        found = i;
                        break;
                    }
                }

                if (found == -1) {
                    ids[count] = repId;
                    totals[count] = amount;
                    count++;
                } else {
                    totals[found] = totals[found] + amount;
                }
            }

            inp.close();
        } catch (Exception e) {
            System.out.println("Error in reading file");
        }

        System.out.println("---------------");

        for (int i = 0; i < count; i++) {
            System.out.println(ids[i] + "---" + totals[i]);
        }
    }
}