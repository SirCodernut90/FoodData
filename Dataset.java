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
}
