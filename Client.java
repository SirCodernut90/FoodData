import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) throws IOException{

    ArrayList<Record> recordList = new ArrayList<Record>();
    
    File mycsv = new File("data.csv");

    Scanner file = new Scanner(mycsv);


    //read the header information in line one
    String header = file.nextLine();
    String header2 = file.nextLine();
    String[] labels = header.split(",");

    //need to add a loop to go through the whole file and create Record objects.

    int i = 0;

    while (file.hasNext()) { //returns true if there is more data or more content to scan in.
        i++;
        String line = file.nextLine();
        String[] dataLine = line.split(",");

        // DateCategorizer d = new DateCategorizer(dataLine[0].substring(5, 7), dataLine[0].substring(0, 5));
        // Location l = new Location(dataLine[1], dataLine[2], dataLine[3]);
        // Coordinates c = new Coordinates(dataLine[4], dataLine[5]);
        // Food f = new Food(dataLine[6], dataLine[7]);
        // PriceDetails pd = new PriceDetails(dataLine[8], dataLine[9], dataLine[10]);
        // Price p = new Price(dataLine[12], dataLine[13]);
        Record r = new Record(Integer.parseInt(dataLine[0].substring(5, 7)), Integer.parseInt(dataLine[0].substring(0, 4)), dataLine[1], dataLine[2], dataLine[3], 
                              dataLine[4] != null && !dataLine[4].isBlank() ? Double.parseDouble(dataLine[4]) : 0d, 
                              dataLine[5] != null && !dataLine[5].isEmpty()? Double.parseDouble(dataLine[5]) : 0d, dataLine[6], dataLine[7], dataLine[8], dataLine[9], dataLine[10], 
                              Double.parseDouble(dataLine[12]), Double.parseDouble(dataLine[13]));
        recordList.add(r);
        // System.out.println(i);

    }

    System.out.println("The format of each row is: " + Arrays.toString(labels));
    System.out.println(recordList.get(0));
    System.out.println(recordList.get(1));

    }
    
}
