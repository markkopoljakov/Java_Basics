import java.util.Scanner;

public class TextUserInterface {
    private final Scanner reader;
    private final Dictionary dict;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dict = dictionary;
    }
    public void start(){
        startStatement();

        while(true){
            System.out.println("Statement: ");

            String input = reader.nextLine().trim();
            if (input.equalsIgnoreCase("add")){
                add();
            }else if (input.equalsIgnoreCase("translate")){
                translate();
            }else if (input.equalsIgnoreCase("quit")){
                System.out.println("Thanks for using!");
                break;
            }else {
                System.out.println("Unknown statement!");
            }
        }
    }
    public void startStatement(){
        System.out.println("Statement:");
        System.out.println("Add - adds a word pair to the dictionary");
        System.out.println("Translate - asks a word and prints its translation");
        System.out.println("Quit - quits the text user interface");
    }
    public void add(){
        System.out.println("In Finnish:");
        String finnishWord = reader.nextLine();
        System.out.println("Translate:");
        String englishWord = reader.nextLine();
        this.dict.add(englishWord,finnishWord);
    }
    public void translate(){
        System.out.println("Give me a word: ");
        String finnishWord = reader.nextLine();
        String key = dict.Dictionary(finnishWord);
        System.out.println("Translation: " + key);
    }
}
