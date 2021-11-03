package formatlocaleprintf;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Run {
    private List<Double> kms;
    private String name;

    public String getName() {
        return name;
    }

    public List<Double> getKms() {
        return kms;
    }

    public Run(String name) {
        this.name = name;
        this.kms = new ArrayList<>();
    }

    public void addRun(double km){
        kms.add(km);
    }

    public void printFormattedRunText(){
        LocalDate localDate = LocalDate.now();
        int day = kms.size();
        String s = String.format("Kedves %s! A mai dátum: %s. Ezen a héten ez a(z) %d futásod.",getName(),localDate.toString(),day);
        System.out.println(s);
        double lastKms = getKms().get(kms.size()-1);
        String s2 = String.format("Most %.2f km-t futottál. Csak így tovább!",lastKms);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        Run run = new Run("Forest Gump");
        run.addRun(13.5);
        run.printFormattedRunText();
        run.addRun(24.9);
        run.printFormattedRunText();
    }
}
