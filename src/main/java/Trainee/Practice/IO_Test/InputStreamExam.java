package main.java.Trainee.Practice.IO_Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by iantaman on 09.10.2015.
 */
public class InputStreamExam {

    private InputStream inputStream;
    private static Path path;

    public InputStreamExam(String path) {
        this.path = Paths.get(path);

    }

    public void read() throws IOException {
        inputStream = new FileInputStream(String.valueOf(path));

        int data = inputStream.read();
        char content;

        while (data != -1) {
            data = inputStream.read();
            content = (char) data;
            System.out.print(content);

        }
        inputStream.close();

    }

    public static Path getPath() {
        return path;
    }
}
