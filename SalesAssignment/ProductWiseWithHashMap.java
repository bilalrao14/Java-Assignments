import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class ProductWiseWithHashMap {
    public static void main(String[] args) {
        File file = new File("SalesEVESession.txt");

        HashMap<String, Double> hm = new HashMap<String, Double>();

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

                String productName = parts[1];
                double unitPrice = Double.parseDouble(parts[2]);
                double qty = Double.parseDouble(parts[3]);
                double amount = unitPrice * qty;

                if (hm.containsKey(productName)) {
                    double oldAmount = hm.get(productName);
                    hm.put(productName, oldAmount + amount);
                } else {
                    hm.put(productName, amount);
                }
            }

            inp.close();
        } catch (Exception e) {
            System.out.println("Error in reading file");
        }

        System.out.println("---------------");

        for (Map.Entry<String, Double> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }
    }
}