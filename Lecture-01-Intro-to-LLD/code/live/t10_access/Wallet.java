package t10_access;

class Wallet {
    private double balance;

    private void setBalance(double balance){
        if(balance >= 0){
        this.balance = balance;
        }
    }
    public double getBalance() {
        return balance;
    }


}