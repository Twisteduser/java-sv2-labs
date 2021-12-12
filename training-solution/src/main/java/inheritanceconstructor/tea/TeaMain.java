package inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea = new Tea("Earl grey",20);
        HerbalTea herbalTea = new HerbalTea("Kamilla",22);

        System.out.println(tea.getName());
        System.out.println(tea.getPrice());

        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
