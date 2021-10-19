package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(177.42,true);
        System.out.println(distance.distanceInKm + ", "+ distance.exact);
        int isExact = (int) distance.distanceInKm;
        System.out.println(isExact);
    }
}
