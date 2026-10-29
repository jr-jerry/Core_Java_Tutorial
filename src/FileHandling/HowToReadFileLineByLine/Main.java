package FileHandling.HowToReadFileLineByLine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        String fileLocation1="./directory/SearchFile1.txt";
        String fileLocation2="./directory/SearchFile2.txt";
        String searchName="java";

        Runnable readFile2Task=()->{
            try (BufferedReader br = new BufferedReader(new FileReader(fileLocation2))) {
                int lineNumber=1;
                String line;
                while ((line = br.readLine()) != null) {

                    if(line.contains(searchName)){
                        System.out.println("Java in line "+lineNumber+" By Thread "+Thread.currentThread().getName()+" File 2 " );
                    }
                    lineNumber++;

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };
        Runnable readFile1=()-> {
            try (BufferedReader br = new BufferedReader(new FileReader(fileLocation1))) {
                int lineNumber=1;
                String line;
                while ((line = br.readLine()) != null) {

                    if(line.contains(searchName)){
                        System.out.println("Java in line "+lineNumber+" By Thread "+Thread.currentThread().getName()+" File 1 ");
                    }
                    lineNumber++;

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        };

        Thread readThread2=new Thread(readFile2Task);
        Thread readFile1Thread=new Thread(readFile1);
        readFile1Thread.start();
        readThread2.start();
    }
}
