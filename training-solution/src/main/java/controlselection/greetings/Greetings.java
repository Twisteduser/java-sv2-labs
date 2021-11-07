package controlselection.greetings;

public class Greetings {
    public String greeting(int hour, int minutes){
        int timeInMinutes = hour*60+minutes;
        if (timeInMinutes<=5*60 || timeInMinutes > 20*60){
            return "jó éjt";
        } else if (timeInMinutes>5*60 && timeInMinutes <=9*60) {
            return "jó reggelt";
        } else if (timeInMinutes>9*60 && timeInMinutes <= 18*60+30) {
            return "jó napot";
        }
        else {
            return "jó estét";
        }
    }

    public static void main(String[] args) {
        Greetings greetings = new Greetings();
        System.out.println(greetings.greeting(4,30));
    }
}
