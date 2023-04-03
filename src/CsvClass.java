import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CsvClass {

    private static String file = "C:\\Users\\WhiteFox\\IdeaProjects\\Main\\Baratheon.csv";;


    public static void csvMaker() throws Exception  {

        ArrayList<String[]> baratheonList = new ArrayList<>() ;
        String[] record;

        //parsing a CSV file into Scanner class constructor
        Scanner sc = new Scanner(new File(file));


        while (sc.hasNext())  //returns a boolean value
        {
            record = sc.nextLine().split(",");
            baratheonList.add(record);
        }
        System.out.println(baratheonList.toString());
        sc.close();  //closes the scanner


    }

    public static void isThere(){
        File csvFile = new File(file);
        if (csvFile.isFile()) {
            // create BufferedReader and read data from csv
            System.out.println("Its here");
        }

    }






}
