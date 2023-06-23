package Collections.learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewCSV {
    public static void main(String[] args)  throws FileNotFoundException{

        String[] testdata = {"C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2012short.csv","C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2013short.csv"
                ,"C:\\Users\\nikhi\\OneDrive\\Desktop\\testing\\yob2014short.csv"};
        for (String filepath:testdata
             ) {
        Scanner scanner = new Scanner(new File(filepath));
        scanner.useDelimiter(" , ");
            while (scanner.hasNext()){
                System.out.println(scanner.next());

        }
        scanner.close();
    }
}}
