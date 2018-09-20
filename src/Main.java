import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        List<String> list = new ArrayList<>();
       // list.add("15");

//        menu.mainMenu();
//        menu.addCollection((ArrayList<String>) list);
//        System.out.println( menu.readCollection((ArrayList<String>) list));
//        menu.updateCollection((ArrayList<String>) list);
//        menu.deleteCollection((ArrayList<String>) list);

        while (!menu.theEnd){
            menu.mainMenu();
            list=menu.routeCollection((ArrayList<String>) list);
        }


    }
}