package localvariables;

public class Distance {

    public Distance(double distanceInKm, boolean exact){
        this.distanceInKm = distanceInKm;
        this.exact = exact;
    }

    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public void setExact(boolean exact) {
        this.exact = exact;
    }

    public double distanceInKm;
    public boolean exact;
}
