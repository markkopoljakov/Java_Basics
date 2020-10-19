public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    public CD(String artist, String title, int publishingYear){
        this.artist=artist;
        this.title=title;
        this.publishingYear=publishingYear;
    }
    public double weight(){
        return 0.1;
    }
    public String toString(){
        String s="";
        s=s+this.artist+": ";
        s=s+this.title+" (";
        s=s+this.publishingYear+")";
        return s;
    }
}