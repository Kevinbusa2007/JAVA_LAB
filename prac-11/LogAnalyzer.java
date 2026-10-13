
import java.nio.file.*;
import java.util.*;

class LogAnalyzer {
    public static void main(String[] args) throws Exception {
        Files.write(Paths.get("log1.txt"),
            Arrays.asList("INFO Started", "ERROR Failed"));
        Files.write(Paths.get("log2.txt"),
            Arrays.asList("INFO Running", "ERROR Problem"));
        Files.write(Paths.get("log3.txt"),
            Arrays.asList("INFO Finished"));

        String[] files = {"log1.txt", "log2.txt", "log3.txt"};
        int lines = 0, errors = 0;

        for (String file : files) {
            Path p = Paths.get(file);

            for (String s : Files.readAllLines(p)) {
                lines++;
                if (s.contains("ERROR"))
                    errors++;
            }

            System.out.println(file + " size: " + Files.size(p));
        }

        System.out.println("Total lines: " + lines);
        System.out.println("Errors: " + errors);
    }
}
