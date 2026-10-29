package Project.MultipleReadSearch;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    static void main(String[] args) {
        File filesDirectory = new File("directory");

        if (filesDirectory.exists() && filesDirectory.isDirectory()) {
            System.out.println("Directory exists and is directory");

            File[] files = filesDirectory.listFiles();//[SearchFile1.txt,SearchFile2.txt,SearchFile3.txt]
            List<Future<String>> futures=new ArrayList<>(files.length);

            ExecutorService executorService= Executors.newFixedThreadPool(3);

            for(File file:files){
               Future<String> foundLineNumber= executorService.submit(()->{
                    return new ResourceFile(file,"java").readFile();
                });
               futures.add(foundLineNumber);
            }
            System.out.println("All search start ! ");

            for (Future<String> future : futures) {
                try {
                    System.out.println(future.get());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (ExecutionException e) {
                    throw new RuntimeException(e);
                }
            }

            executorService.shutdown();
        }
    }
}
class ResourceFile{
    private File file;
    private String searchWord;

    public ResourceFile(File file,String searchWord) {
        this.file = file;
        this.searchWord = searchWord;
    }
    public String readFile(){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            int lineNumber = 0;
            String completeLineString = "";

            while ((completeLineString=bufferedReader.readLine()) != null) {


                if (completeLineString.contains(this.searchWord)) {
                    return "Line Number " +lineNumber+" file: "+file.getName()+" Thread : "+Thread.currentThread().getName();
                }
                lineNumber++;
            }
            return "not Found in File "+file.getName();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
