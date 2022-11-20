package by.it.avramchuk.tentacles.pattern.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestUsingLowerCaseIS{
    public static String path ="src/by/it/avramchuk/tentacles/pattern/decorator/test.txt";

    public static void main(String[] args) {

        int c;

        try(InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(path)))){

            while ((c = in.read()) >= 0){
                System.out.print((char) c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
