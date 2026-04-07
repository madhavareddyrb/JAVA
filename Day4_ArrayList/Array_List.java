import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nami");
        names.add("Luffy");
        names.add("Zoro");

        System.out.println(names.get(0));

        for (String name : names) {
            System.out.println(name);

        }
    }

}
