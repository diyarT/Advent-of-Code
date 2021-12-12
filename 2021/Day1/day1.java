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
        int counter = 0;
        for (int i = 0; i < lines.size() - 1 ; i++) {
            if (Integer.parseInt(lines.get(i)) < Integer.parseInt(lines.get(i+1))) counter++;
        }
        System.out.println(counter);
    }
}
