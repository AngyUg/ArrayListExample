import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String menU;
        boolean theEnd = false;

        List<String> list = new ArrayList();
        list.add("15");
        Scan scan = new Scan();
        Menu menu = new Menu();

        menu.mainMenu();

        scan.readConsoleValue().equalsIgnoreCase("c");
        {
            System.out.println("enter value to add in our collection: ");
            list.add(scan.readConsoleValue());
            System.out.println(list + "- new value in collection and hashCode is: " + list.hashCode());
        }

        scan.readConsoleValue().equalsIgnoreCase("r");
        {
            System.out.println("Read our collection: ");
            System.out.println(list + "- new value in collection and hashCode is: " + list.hashCode());
        }

        scan.readConsoleValue().equalsIgnoreCase("d");
        {
            list.clear();
            System.out.println(list + " - elements of collection deleted and hashCode is: " + list.hashCode());



        }


    }
}