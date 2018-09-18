import java.util.Scanner;

public class Menu {
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

    public boolean checkExit() {
        if (readConsoleValue().equalsIgnoreCase("exit")) {
            return true;
        } else {
            return false;
        }
    }

    protected String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}