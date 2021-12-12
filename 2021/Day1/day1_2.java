package Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day1_2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("2021\\Day1\\input.txt"));
        List<Integer> sums = new ArrayList<>();
        int prevInt = 0;
        int counter = 0;
        for (int i = 0; i <lines.size()-2; i++) {
            int sum  = Integer.parseInt(lines.get(i)) + Integer.parseInt(lines.get(i+1)) +
                    Integer.parseInt(lines.get(i+2));

            sums.add(sum);
            if (prevInt < sum) counter++;
            prevInt = sum;
        }
        System.out.println(counter-1);
    }
}
