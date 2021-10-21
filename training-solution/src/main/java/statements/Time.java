package statements;

public class Time {
    private int hour;
    private int minutes;
    private int seconds;

    public Time(int hour, int minutes, int seconds){
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getInMinutes(){
        return (hour * 60) + minutes;
    }

    public int getInSeconds(){
        return (hour * 3600) + (minutes * 60) + seconds;
    }

    public boolean earlierThan(Time newTime){
        boolean bool = this.getInSeconds() < newTime.getInSeconds();
        return  bool;
    }

    public String toString(){
        return hour + ":" + minutes + ":" + seconds;
    }
}
