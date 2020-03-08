package ro.fasttracktit.curs14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReadFile {
   public List<Country> readCountry() throws FileNotFoundException {
       Scanner scanner = new Scanner(new FileReader("countries.txt"));
       List<Country> result =  new ArrayList<>();
       while (scanner.hasNextLine()){
           Country country= readContry(scanner.nextLine()) ;
           result.add(country);
       }
       return result;
   }

    private Country readContry(String line) {
        String[] tokens =line.split("[|]");
        return new Country(tokens[0], tokens[1],Long.parseLong(tokens[2]) ,Long.parseLong(tokens[3]));

    }
}
