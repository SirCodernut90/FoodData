import java.util.ArrayList;

public class Dataset extends ArrayList<Record> {
    public Dataset() {
        super();
    }

    public boolean isSorted() {
        int i = 0;
        while (i < size() - 1) {
            if (get(i).compareTo(get(i+1)) == 1) {
                return false;
            }
            i++;
        }
        return true;
    }

    // least to greatest price
    public void sort() {
        while (!isSorted()) {
            for(int i = 0 ; i < size() - 1; i++) {
                int counter = 1;
                while ((i + counter < size()) && (get(i).compareTo(get(i + counter)) == 1)) {
                    counter++;
                }

                Record tmp = get(i);
                remove(i);
                add(i + counter - 1, tmp);
            }
        }
    }
    // finding the average price of a specific range of values (x to y)
    public double averagePrice(int x, int y) {
        System.out.print("The average price of the records from range ");
        System.out.print(x + ", to ");
        System.out.print(y + ", is ");
        double sum = 0;
        int counter = 0;
        if (y < size() && x < y) {
            for (int i = x; i < y; i++) {
                sum += get(i).price.getPrice();
                counter++;
            }
        }
        
        return (sum/counter);
    }
}
