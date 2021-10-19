package localvariables;

public class Distance {

    public Distance(double distance, boolean accuracy){
        this.distanceMeter = distanceMeter;
        this.accuracy = accuracy;
    }

    public void setDistance(double distance) {
        this.distanceMeter = distance;
    }

    public void setAccuracy(boolean accuracy) {
        this.accuracy = accuracy;
    }

    public double distanceMeter;
    public boolean accuracy;
}
