import java.util.Random;

public class PasswordRandomizer {
    private Random random = new Random();
    private int length;


    public PasswordRandomizer(int length) {
        this.length = length;

    }
    public String createPassword() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int numberOfCharacters = this.length;

        while (numberOfCharacters > 0) {
            int psw = this.random.nextInt(characters.length());
            char c = characters.charAt(psw);
            password = password +c;
            numberOfCharacters--;
        }
        return password;
    }

}
