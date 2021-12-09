import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class DayOnePartOne {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("input_d1_p1.txt"));

        long result = IntStream.range(0, lines.size())
                .filter(i -> {
                    if (i + 1 == lines.size()) {
                        return false;
                    }

                    int numberOne = Integer.parseInt(lines.get(i));
                    int numberTwo = Integer.parseInt(lines.get(i + 1));

                    return numberOne < numberTwo;
                })
                .count();

        System.out.println(result);
    }
}