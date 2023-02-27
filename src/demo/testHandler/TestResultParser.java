package demo.testHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestResultParser {

    public TestResult parse(String path) {
        return parse(Paths.get(path));
    }

    public TestResult parse(File file) {
        return parse(file.getPath());
    }

    public TestResult parse(Path path) {

        long allTest = 0;
        long successTest = 0;
        long failedTest = 0;
        long timeTest = 0;

        try (Scanner scanner = new Scanner(path)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains("[         ")) {
                    String[] parts = line.split("\\[         ");
                    String[] split = parts[1].split(" ", 2);
                    String count = split[0];
                    String type = split[1];
                    if (type.contains("tests found")) {
                        allTest = Long.parseLong(count);
                    } else if (type.contains("tests successful")) {
                        successTest = Long.parseLong(count);
                    } else if (type.contains("tests failed")) {
                        failedTest = Long.parseLong(count);
                    } else if (type.contains("tests time")) {
                        timeTest = Long.parseLong(count);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new TestResult(allTest, successTest, failedTest, timeTest);
    }
}