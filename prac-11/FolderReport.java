
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

class FolderReport {
    public static void main(String[] args) throws Exception {
        Path folder = Paths.get("myfolder");
        Files.createDirectories(folder);
        Files.write(folder.resolve("test.txt"),
            java.util.Arrays.asList("Hello Java"));

        try (PrintWriter out = new PrintWriter("report.txt")) {
            try (java.util.stream.Stream<Path> paths = Files.walk(folder)) {
                paths.filter(Files::isRegularFile).forEach(p -> {
                    try {
                        BasicFileAttributes a =
                            Files.readAttributes(p, BasicFileAttributes.class);

                        String s = p.getFileName() + " | Size: " +
                            a.size() + " bytes | Modified: " +
                            a.lastModifiedTime();

                        System.out.println(s);
                        out.println(s);
                    } catch (IOException e) {
                        System.out.println("Cannot read file");
                    }
                });
            }
        }

        System.out.println("Report saved");
    }
}
