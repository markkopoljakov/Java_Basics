import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private final HashMap<String, String> dict;
    public Dictionary(){
        this.dict = new HashMap<String, String>();
    }
    public String Dictionary(String word) {
        String translated = this.dict.get(word);
        if (translated != null) {
            return translated;
        }
        return translated;
    }
    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }
    public int amountOfWords(){
      return  this.dict.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> translationList = new ArrayList<String>();

        for (String key : this.dict.keySet()){
            String value = this.dict.get(key);

            String toAddList = key + "=" + value;
            translationList.add(toAddList);
        }
        return translationList;
    }

}
