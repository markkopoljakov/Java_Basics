package mooc.ui.logic;
import mooc.ui.UserInterface;

public class ApplicationLogic{
private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    public void execute(int howMany) {
        int i = 0;
        while (i < howMany) {
            System.out.println("Application logic works!");
            i++;
            ui.update();
        }
    }
}
