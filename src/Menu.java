import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    boolean theEnd = false;

    public void mainMenu() {
        Scan scan = new Scan();
        System.out.println("Menu:\n" +
                "pls enter command\n" +
                "c - create\n" +
                "r- read\n" +
                "u - update\n" +
                "d - delete\n" +
                "exit - exit:)\n");

    }

    public ArrayList<String> routeCollection(ArrayList<String> list) {
        String command = readConsoleValue();

        if (command.equalsIgnoreCase("c")) {
            list = addCollection((ArrayList<String>)list);
        } else if (command.equalsIgnoreCase("r")) {
            list = readCollection(list);
        } else if (command.equalsIgnoreCase("u")) {
            list = updateCollection(list);
        } else if (command.equalsIgnoreCase("d")) {
            list = deleteCollection(list);
        } else if (command.equalsIgnoreCase("exit")) {
            System.out.println("If yes write 'exit' again");
            theEnd = checkExit();
        } else {
            System.out.println("упс, шось не те:)");
        }

        return list;
    }


    public boolean checkExit() {
        if (readConsoleValue().equalsIgnoreCase("exit")) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String> addCollection(ArrayList<String> list) {
 //       readConsoleValue().equalsIgnoreCase("c");
        System.out.println("enter value to add in our collection: ");
        list.add(readConsoleValue());
        System.out.println(list + "- our collection and hashCode is: " + list.hashCode());
        return list;
    }

    public ArrayList<String> readCollection(ArrayList<String> list) {
       // readConsoleValue().equalsIgnoreCase("r");
            System.out.println("Read our collection: "+list);
        return list;
    }

    public ArrayList<String> updateCollection(ArrayList<String> list) {
        System.out.println("First, enter index not longer then: "+(list.size()-1)+", then value to change element in collection");
        list.set(Integer.parseInt(readConsoleValue()), readConsoleValue());
        System.out.println(list + "- collection and hashCode is: " + list.hashCode());
        return list;
    }

    public ArrayList<String> deleteCollection(ArrayList<String> list) {
        System.out.println("Enter index to delete element in collection not longer then: "+(list.size()-1));
        list.remove(Integer.parseInt(readConsoleValue()));
        System.out.println(list + "- collection after deleted element");
        return list;
    }

    protected String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}