package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<String> readFile(){
        try {
            return Files.readAllLines(Paths.get("src/test/resources/books.txt"));
        }catch (IOException ioe){
            throw new IllegalStateException("Nem olvasható a fájl", ioe);
        }
    }
    private void writeFile(Path path, List<String> readable){
        try {
            Files.write(path, readable);
        }catch (IOException ioe){
            throw new IllegalStateException("Nem írható a fájl", ioe);
        }
    }
    public void writeBook(Path path){
        List<String> books = readFile();
        List<String> readable = new ArrayList<>();
        for (String s: books){
            String[] temp = s.split(";");
            readable.add(temp[2]+": "+temp[1]);
        }
        writeFile(path,readable);
    }
}
