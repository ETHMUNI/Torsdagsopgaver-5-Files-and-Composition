package Task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {

    Scanner scan;
    public ArrayList<String> coffeeMenu = new ArrayList();

    public void loadMenuData() {
        File file = new File("src/Task2/coffees.txt");
        try {
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch(IOException e) {
            System.out.println("Filen findes ikke");
        }
    }
}
