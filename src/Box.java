import java.util.ArrayList;
public class Box implements ToBeStored {
    private double maxWeight;
    private double weight;
    private ArrayList<ToBeStored> list = new ArrayList<ToBeStored>();

    public Box(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
    }

    public void add(ToBeStored e) {
        if ((weight + e.weight()) < maxWeight) {
            weight = weight + e.weight();
            list.add(e);
        } else {
            System.out.println(e + " can't be added to this box.");
        }
    }

    public void add(Books book) {
        if ((weight + book.weight()) < maxWeight) {
            weight = weight + book.weight();
            list.add(book);
        } else {
            System.out.println(book + " can't be added to this box.");
        }
    }

    public void add(CD cd) {
        if ((weight + cd.weight()) < maxWeight) {
            weight = weight + cd.weight();
            list.add(cd);
        } else {
            System.out.println(cd + " can't be added to this box.");
        }
    }

    public void add(Box box) {
        if ((weight + box.weight()) < maxWeight) {
            weight = weight + box.weight();
            list.add(box);
        } else {
            System.out.println(box + " can't be added to this box.");
        }
    }

    public String toString() {
        String s = "Box: " + list.size() + " things, total weight " + weight + " kg";
        return s;
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored e : list) {
            weight = weight + e.weight();
        }
        return weight;
    }
}