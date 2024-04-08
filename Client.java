import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException{
    File mycsv = new File("data.csv");

    Scanner file = new Scanner(mycsv);


    //read the header information in line one
    String header = file.nextLine();
    String[] labels = header.split(",");

    //need to add a loop to go through the whole file and create Record objects.

    file.hasNext(); //returns true if there is more data or more content to scan in.

    String line = file.nextLine();
    String[] dataLine = line.split(",");

    }
    
}
