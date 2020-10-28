import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private Scanner r;
    private File file;
    public Printer(String filename) throws Exception {
        this.file = new File(filename);

    }
    public void printLinesWhichContain(String word) throws FileNotFoundException {
    r = new Scanner(this.file);
    while (r.hasNextLine()) {
        String s = r.nextLine();
        if (s.contains(word)){
            System.out.println(s);
        }
    }
    r.close();
    }
}
