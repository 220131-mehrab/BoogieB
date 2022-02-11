package BoogieB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class BoogieRepo {
    private List<String>  boogieBees = new ArrayList<>();
    //private File file;
    private InputStream file;

    public BoogieRepo(String filename) {
        this.boogieBees = new ArrayList<>();
        //this.file = new File("src/main/resources/" + filename);
        this.file = getClass().getClassLoader().getResourceAsStream(filename);
        load();
    }

    private void load() {
        Scanner scanner = new Scanner(this.file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            this.boogieBees.add(scanner.next());
        }
    }

    public List<String> getBoogieBees() {
        return boogieBees;
    }
}
