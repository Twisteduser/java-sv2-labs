package introexceptionwritefiletestjunit4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Electricity {
    private List<String> streetList(){
        List<String> streets = new ArrayList<>();
        streets.add(LocalDate.now().toString());
        streets.add("Tétényi út");
        streets.add("Bécsi út");
        streets.add("Fehérvári út");
        return streets;
    }
    public void writeStreets(Path path){
        List<String> streets = streetList();
        try {
            Files.write(path, streets);
        }catch (IOException ioe){
            throw new IllegalStateException("Nem írható a fájl", ioe);
        }
    }
}
