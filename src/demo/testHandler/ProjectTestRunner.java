package demo.testHandler;

import org.junit.platform.console.ConsoleLauncher;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectTestRunner {

    private Date date = new Date();
    private long time = date.getTime();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
    private String format = dateFormat.format(date);

    public void startTestPack(String packageName) {
        PrintWriter printWriter = new PrintWriter(System.out);
        try (FileWriter fileWriter = new FileWriter(
                String.format("%s_%s_%d.txt", packageName, format, (int) (Math.random() * 1000)));
             PrintWriter printWriterFile = new PrintWriter(fileWriter)) {
            ConsoleLauncher.execute(printWriter, printWriter, "-p" + packageName);
            ConsoleLauncher.execute(printWriterFile, printWriterFile,
                    String.format("--select-package=%s", packageName),
                    "--details=summary", "--disable-banner");

            printWriterFile.println(String.format("[         %d tests time]\n[    %s ]", time, date));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startTests(String name) {
        PrintWriter printWriter = new PrintWriter(System.out);
        try (FileWriter fileWriter = new FileWriter(
                String.format("%s_%s_%d.txt", name, format, (int) (Math.random() * 1000)));
             PrintWriter printWriterFile = new PrintWriter(fileWriter)) {
            ConsoleLauncher.execute(printWriter, printWriter, "-c" + name);
            ConsoleLauncher.execute(printWriterFile, printWriterFile,
                    "-c" + name,
                    "--details=summary", "--disable-banner");

            printWriterFile.println(String.format("[         %d tests time]\n[    %s ]", time, date));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void startTests(Class<?> clazz) {
        startTests(clazz.getName());
    }

    public void startTests(Class<?>... classes) {
        for (Class<?> clazz : classes) {
            startTests(clazz.getName());
        }
    }

    public void startTests(String... names) {
        for (String name : names) {
            startTests(name);
        }
    }
}