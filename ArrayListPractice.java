import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();

        names.add("Pornima");
        names.add("Sujal");
        names.add("Aditya");

        System.out.println(names);

        names.set(0, "Pooja");

        System.out.println(names);

        names.remove(1);
        System.out.println(names);
    }
}