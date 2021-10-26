package introconstructors;

public class TaskMain {
    public static void main(String[] args) {
        Task task = new Task("Tanulás", "JAVA házi megírása");

        task.start();
        task.setDuration(120);

        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());
        System.out.println("Start date: " + task.getStartDateTime());
        System.out.println("Duration: " + task.getDuration());
    }
}
