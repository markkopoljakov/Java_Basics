public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareM;

    public Apartment(int rooms, int squareMeters, int pricePerSquareM) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareM = pricePerSquareM;
    }

    public boolean larger(Apartment compared) {
        return this.squareMeters>compared.squareMeters;
    }
    private int price() {
        return pricePerSquareM*squareMeters;
    }
    public int priceDifference(Apartment compared) {
        return Math.abs(this.price()-compared.price());
    }
    public boolean moreExpensive(Apartment compared) {
        return this.price()>compared.price();
    }



}
