public class LyyraCard_1 {
    private double balance;

    public LyyraCard_1(double balance) {
        this.balance = balance;
    }
    public double balance(){
        return this.balance;
    }
    public void getBalance(double amount){
        this.balance += amount;
    }
    public boolean pay(double amount){
        if (this.balance < 0) {
            return false;
        }else {
            this.balance -= amount;
            return true;
        }
    }
    public void loadMoney(double amount) {
        this.balance += amount;
    }



}
