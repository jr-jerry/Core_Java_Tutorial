package FileHandling;

import java.io.File;

public class Main {
    static void main(String[] args) {
        File directoryFolder=new File("directory");
        if(directoryFolder.exists() && directoryFolder.isDirectory()){
            System.out.println("Directory folder exists ");

            File[] files = directoryFolder.listFiles();
            for (File file : files) {
                System.out.println(file.getName());
            }
        }
    }
}
