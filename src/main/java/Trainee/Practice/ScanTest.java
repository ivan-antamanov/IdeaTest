package main.java.Trainee.Practice;

import java.io.ByteArrayInputStream;

/**
 * Created by iantaman on 30.09.2015.
 */
public class ScanTest {

    public static void main(String[] args) {
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);

        System.setIn(System.in);


    }
}