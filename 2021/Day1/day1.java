package Day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class day1 {

    public static void main(String[] args) throws IOException {
        List<String> lines  = Files.readAllLines(Paths.get("2021\\Day1\\input.txt"));
        int prevInt = 0;
        int counter = 0;
        for (String line : lines) {
            if (prevInt < Integer.parseInt(line)){
                counter++;
            }
            prevInt = Integer.parseInt(line);
        }
        System.out.println(counter-1);
    }
}
