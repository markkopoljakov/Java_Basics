public class CashRegister {
    private double cashInRegister;
    private int economicalSold;
    private int gurmetSold;
    private double economicalLunch;
    private double gurmetLunch;

    public CashRegister(double cashInRegister){
        this.cashInRegister = 1000;
    }
    public double payEconomically(double cashGiven){
        this.economicalLunch = 2.5;
        if (cashGiven < economicalLunch) {
            return cashGiven;
        }
        this.cashInRegister += economicalLunch;
        this.economicalSold++;
        return cashGiven - this.economicalLunch;

        }
        public double payGurmet(double cashGiven) {
        this.gurmetLunch = 4.00;
        if (cashGiven < gurmetLunch) {
            return cashGiven;
        }
        this.cashInRegister += gurmetLunch;
        this.gurmetSold++;
        return cashGiven - this.gurmetLunch;
    }
    public boolean payEconomically(LyyraCard_1 card) {
        if (card.balance() < economicalLunch) {
            return false;
        }
        card.pay(economicalLunch);
        this.economicalSold++;
        return true;
    }
    public boolean payGurmet(LyyraCard_1 card) {
        if (card.balance() < gurmetLunch) {
            return false;
        }

        card.pay(gurmetLunch);
        this.gurmetSold++;
        return true;
    }

    public void loadMoneyToCard(LyyraCard_1 card, double sum) {
        if (sum < 0) {
            return;
        }

        card.loadMoney(sum);
        this.cashInRegister += sum;
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gurmetSold;
    }

}
