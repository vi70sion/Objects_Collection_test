import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Objektas objektas1 = new Objektas("Pvadinimas1","Aprasymas1", 100);
        Objektas objektas2 = new Objektas("Pvadinimas2","Aprasymas2", 101);

        ArrayList<Objektas> list = new ArrayList<>();
        list.add(objektas1);
        list.add(objektas2);

        System.out.println(list.get(0));

        list.get(0).setParamID(102);

        System.out.println(list.get(0));

    }


}