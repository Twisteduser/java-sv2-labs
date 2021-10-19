package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(177.42,true);
        System.out.println(distance.distanceMeter + ", "+ distance.accuracy);
        int egesz = (int) distance.distanceMeter;
        System.out.println(egesz);
    }
}
