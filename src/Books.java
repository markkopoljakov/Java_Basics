public class Books implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    public Books(String writer, String name, double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }
    public double weight(){
        return this.weight;
    }
    public String toString(){
        String s="";
        s=s+this.writer+": ";
        s=s+this.name;
        return s;
    }
}