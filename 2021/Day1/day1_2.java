package Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class day1_2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("2021\\Day1\\input.txt"));
        int prevInt = 0;
        int counter = 0;
        for (int i = 0; i <lines.size()-3; i++) {
            if (Integer.parseInt(lines.get(i)) < Integer.parseInt(lines.get(i+3))) counter++;
        }
        System.out.println(counter);
    }
}
