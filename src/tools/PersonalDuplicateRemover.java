package tools;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

    private final List<String> duplicate;
    private int count;

    public PersonalDuplicateRemover() {
    this.duplicate = new ArrayList<String>();
    this.count = 0;
    }
    @Override
    public void add(String characterStrings) {
    if (this.duplicate.contains(characterStrings)){
        count++;
        return;
    }
    this.duplicate.add(characterStrings);
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.count;
    }
    @Override
    public Set<String> getUniqueCharacterStrings() {
        Set<String> unique = new HashSet<String>();
        for (String s : this.duplicate) {
            if (!unique.contains(s)) {
                unique.add(s);
            }
        }
        return unique;
    }
    @Override
    public void empty() {
        //this.duplicate.remove(this.duplicate.get(index));
        this.duplicate.removeAll(duplicate);
        this.count = 0;
    }
}
