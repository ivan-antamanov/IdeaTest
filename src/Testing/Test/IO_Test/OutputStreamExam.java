package Testing.Test.IO_Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by iantaman on 09.10.2015.
 */
public class OutputStreamExam {

    private OutputStream outputStream;

    public void write(String string) throws IOException {
        outputStream = new FileOutputStream(String.valueOf(InputStreamExam.getPath()));
        outputStream.write(string.getBytes());
        outputStream.close();
        byte[] bytes = string.getBytes();
        for (byte b: bytes){
            System.out.println(b);
        }
    }
}
