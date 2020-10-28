package moving.domain.logic;
import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;
    private List<Box> boxy;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        boxy = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things) {
        Box box = new Box(boxesVolume);

        for (Thing item : things) {
            if (box.addThings(item)) {

            } else {
                boxy.add(box);
                box = new Box(this.boxesVolume);
                box.addThings(item);
            }
        }
        boxy.add(box);
        return boxy;
    }
}