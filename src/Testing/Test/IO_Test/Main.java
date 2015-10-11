package Testing.Test.IO_Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

/**
 * Created by iantaman on 09.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        InputStreamExam inputStreamExam = new InputStreamExam("C:\\Users\\iantaman\\Desktop\\notnew1.txt");
//        try {
//            inputStreamExam.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        RandomAccessFile file = null;
        try {
            file = new RandomAccessFile("C:\\Users\\iantaman\\Desktop\\notnew1.txt", "rw");

            String st = "Lalalala";
            file.seek(100);//указатель где мы работаем с записями
            file.write(st.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    }


